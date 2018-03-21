package com.jossue.app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/ejemplo";
	private static final String USER = "postgres";
	private static final String PASSWORD = "";
	
	protected Connection conexion = null;
	private static final Conexion CONEXIONINSTANCIA = new Conexion();
	
	private Conexion() {
		
	}
	
	public static Conexion getInstance() {
		return CONEXIONINSTANCIA;
	}
	
	public void conectar() {
		try {
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(URL,USER, PASSWORD);
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void desconectar() {
		try {
			if(conexion != null && (!conexion.isClosed())) {
				conexion.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
