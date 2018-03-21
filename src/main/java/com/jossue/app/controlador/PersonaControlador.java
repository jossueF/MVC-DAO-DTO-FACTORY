package com.jossue.app.controlador;

import java.util.List;

import com.jossue.app.model.Persona;
import com.jossue.app.model.PersonaDAOImpl;
import com.jossue.app.model.PersonaFactory;

public class PersonaControlador {

	private PersonaDAOImpl  personaImpl = PersonaFactory.getPersonaDAO();
	
	public void insertarPersona(Persona persona) {
		personaImpl.insertarPersona(persona);
	}
	
	public List<Persona> obtenerPersonas() {
		return personaImpl.obtenerPersonas();
	}
	
}
