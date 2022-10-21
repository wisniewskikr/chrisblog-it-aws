package pl.kwi.aws.lambda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GreetingHandler implements RequestHandler<Object, String> {
	
	private static final String TEXT_COLUMN = "text";
	private final static String URL = "jdbc:mysql://greeting-schema.cemcpqadmsqz.eu-west-1.rds.amazonaws.com/greeting_database";
	private final static String USER = "admin";
	private final static String PASSWORD = "admin123";
	private final static String SQL = "SELECT * FROM GREETING";

	public String handleRequest(Object input, Context context) {
		
		String greetintgMessage = null;
		
		try {
			
			Connection connection = getConnection();
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery(SQL);
			while(results.next()) {
				greetintgMessage = results.getString(TEXT_COLUMN);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
        return greetintgMessage;
    }
	
	private Connection getConnection() throws SQLException {
		
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;
		
	}
	
}
