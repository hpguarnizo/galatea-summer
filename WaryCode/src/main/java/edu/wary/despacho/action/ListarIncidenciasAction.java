package edu.wary.despacho.action;

import java.util.List;

import edu.wary.despacho.service.DespachoService;
import edu.wary.despacho.service.IncidenciaService;
import edu.wary.model.Incidencia;


/**
 * Metodo que permite LISTAR LAS INCIDENCIAS
 * @author galatea-summer-programador-MGalarza
 * @version 1.0
 * @since 25-01-2013
 */

public class ListarIncidenciasAction {
	private List<Incidencia> incidencias;
	private IncidenciaService service =new IncidenciaService();
	/**
	 * Define el metodo que eliminara la Incidencia
	 */
	
	public String execute(){
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		String camino="success";
	
		incidencias=service.listarIncidencia();
		return camino;
	}

	public List<Incidencia> getIncidencias() {
		return incidencias;
	}

	public void setIncidencias(List<Incidencia> incidencias) {
		this.incidencias = incidencias;
	}

	public IncidenciaService getService() {
		return service;
	}

	public void setService(IncidenciaService service) {
		this.service = service;
	}
	
}
