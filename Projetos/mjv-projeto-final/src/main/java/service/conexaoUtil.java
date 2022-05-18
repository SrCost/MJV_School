package service;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoUtil {
	
	public static Connection criarNovaConexao() {
		String url = "jdbc:mysql://localhost/db_mjv_projeto_final";
		Properties props = new Properties();
		props.setProperty("user","root");
		props.setProperty("password","root");
		try {
			Connection conn = DriverManager.getConnection(url, props);
			System.out.println("Conexao realizada com sucesso");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		//String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
		//Connection conn = DriverManager.getConnection(url);
	}
}
