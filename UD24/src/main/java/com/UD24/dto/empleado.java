package com.UD24.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Entity
@Table(name = "empleado") // en caso que la tabala sea diferente
public class empleado {

	enum Trabajo {
		ARQUITECTO(2300), INGENIERO(3300), ABOGADO(4000), INFORMATICO(4200);

		private Double sueldo;

		Trabajo(double sueldo){
				this.sueldo = sueldo;
			}

		Double getsueldo() {
			return this.sueldo;
		}

		static Double obtenersueldo(String trabajo) {
			boolean encontrado = false;
			Double sueldo = 0.0;
			List<Trabajo> lista = Arrays.asList(Trabajo.values());
			Iterator<Trabajo> it = lista.iterator();

			while (!encontrado && it.hasNext()) {
				Trabajo aux = it.next();
				if (aux.toString().compareToIgnoreCase(trabajo) == 0) {
					encontrado = true;
					sueldo = aux.getsueldo();
				}
			}

			return sueldo;
		}
	}

	// Atributos de entidad empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellido") // no hace falta si se llama igual
	private String apellido;
	@Column(name = "direccion") // no hace falta si se llama igual
	private String direccion;
	@Column(name = "dni") // no hace falta si se llama igual
	private int dni;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	private String trabajo;
	
	private Double sueldo;
	// Constructores

	public empleado() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param dni
	 * @param fecha
	 */
	public empleado(Long id, String nombre, String apellido, String direccion, int dni, Date fecha, String trabajo,
			Double sueldo) {
		// super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
		this.trabajo = trabajo;
		this.sueldo = Trabajo.obtenersueldo(trabajo);
	}

	// Getters y Setters

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", fecha=" + fecha + ", trabajo=" + trabajo + ", sueldo=" + sueldo + "]";
	}

	

}
