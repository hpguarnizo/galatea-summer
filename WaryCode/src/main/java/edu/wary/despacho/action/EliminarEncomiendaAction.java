package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Encomienda;

public class EliminarEncomiendaAction {
	private int idEnco;
	private String mensajeEE;
	private DespachoService service=new DespachoService();
	
	public String execute(){
		String camino="success";
		Encomienda encomienda=new Encomienda();
		encomienda.setIdEnco(idEnco);
		try {
			service.eliminarEnco(encomienda);
			mensajeEE="entrega satisfactoria";
		} catch (Exception e) {
			// TODO: handle exception
			mensajeEE=e.getMessage();
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
	public String getMensajeEE() {
		return mensajeEE;
	}
	public void setMensajeEE(String mensajeEE) {
		this.mensajeEE = mensajeEE;
	}
	
	
}
