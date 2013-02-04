package edu.wary.despacho.action;

import java.util.List;

import edu.wary.despacho.service.ClienteService;
import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Cliente;
import edu.wary.model.Encomienda;

/**
 * Metodo que permite LISTAR LAS ENCOMIENDAS DEL DESPACHO
 * @author galatea-summer-programador-MGalarza
 * @version 1.0
 * @since 25-01-2013
 */

public class EnviarClienteREAction {
	
	
	private ClienteService service=new ClienteService();
	private Cliente clientes;
	private int nrodoc;
	private String mensaje;
	/**
	 * Define el metodo que lista las encomiendas en el despacho
	 */


	public String execute() {
		
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */

		String camino="success";

		try {			
	    clientes=service.buscarCliente(nrodoc);					
		} catch (Exception e) {
			// TODO: handle exception
		
		camino="error";
		}
		return camino;
	}

	public Cliente getClientes() {
		return clientes;
	}



	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}



	public ClienteService getService() {
		return service;
	}


	public void setService(ClienteService service) {
		this.service = service;
	}







	
	
}
