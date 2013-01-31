package edu.wary.despacho.action;

import edu.wary.despacho.service.DespachoService;
import edu.wary.model.Almacen;

/**
 * Metodo que permite REGISTRAR EL INGRESO DE LA ENCMIENDA AL ALMACEN
 * @author galatea-summer-programador-MGalarza
 * @version 1.0
 * @since 25-01-2013
 */


public class RegistrarIngresoAction {
	private Almacen almacen;
	private String mensajeI;
	private int idEnco;
	private DespachoService service=new DespachoService();
	


	/**
	 * Define el metodo que registra la encomienda de ingreso a almacen
	 */
	
	
	public String execute(){
		/**
		 * Define el camino que llevara el mensaje y el jsp de respuesta
		 */
		String camino="success";
		try {
			almacen=service.registrarIngreso(almacen);
			mensajeI="resgistro satisfactorio";
			idEnco=almacen.getIdEnco();
		} catch (Exception e) {
			// TODO: handle exception
			mensajeI=e.getMessage();
			camino="error";
		}
		return camino;
	}

	public int getIdEnco() {
		return idEnco;
	}

	public void setIdEnco(int idEnco) {
		this.idEnco = idEnco;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public String getMensajeI() {
		return mensajeI;
	}

	public void setMensajeI(String mensajeI) {
		this.mensajeI = mensajeI;
	}
	
	
}
