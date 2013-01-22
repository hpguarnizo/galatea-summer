package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Almacen;

public class BuscarUbicacionAction {
	private Almacen almacen;
	private String mensajeBU;
	private String area;
	private String seccion;
	private String bloque;
	private int idEnco;
	private DespachoService service=new DespachoService();
	
	public String execute(){
		String camino="success";
		try {
			almacen=service.buscarUbicacion(almacen);
			area=almacen.getArea();
			seccion=almacen.getSeccion();
			bloque=almacen.getBloque();
			idEnco=almacen.getIdEnco();
		} catch (Exception e) {
			// TODO: handle exception
			mensajeBU=e.getMessage();
			camino="error";
		}
		return camino;
	}
	
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	public int getIdEnco() {
		return idEnco;
	}

	public void setIdEnco(int idEnco) {
		this.idEnco = idEnco;
	}

	public String getMensajeBU() {
		return mensajeBU;
	}
	public void setMensajeBU(String mensajeBU) {
		this.mensajeBU = mensajeBU;
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
	public String getBloque() {
		return bloque;
	}
	public void setBloque(String bloque) {
		this.bloque = bloque;
	}
	
	
}
