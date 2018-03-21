package com.jossue.app.vista;

import java.util.List;

import com.jossue.app.controlador.PersonaControlador;
import com.jossue.app.model.Persona;
import com.jossue.app.model.PersonaFactory;

public class PersonaVista {

	private PersonaControlador personaControlador = PersonaFactory.getPersonaControlador();
	
	public void insertarPersona(Persona persona) {
		personaControlador.insertarPersona(persona);
	}
	
	public void obtenerPersonas() {
		for(Persona p : personaControlador.obtenerPersonas()) {
			System.out.println("ID: " + p.getId() + "\tNombre: " + p.getNombre());
		}
	}
}
