package edu.wary.despacho.action;

import java.util.List;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Encomienda;

/**
 * Metodo que permite LISTAR LAS ENCOMIENDAS DEL DESPACHO
 * @author galatea-summer-programador-MGalarza
 * @version 1.0
 * @since 25-01-2013
 */

public class ListarDespachoAction {
	private List<Encomienda> despachos;
	
	/**
	 * Define el metodo que lista las encomiendas en el despacho
	 */
	
	public String execute(){
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		String camino="success";
		DespachoService service=new DespachoService();
		despachos=service.listarDespachos();
		return camino;
	}

	public List<Encomienda> getDespachos() {
		return despachos;
	}

	public void setDespachos(List<Encomienda> despachos) {
		this.despachos = despachos;
	}
	
	
}
