package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Almacen;

public class RegistrarIngresoAction {
	private Almacen almacen;
	private String mensajeI;
	private int idEnco;
	private DespachoService service=new DespachoService();
	
	public String execute(){
		String camino="success";
		try {
			almacen=service.registrarIngreso(almacen);
			mensajeI="resgistro satisfactorio";
			idEnco=almacen.getIdEnco();
		} catch (Exception e) {
			// TODO: handle exception
			mensajeI=e.getMessage();
			camino="error";
		}
		return camino;
	}

	public int getIdEnco() {
		return idEnco;
	}

	public void setIdEnco(int idEnco) {
		this.idEnco = idEnco;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public String getMensajeI() {
		return mensajeI;
	}

	public void setMensajeI(String mensajeI) {
		this.mensajeI = mensajeI;
	}
	
	
}
