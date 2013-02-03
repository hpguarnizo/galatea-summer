package edu.wary.common.action;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.wary.common.service.CommonService;
import edu.wary.model.Usuario;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements ModelDriven<Usuario>{

	private Usuario usuario;
	
	private String mensaje;
	private CommonService service=new CommonService();
	
	public String execute(){
		String camino="success";
		try {
			
			Usuario user = service.validarUsuario(usuario);
			Map session =ActionContext.getContext().getSession();
			session.put("user",user);
	       
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

	@Override
	public Usuario getModel() {
		return usuario;
	}	
	
}
