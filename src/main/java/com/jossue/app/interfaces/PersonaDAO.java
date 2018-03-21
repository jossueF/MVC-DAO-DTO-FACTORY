package com.jossue.app.interfaces;

import java.util.List;

import com.jossue.app.model.Persona;

public interface PersonaDAO {

	public List<Persona> obtenerPersonas();
	public Persona obtenerPersona(Long id);
	public void insertarPersona(Persona persona);
	public void actualizarPersona(Persona persona, Long id);
	public void eliminarPersona(Long id);
}
