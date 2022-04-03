package test;

import java.sql.SQLException;

public class Example1 {

	public int execute(String str) {
		// TODO 自動生成されたメソッド・スタブ
		return Integer.parseInt(str);
	}
	

	public void execute2(String arg) {
		if (arg == null) {
			throw new IllegalArgumentException();
		}
	}
	
	public void execute3(String arg) {
		if (arg == null) {
			
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public String getValue() throws SQLException {
		throw new SQLException("message", "state", 123);
	}


}
