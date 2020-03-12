package mx.edu.utng.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name = "profesor")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numEmpleado;
	@Column
	private String nombre;
	@Column
	private String apellidos;
	@Column
	private String carrera;
	@Column
	private String especialidad;
	@ManyToOne
	@JoinColumn(name = "id_Ofi")
	private Oficina oficina;
	
	public Profesor() {
		super();
		// TODO Auto-==99ikgenerated constructor stub
	}

	
	public Profesor(Long numEmpleado, String nombre, String apellidos, String carrera, String especialidad,
			Oficina oficina) {
		super();
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.carrera = carrera;
		this.especialidad = especialidad;
		this.oficina = oficina;
	}


	public Long getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(Long numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Oficina getIdOf() {
		return oficina;
	}

	public void setIdOf(Oficina oficina) {
		this.oficina = oficina;
	}

	@Override
	public String toString() {
		return "Profesor [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", carrera="
				+ carrera + ", especialidad=" + especialidad + ", oficina=" + oficina + "]";
	}

	}
