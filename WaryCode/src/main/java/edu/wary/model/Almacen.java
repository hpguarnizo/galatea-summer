package edu.wary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_almacen")
public class Almacen {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAlm;
	private String bloque;
	private String area;
	private String seccion;
	private int idEnco;
	
	
	public int getIdEnco() {
		return idEnco;
	}
	public void setIdEnco(int idEnco) {
		this.idEnco = idEnco;
	}
	public int getIdAlm() {
		return idAlm;
	}
	public void setIdAlm(int idAlm) {
		this.idAlm = idAlm;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getBloque() {
		return bloque;
	}
	public void setBloque(String bloque) {
		this.bloque = bloque;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
}
