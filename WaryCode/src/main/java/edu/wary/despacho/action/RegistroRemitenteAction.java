package edu.wary.despacho.action;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Remitente;
import edu.wary.util.Utilitario;

/**
 * Metodo que permite REGISTRAR UN REMITENTE
 * @author galatea-summer-programador-MGalarza
 * @version 1.0
 * @since 25-01-2013
 */

@SuppressWarnings("unused")
public class RegistroRemitenteAction {
	private Remitente remitente;
	private String mensaje;
	private DespachoService service=new DespachoService();
	
	/**
	 * Define el metodo que registra un remitente
	 */
	
	
	public String execute(){

		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		
		String camino="success";
		try {
			service.registrarRemitente(remitente);
			mensaje="Registro Satisfactorio";
		} catch (Exception e) {
			// TODO: handle exception
			mensaje=e.getMessage();
			camino="error";
		}
		return camino;
	}
	
	
	public Remitente getRemitente() {
		return remitente;
	}
	public void setRemitente(Remitente remitente) {
		this.remitente = remitente;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
