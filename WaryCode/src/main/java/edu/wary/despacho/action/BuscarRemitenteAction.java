package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Remitente;

/**
 * Metodo que permite BUSCAR UN REMINTENTE-CLIENTE
 * @author galatea-summer-programador-JMuñoz
 * @version 1.0
 * @since 25-01-2013
 */


public class BuscarRemitenteAction {
	
	/**
	 * Define el objeto encomienda
	 */
	
	private Remitente remitente;
	private int idRemi;
	private String mensajeR;
	private String nombre;
	private String dni;
	private int codRemi;
	private DespachoService service=new DespachoService();
	
	/*** 
	 * Permite buscar a un cliente (remitente o destinatario)
	 * ***/

	
	public String execute(){
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		String camino="success";
		try {
			remitente=service.buscarRemitente(remitente);
			nombre=remitente.getNombre();
			dni=remitente.getDni();
		} catch (Exception e) {
			// TODO: handle exception
			mensajeR=e.getMessage();
			camino="error";
		}
		return camino;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public int getCodRemi() {
		return codRemi;
	}


	public void setCodRemi(int codRemi) {
		this.codRemi = codRemi;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Remitente getRemitente() {
		return remitente;
	}
	public void setRemitente(Remitente remitente) {
		this.remitente = remitente;
	}
	public int getIdRemi() {
		return idRemi;
	}
	public void setIdRemi(int idRemi) {
		this.idRemi = idRemi;
	}

	public String getMensajeR() {
		return mensajeR;
	}

	public void setMensajeR(String mensajeR) {
		this.mensajeR = mensajeR;
	}
	
	
}
