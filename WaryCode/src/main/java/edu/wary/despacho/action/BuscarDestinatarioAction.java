package edu.wary.despacho.action;

import javax.persistence.EntityManager;

import edu.wary.model.Destinatario;
import edu.wary.util.Utilitario;

/**
 * Metodo que permite BUSCAR UN DESTINATARIO
 * @author galatea-summer-programador-JMuñoz
 * @version 1.0
 * @since 25-01-2013
 */


public class BuscarDestinatarioAction {
	private Destinatario destinatario;
	private int idDest;
	private String nombre;
	private String apellido;
	private int dni;
	private String mensajeD;
	
	/*** 
	 * permite buscar un destinatario
	 * ***/

	public String execute(){
		
		/**
		 * invoca al metodo que va buscar al destinatario
		 */
		EntityManager em=Utilitario.getInstance().getEntityManager();
		Destinatario destinatariobd=em.find(Destinatario.class, destinatario.getIdDest());
		
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		
		String camino="success";
		
		
		/**
		 * Valida 
		 */
		
		if(destinatariobd == null){
			mensajeD = "Ingrese un destinatario" ;
			camino = "error";
		}else{
			if(destinatariobd.getIdDest()==destinatario.getIdDest()){
				mensajeD = "Destinatario encontrado";
				nombre=destinatariobd.getNombre();
				apellido=destinatariobd.getApellido();
				dni=destinatariobd.getDni();
			}else{
				mensajeD ="Destinatario no encontrado";
				camino = "error";
			}
		}
		return camino;
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getDni() {
		return dni;
	}



	public void setDni(int dni) {
		this.dni = dni;
	}



	public Destinatario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}
	public int getIdDest() {
		return idDest;
	}
	public void setIdDest(int idDest) {
		this.idDest = idDest;
	}

	public String getMensajeD() {
		return mensajeD;
	}

	public void setMensajeD(String mensajeD) {
		this.mensajeD = mensajeD;
	}
		
}
