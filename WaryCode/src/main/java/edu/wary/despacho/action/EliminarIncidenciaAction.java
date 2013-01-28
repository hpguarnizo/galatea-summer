package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Incidencia;

public class EliminarIncidenciaAction {
	private int idInc;
	private String mensajeEE;
	private DespachoService service=new DespachoService();
	
	public String execute(){
		String camino="success";
		Incidencia incidencia=new Incidencia();
		incidencia.setIdInc(idInc);
		try {
			service.eliminarInc(incidencia);
			mensajeEE="entrega satisfactoria";
		} catch (Exception e) {
			// TODO: handle exception
			mensajeEE=e.getMessage();
			camino="error";
		}
		return camino;
	}
	
	public int getIdInc() {
		return idInc;
	}
	public void setIdInc(int idInc) {
		this.idInc = idInc;
	}
	public String getMensajeEE() {
		return mensajeEE;
	}
	public void setMensajeEE(String mensajeEE) {
		this.mensajeEE = mensajeEE;
	}
	
	
}
