package edu.wary.despacho.action;

import javax.persistence.EntityManager;

import edu.wary.model.Destinatario;
import edu.wary.util.Utilitario;

public class BuscarDestinatarioAction {
	private Destinatario destinatario;
	private int idDest;
	private String nombre;
	private String apellido;
	private String dni;
	private String mensajeD;
	
	public String execute(){
		EntityManager em=Utilitario.getInstance().getEntityManager();
		Destinatario destinatariobd=em.find(Destinatario.class, destinatario.getIdDest());
		String camino="success";
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



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
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
