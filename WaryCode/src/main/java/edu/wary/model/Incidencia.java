package edu.wary.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_incidencia")
public class Incidencia {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int idInc;
	 private String tipo;
	 private String descripcion;
	 private String fecha;
	 private String idEnco;
	 
	public int getId() {
		return idInc;
	}
	public void setIdInc(int idInc) {
		this.idInc = idInc;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getIdEnco() {
		return idEnco;
	}
	public void setIdEnco(String idEnco) {
		this.idEnco = idEnco;
	}
	 
}
