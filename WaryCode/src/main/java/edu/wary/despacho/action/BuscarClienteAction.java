package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Cliente;
import edu.wary.model.Destinatario;

public class BuscarClienteAction {
	private Cliente cliente;
	private Destinatario destinatario; 
	private int idCod;
	private int idDest;
	private String nombre;
	private int dni;
	private int razonSocial;
	private int ruc;
	@SuppressWarnings("unused")
	private String mensajeE;
	private DespachoService service=new DespachoService();
	
	public String execute() {
		String camino="success";
		try {
			cliente=service.buscarCliente(cliente);
			idCod=cliente.getIdCod();
			dni=cliente.getDni();
			nombre=cliente.getNombre();
			razonSocial=cliente.getRazonSocial();
			ruc=cliente.getRuc();
			
			destinatario=service.buscarDestinatario(destinatario);
			idDest=destinatario.getIdDest();
			nombre=cliente.getNombre();
			dni=destinatario.getDni();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			mensajeE=e.getMessage();
			camino="error";
		}
		return camino;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	public int getIdCod() {
		return idCod;
	}

	public void setIdCod(int idCod) {
		this.idCod = idCod;
	}

	public int getIdDest() {
		return idDest;
	}

	public void setIdDest(int idDest) {
		this.idDest = idDest;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(int razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getRuc() {
		return ruc;
	}

	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	public DespachoService getService() {
		return service;
	}

	public void setService(DespachoService service) {
		this.service = service;
	}
	
	
}

