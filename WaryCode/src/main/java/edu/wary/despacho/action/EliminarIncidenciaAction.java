package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Incidencia;

/**
 * Metodo que permite ELIMINAR LAS INCIDENCIAS
 * @author galatea-summer-programador-MGalarza
 * @version 1.0
 * @since 25-01-2013
 */

public class EliminarIncidenciaAction {
	private int idInc;
	private String mensajeEE;
	private DespachoService service=new DespachoService();
	
	/**
	 * Define el metodo que eliminara la una incidencia
	 */
	
	public String execute(){
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		String camino="success";
		Incidencia incidencia=new Incidencia();
		incidencia.setId(idInc);
		try {
			service.eliminarInc(incidencia);
			mensajeEE="satisfactoria";
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
