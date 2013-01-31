package edu.wary.despacho.action;

import java.util.List;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Encomienda;


/**
 * Metodo que permite LISTAR LAS ENCOMIENDAS
 * @author galatea-summer-programador-MGalarza
 * @version 1.0
 * @since 25-01-2013
 */

public class ListarEncomiendasAction {
	private List<Encomienda> encomiendas;

	/**
	 * Define el metodo que eliminara la encomienda
	 */
	
	public String execute(){
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		String camino="success";
		DespachoService service=new DespachoService();
		encomiendas=service.listarEncomienda();
		return camino;
	}

	public List<Encomienda> getEncomiendas() {
		return encomiendas;
	}

	public void setEncomiendas(List<Encomienda> encomiendas) {
		this.encomiendas = encomiendas;
	}
	
}
