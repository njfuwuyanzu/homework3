package test;

import java.sql.SQLException;



import dao.impl.StudentDaoImpl;
import dao.impl.StudentDaoImpl2;
import dao.impl.UserDaoImpl;
import model.User;
import util.C3p0Util;
import util.DbcpUtil;

public class Test {
	public static void main(String[] args) throws SQLException {
		
			System.out.println(new UserDaoImpl().checkLogin(new User("zhangsan","123456")));
		
	}
}
