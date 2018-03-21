package com.jossue.app.model;

import com.jossue.app.controlador.PersonaControlador;
import com.jossue.app.vista.PersonaVista;

public class PersonaFactory {

	public static Persona getPersona() {
		return new Persona();
	}
	
	public static PersonaDAOImpl getPersonaDAO(){
		return new PersonaDAOImpl();
	}
	
	public static PersonaControlador getPersonaControlador() {
		return new PersonaControlador();
	}
	
	public static PersonaVista getPersonaVista() {
		return new PersonaVista();
	}
}
