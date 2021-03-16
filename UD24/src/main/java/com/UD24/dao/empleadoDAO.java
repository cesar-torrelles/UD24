package com.UD24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.UD24.dto.empleado;

/**
 * 
 *
 */
public interface empleadoDAO extends JpaRepository<empleado, Long>{
	
	//Listar empleados or campo nombre
	public List<empleado> findByNombre(String nombre);
	
	//Listar Trabajadores por campo "trabajo"
	public List<empleado> findByTrabajo(String trabajo);
	
}
