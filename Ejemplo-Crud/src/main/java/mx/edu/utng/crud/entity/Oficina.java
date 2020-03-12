package mx.edu.utng.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "oficina")
public class Oficina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Ofi;
	@Column
	private String nombre;
	@Column
	private String edificio;
	public Oficina() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Oficina(Long id_Ofi, String nombre, String edificio) {
		super();
		this.id_Ofi = id_Ofi;
		this.nombre = nombre;
		this.edificio = edificio;
	}

	public Long getId() {
		return id_Ofi;
	}
	public void setId(Long id_Ofi) {
		this.id_Ofi = id_Ofi;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdificio() {
		return edificio;
	}
	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}
	@Override
	public String toString() {
		return "Oficina [id_Ofi=" + id_Ofi + ", nombre=" + nombre + ", edificio=" + edificio + "]";
	}

}
