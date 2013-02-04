package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Encomienda;


/*** 
 * @author Miguel Galarza Godines y jose alonso muñoz
 * @version 1.0
 * @since 28-01-2013
 * ***/


public class ActualizarEstadoAction {
	private Encomienda encomienda;
	private int idEnco;
	private String mensajeAE;
	private DespachoService service=new DespachoService();
	
	
	/*** 
	 * Action de prueva para actualizar un estado n la encomienda
	 * ***/

	
	public String execute(){
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		String camino="success";
		try {
			service.actualizarEstado(encomienda);
			mensajeAE="actualizacion correcta";
		} catch (Exception e) {
			// TODO: handle exception
			mensajeAE=e.getMessage();
			camino="error";
		}
		return camino;
	}
	
	public Encomienda getEncomienda() {
		return encomienda;
	}


	public void setEncomienda(Encomienda encomienda) {
		this.encomienda = encomienda;
	}


	public int getIdEnco() {
		return idEnco;
	}
	public void setIdEnco(int idEnco) {
		this.idEnco = idEnco;
	}
	public String getMensajeAE() {
		return mensajeAE;
	}
	public void setMensajeAE(String mensajeAE) {
		this.mensajeAE = mensajeAE;
	}
	
}
