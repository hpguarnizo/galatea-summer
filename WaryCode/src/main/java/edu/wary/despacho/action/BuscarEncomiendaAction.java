package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Encomienda;

public class BuscarEncomiendaAction {
	private Encomienda encomienda;
	private int idEnco;
	private String destino;
	private int peso;
	private int volumen;
	private String mensajeE;
	private DespachoService service=new DespachoService();
	
	public String execute() {
		String camino="success";
		try {
			encomienda=service.buscarEncomienda(encomienda);
			destino=encomienda.getDestino();
			peso=encomienda.getPeso();
			volumen=encomienda.getVolumen();
			idEnco=encomienda.getIdEnco();
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

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	
	
}