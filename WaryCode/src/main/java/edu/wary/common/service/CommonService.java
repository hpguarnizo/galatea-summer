package edu.wary.common.service;

import javax.persistence.EntityManager;

import edu.wary.model.Usuario;
import edu.wary.model.repository.UsuarioRepository;
import edu.wary.util.Utilitario;

public class CommonService {
	public Usuario validarUsuario(Usuario u) throws RuntimeException{
		EntityManager em=Utilitario.getInstance().getEntityManager();
		UsuarioRepository usuarioRepository=
				new UsuarioRepository(em);
		Usuario usuariobd=usuarioRepository.findById(u.getCuenta());
		if(usuariobd == null){
			throw new RuntimeException("Usuario no existe");
		}else{
			
			if(!usuariobd.getClave().equals(u.getClave())){
				throw new RuntimeException("Su clave es incorrecta");
			}
		}
		return usuariobd;
	}
}
