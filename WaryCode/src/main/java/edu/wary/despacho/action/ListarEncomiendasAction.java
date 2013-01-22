package edu.wary.despacho.action;

import java.util.List;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Encomienda;

public class ListarEncomiendasAction {
	private List<Encomienda> encomiendas;
	
	public String execute(){
		String camino="success";
		DespachoService service=new DespachoService();
		encomiendas=service.listarEncomienda();
		return camino;
	}

	public List<Encomienda> getEncomiendas() {
		return encomiendas;
	}

	public void setEncomiendas(List<Encomienda> encomiendas) {
		this.encomiendas = encomiendas;
	}
	
}
