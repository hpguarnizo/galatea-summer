package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Destinatario;
import edu.wary.model.Encomienda;
import edu.wary.model.Pago;

public class RegistroEncomiendaAction {
	private Encomienda encomienda;
	private Destinatario destinatario;
	private Pago pago;
	private String mensaje;
	private DespachoService service=new DespachoService();

	public String execute(){
		String camino="success";
		try {
			service.registrarEncomienda(destinatario, encomienda, pago);
			mensaje="Registro Satisfactorio";
		} catch (Exception e) {
			// TODO: handle exception
			mensaje=e.getMessage();
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

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}
	
}
