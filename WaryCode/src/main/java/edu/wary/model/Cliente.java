package edu.wary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_Cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCod;
	private String tipo;
	private String sexo;
	private String provincia;
	private String distrito;
	private String direccion;
	private String nombre;
	private int razonSocial;
	private int ruc;
	private int telCel;
	private int dni;
	private int telFijo;
	public int getIdCod() {
		return idCod;
	}
	public void setIdCod(int idCod) {
		this.idCod = idCod;
	}
	
	
	
	public int getRuc() {
		return ruc;
	}
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}
	public int getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(int razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelCel() {
		return telCel;
	}
	public void setTelCel(int telCel) {
		this.telCel = telCel;
	}
	public int getTelFijo() {
		return telFijo;
	}
	public void setTelFijo(int telFijo) {
		this.telFijo = telFijo;
	}
	
	
	
	}

