package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DBUnitテストのmainを持つクラス。
 * @author tarosa0001
 */
public class TestMain {
  /** ロガー */
  private static Logger logger = LoggerFactory.getLogger(TestMain.class);

  /** 実行するSQL */
  private static final String SQL
      = " select "
      + "       id, name, age "
      + "   from "
      + "       member";

  /**
   * @param args
   */
  public static void main(String[] args) {
    logger.info("処理開始");

    // ---------------------------------
    // DBを更新する
    // ---------------------------------

    try{
      Class.forName("com.mysql.jdbc.Driver");

      final String URL
      = "jdbc:mysql://localhost:3306/dbunit?serverTimezone=JST&useSSL=false";
      final String USER = "root";
      final String PASS = "root";

      Connection conn = DriverManager.getConnection(URL, USER, PASS);
      PreparedStatement stmt = conn.prepareStatement(SQL);
      ResultSet rs = stmt.executeQuery();

      int count = 0;
      while(rs.next()){
    	  count++;
    }

      // 処理件数を表示する
      logger.info("処理件数:[" + count + "]");

    } catch(Exception e) {
      logger.error("エラー", e);
    }

    logger.info("処理終了");
  }
}