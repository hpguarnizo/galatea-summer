package edu.wary.despacho.action;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Destinatario;
import edu.wary.model.Encomienda;
import edu.wary.model.Incidencia;
import edu.wary.model.Pago;

public class RegistroIncidenciaAction {
	
	private Incidencia incidencia;
	
	private String IdEnc;
	private String tipo;
	private String Descripcion;
	private String mensaje;
	private DespachoService service=new DespachoService();

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
