package test1;

import static org.junit.Assert.*;

import java.io.File;

import org.dbunit.Assertion;
import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.filter.DefaultColumnFilter;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import test.TestMain;

/**
 * [テストクラス]<br>
 * JUnitとDBUnitを使用してテストを行う。<br>
 * <br>
 * @author tarosa0001
 */
public class TestMainTest {
  /** ロガー */
  private Logger logger = LoggerFactory.getLogger(TestMain.class);

  /** DBUnitのテスター */
  private static IDatabaseTester databaseTester;

  /**
   * [前処理]<br>
   * DBに事前データを準備する。<br>
   * <br>
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    logger.info("前処理開始");

    // --------------------------------------
    // 事前準備データのINSERT
    // --------------------------------------
    // 事前準備データのINSERTにはスキーマも合わせて指定する
    databaseTester = new JdbcDatabaseTester("com.mysql.jdbc.Driver",
        "jdbc:mysql://localhost:3306/dbunit?serverTimezone=JST&useSSL=false", "root", "root");

    // --------------------------------------
    // テストデータ投入
    // --------------------------------------
    IDataSet dataSet = new FlatXmlDataSetBuilder().build(new File("./data/Before.xml"));
    databaseTester.setDataSet(dataSet);
    // DELETE→INSERTで事前準備データを用意する
    databaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
        databaseTester.onSetup();

    logger.info("前処理終了");
  }

  /**
   * [後処理]<br>
   * テスト後の後処理を行う。<br>
   * DBUnitの後片付けを行う。<br>
   * <br>
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
    databaseTester.setTearDownOperation(DatabaseOperation.NONE);
    databaseTester.onTearDown();
  }

  /**
   * [テスト]<br>
   * DBUnitを使用して、DBの更新結果を検証する。<br>
   */
  @Test
  public void test() {
    logger.info("JUnit + DBUnitによるテスト開始。");

    TestMain.main(null);

    try {
      // ----------------------------------
      // DBUnitで更新後データチェック
      // ----------------------------------
    	//テーブルに初期化用のデータを投入する
      IDataSet expectedDataSet = new FlatXmlDataSetBuilder().build(new File("./data/After.xml"));
//    getTable  指定されたテーブルを返します。
      ITable expectedTable = expectedDataSet.getTable("EMP");

      // databaseTester DBUnitのテスター
      IDataSet databaseDataSet = databaseTester.getConnection().createDataSet();
      ITable actualTable = databaseDataSet.getTable("EMP");

      // 時間に対するAssertionはほぼ確実に失敗するので検証対象から除外する
      ITable filteredExpectedTable = DefaultColumnFilter.excludedColumnsTable(
          expectedTable, new String[]{"HIREDATE"});
      ITable filteredActualTable;
      filteredActualTable = DefaultColumnFilter.excludedColumnsTable(
          actualTable, new String[]{"HIREDATE"});

      // ---------------------------------------------------------------
      // 更新結果の検証はJUnitではなくDBUnitのAssertionを使用する
      // ---------------------------------------------------------------
      Assertion.assertEquals(filteredExpectedTable, filteredActualTable);
    } catch (Exception e) {
      logger.error("エラー", e);
      fail("予期しないエラーでテストが失敗しました。");
    }

    logger.info("JUnit + DBUnitによるテスト開始。");
  }
}