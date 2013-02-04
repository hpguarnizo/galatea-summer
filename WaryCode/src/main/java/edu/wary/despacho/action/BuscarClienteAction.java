package edu.wary.despacho.action;

import edu.wary.despacho.service.ClienteService;
import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Cliente;
import edu.wary.model.Destinatario;

/**
 * 
 * Esta clase es el ACTION donde estan los metodos para BUSCAR UN CLIENTE
 * 
 * @author galatea-summer-programador-JMuñoz
 * @version 1.0
 * @since 25-01-2013
 *
 */



public class BuscarClienteAction {
	private Cliente clientes;
    private int nrodoc;
	@SuppressWarnings("unused")
	
	private ClienteService service=new ClienteService();
	
	//private DespachoService service1=new DespachoService();
	
	
	/**
	 * Metodo que permite BUSCAR UN CLIENTE
	 * @author galatea-summer-programador Mgalarza
	 * @version 1.0
     * @since 25-01-2013
	 */

	public String execute() {
		
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */

		String camino="success";

		try {			
	    clientes=service.buscarClienteOb(clientes);					
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

