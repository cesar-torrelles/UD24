package com.UD24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.UD24.dto.empleado;
import com.UD24.service.empleadoServiceImpl;


@RestController
@RequestMapping("/api")
public class empleadoController {
	
	@Autowired
	empleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<empleado> listarempleados(){
		return empleadoServiceImpl.listarempleados();
	}
	
	//listar Clientes por campo nombre
		@GetMapping("/clientes/nombre/{nombre}")
		public List<empleado> listarClienteNombre(@PathVariable(name="nombre") String nombre) {
		    return empleadoServiceImpl.listarempleadoNombre(nombre);
		}
	
	
	@PostMapping("/empleados")
	public empleado salvarempleado(@RequestBody empleado empleado) {
		
		return empleadoServiceImpl.guardarempleado(empleado);
	}
	
	
	@GetMapping("/empleados/{id}")
	public empleado empleadoXID(@PathVariable(name="id") Long id) {
		
		empleado empleado_xid= new empleado();
		
		empleado_xid=empleadoServiceImpl.empleadoXID(id);
		
		//System.out.println("empleado XID: "+empleado_xid);
		
		return empleado_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public empleado actualizarempleado(@PathVariable(name="id")Long id,@RequestBody empleado empleado) {
		
		empleado empleado_seleccionado= new empleado();
		empleado empleado_actualizado= new empleado();
		
		empleado_seleccionado= empleadoServiceImpl.empleadoXID(id);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellido(empleado.getApellido());
		empleado_seleccionado.setDireccion(empleado.getDireccion());
		empleado_seleccionado.setDni(empleado.getDni());
		empleado_seleccionado.setFecha(empleado.getFecha());
		empleado_seleccionado.setTrabajo(empleado.getTrabajo());
		empleado_seleccionado.setSueldo(empleado.getSueldo());
		
		
		empleado_actualizado = empleadoServiceImpl.actualizarempleado(empleado_seleccionado);
		
		//System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarempleado(@PathVariable(name="id")Long id) {
		empleadoServiceImpl.eliminarempleado(id);
	}
	
	
	//listar empleados por campo trabajo
		@GetMapping("/empleados/trabajo/{trabajo}")
		public List<empleado> listarempleadoNombre(@PathVariable(name="trabajo") String trabajo) {
		    return empleadoServiceImpl.listarEmpleadoTrabajo(trabajo);
		}
	
}
