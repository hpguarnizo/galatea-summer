package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Encomienda;

/**
 * Metodo que permite BUSCAR LA ENCOMIENDA 
 * @author galatea-summer-programador-JMuñoz
 * @version 1.0
 * @since 25-01-2013
 */

public class BuscarEncomiendaAction {
	/**
	 * Define el objeto encomienda
	 */
	private Encomienda encomienda;
	private int idEnco;
	private String destino;
	private String estado;
	private String detalle;
	private String mensajeE;
	private DespachoService service=new DespachoService();
	
	

	
	public String execute() {
		
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		String camino="success";

		try {
			encomienda=service.buscarEncomienda(encomienda);
			idEnco=encomienda.getIdEnco();
			destino=encomienda.getDestino();
			estado=encomienda.getEstado();
			detalle=encomienda.getDetalle();
			
		} catch (Exception e) {
			// TODO: handle exception
			mensajeE=e.getMessage();
			camino="error";
		}
		return camino;
	}

	public Encomienda getEncomienda() {
		return encomienda;
	}

	public void setEncomienda(Encomienda encomienda) {
		this.encomienda = encomienda;
	}

	public String getMensajeE() {
		return mensajeE;
	}

	public void setMensajeE(String mensajeE) {
		this.mensajeE = mensajeE;
	}

	public int getIdEnco() {
		return idEnco;
	}

	public void setIdEnco(int idEnco) {
		this.idEnco = idEnco;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
