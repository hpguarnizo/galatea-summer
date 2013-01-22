package edu.wary.common.action;
import com.opensymphony.xwork2.ActionSupport;

import edu.wary.common.service.CommonService;
import edu.wary.model.Usuario;

public class LoginAction extends ActionSupport{
	private Usuario usuario;
	private String mensaje;
	private CommonService service=new CommonService();
	
	public String execute(){
		String camino="success";
		try {
			service.validarUsuario(usuario);
		} catch (Exception e) {
			// TODO: handle exception
			mensaje=e.getMessage();
			camino="error";
		}
		return camino; 
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
