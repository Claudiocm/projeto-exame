package br.com.exames.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	private static ConexaoBD instance;
	private Connection connection;
	private String url = "jdbc:mysql://localhost:8080/";
	private String usuario = "root";
	private String senha = "$$$$";

	private ConexaoBD() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException ex) {
        	System.out.println("A conexão com o banco falhou! : " + ex.getMessage());
        }
    }

	public Connection getConnection() {
		return connection;
	}

	public static ConexaoBD getInstance() throws SQLException {
		if (instance == null) {
			instance = new ConexaoBD();
		} else if (instance.getConnection().isClosed()) {
			instance = new ConexaoBD();
		}

		return instance;
	}
}
