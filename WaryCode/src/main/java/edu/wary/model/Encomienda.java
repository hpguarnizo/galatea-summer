package edu.wary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_encomienda")
public class Encomienda {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEnco;
	private String destino;
	private int tiempoAprox;
	private int peso;
	private int tarifaXdest;
	private int ancho;
	private int alto;
	private int largo;
	private int volumen;
	private int tarifaXemb;
	private String tipo;
	private int tarifaXtipo;
	private int costo;
	private String estado;
	private String claveEnvio;
	private String detalle;
	private int fechaReg;
	private int codRemi;
	private String bloque;
	private String area;
	private String seccion;
	
	public int getCodRemi() {
		return codRemi;
	}
	public void setCodRemi(int codRemi) {
		this.codRemi = codRemi;
	}
	public int getIdEnco() {
		return idEnco;
	}
	public void setIdEnco(int idEnco) {
		this.idEnco = idEnco;
	}
	public int getTarifaXemb() {
		return tarifaXemb;
	}
	public int getTiempoAprox() {
		return tiempoAprox;
	}
	public void setTiempoAprox(int tiempoAprox) {
		this.tiempoAprox = tiempoAprox;
	}
	public void setTarifaXemb(int tarifaXemb) {
		this.tarifaXemb = tarifaXemb;
	}
	

	public int getFechaReg() {
		return fechaReg;
	}
	public void setFechaReg(int fechaReg) {
		this.fechaReg = fechaReg;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getTarifaXdest() {
		return tarifaXdest;
	}
	public void setTarifaXdest(int tarifaXdest) {
		this.tarifaXdest = tarifaXdest;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getTarifaXtipo() {
		return tarifaXtipo;
	}
	public void setTarifaXtipo(int tarifaXtipo) {
		this.tarifaXtipo = tarifaXtipo;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getClaveEnvio() {
		return claveEnvio;
	}
	public void setClaveEnvio(String claveEnvio) {
		this.claveEnvio = claveEnvio;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getBloque() {
		return bloque;
	}
	public void setBloque(String bloque) {
		this.bloque = bloque;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	}
