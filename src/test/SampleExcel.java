package test;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.excel.XlsDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;

public class SampleExcel {

    @Before
    public void setUp() throws Exception {

        // ①DBコネクション取得
    	Class.forName("com.mysql.jdbc.Driver");
        final String URL
        = "jdbc:mysql://localhost:3306/dbunit?serverTimezone=JST&useSSL=false";
        final String USER = "root";
        final String PASS = "root";
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sampledb","userid","password");
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        conn.setAutoCommit(false);
        IDatabaseConnection dbconn = new DatabaseConnection(conn);

        // ②Excel用データセット作成
        IDataSet dataset = new XlsDataSet(new File("dataset/sampletb.xlsx"));

        // ③データの全削除
        DatabaseOperation.DELETE_ALL.execute(dbconn, dataset);

        // ④データの挿入
        DatabaseOperation.INSERT.execute(dbconn, dataset);
    }

    @Test
    public void test() {
        // テストは省略
    }
}