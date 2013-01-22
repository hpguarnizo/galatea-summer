package edu.wary.despacho.action;

import java.util.List;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Encomienda;

public class ListarDespachoAction {
	private List<Encomienda> despachos;
	
	public String execute(){
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
