package edu.wary.despacho.action;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Destinatario;
import edu.wary.model.Encomienda;
import edu.wary.model.Incidencia;
import edu.wary.model.Pago;

/*** 
 * @author Miguel Galarza Godines
 * @version 1.0
 * @since 28-01-2013
 * ***/


public class RegistroIncidenciaAction {
	
	private Incidencia incidencia;
	
	//private String IdEnc;
	//private String tipo;
	//private String Descripcion;
	private String mensaje;
	private DespachoService service=new DespachoService();

	


/*** 
 * Permite enviar el registro de una incidencia
 * ***/
	
	public String execute(){
		String camino="success";
		try {
			service.registrarIncidencia(incidencia);
			mensaje="Registro Satisfactorio";
		} catch (Exception e) {
			// TODO: handle exception
			mensaje=e.getMessage();
			camino="error";
		}
		return camino;
	}

	public Incidencia getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(Incidencia incidencia) {
		this.incidencia = incidencia;
	}
	
	
}
