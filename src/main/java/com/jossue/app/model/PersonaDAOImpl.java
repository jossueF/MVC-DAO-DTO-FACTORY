package com.jossue.app.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jossue.app.interfaces.PersonaDAO;

public class PersonaDAOImpl implements PersonaDAO{

	private Conexion conexionBD = Conexion.getInstance();
	
	@Override
	public List<Persona> obtenerPersonas() {
		List<Persona> listaPersonas = new ArrayList<>();
		conexionBD.conectar();
		try {
			PreparedStatement statement = conexionBD.conexion.prepareStatement("SELECT * FROM persona");
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				Persona persona = PersonaFactory.getPersona();
				persona.setId(result.getLong("id"));
				persona.setNombre(result.getString("nombre"));
				listaPersonas.add(persona);
			}
			result.close();
			statement.close();
			conexionBD.desconectar();
		} catch (SQLException e) {
			conexionBD.desconectar();
			e.printStackTrace();
		}
		return listaPersonas;
	}

	@Override
	public Persona obtenerPersona(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarPersona(Persona persona) {
		conexionBD.conectar();
		try {
			PreparedStatement statement = conexionBD.conexion.prepareStatement("INSERT INTO persona VALUES(?,?)");
			statement.setLong(1, persona.getId());
			statement.setString(2, persona.getNombre());
			statement.executeUpdate();
			statement.close();
			conexionBD.desconectar();
		} catch (SQLException e) {
			conexionBD.desconectar();
			e.printStackTrace();
		}
	}

	@Override
	public void actualizarPersona(Persona persona, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPersona(Long id) {
		// TODO Auto-generated method stub
		
	}

}
