package com.jossue.app.main;

import com.jossue.app.model.PersonaFactory;
import com.jossue.app.vista.PersonaVista;

public class Main {

	public static void main(String[] args) {
		PersonaVista p = PersonaFactory.getPersonaVista();
		p.obtenerPersonas();
	}

}
