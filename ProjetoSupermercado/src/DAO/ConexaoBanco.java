package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {
	
	public static Connection ConexaoComBanco() {
		
		try {
			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermercado", "root", "root123");
		}
		catch (Exception erro) {
			throw new RuntimeException(erro);
		}
	}

}
