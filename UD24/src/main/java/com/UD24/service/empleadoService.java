package com.UD24.service;

import java.util.List;

/**
 * 
 *
 */
import com.UD24.dto.empleado;

public interface empleadoService {

	//Metodos del CRUD
	public List<empleado> listarempleados(); //Listar All 
	
	public empleado guardarempleado(empleado empleado);	//Guarda un empleado CREATE
	
	public empleado empleadoXID(Long id); //Leer datos de un empleado READ
	
	public List<empleado> listarempleadoNombre(String nombre);//Listar empleados por campo nombre
	
	public empleado actualizarempleado(empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void eliminarempleado(Long id);// Elimina el empleado DELETE
	
	public List<empleado> listarEmpleadoTrabajo(String trabajo);
	
}
