package com.UD24.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD24.dao.empleadoDAO;
import com.UD24.dto.empleado;

@Service
public class empleadoServiceImpl implements empleadoService{
	
	//Utilizamos los metodos de la interface empleadoDAO, es como si instaciaramos.
	@Autowired
	empleadoDAO empleadoDAO;
	
	@Override
	public List<empleado> listarempleados() {
		
		return empleadoDAO.findAll();
	}

	@Override
	public empleado guardarempleado(empleado empleado) {
		
		return empleadoDAO.save(empleado);
	}

	@Override
	public empleado empleadoXID(Long id) {
		
		return empleadoDAO.findById(id).get();
	}
	

	@Override
	public empleado actualizarempleado(empleado empleado) {
		
		return empleadoDAO.save(empleado);
	}

	@Override
	public void eliminarempleado(Long id) {
		
		empleadoDAO.deleteById(id);
		
	}
	
	@Override
	public  List<empleado> listarEmpleadoTrabajo(String trabajo) {
		return empleadoDAO.findByTrabajo(trabajo);
	}

	@Override
	public List<empleado> listarempleadoNombre(String nombre) {
		// TODO Auto-generated method stub
		return empleadoDAO.findByNombre(nombre);
	}

}
