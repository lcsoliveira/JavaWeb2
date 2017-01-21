package br.com.dextraining.web.login;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean(name="listaDeUsuarioMB")
public class ListaDeUsuariosMB {

	
	
	//Criamos um atributo do tipo lista de usuarios
	private List<Usuario> usuarios;

	
	//GET AND SETTERS
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	//Criamos um método para listar os usuarios 
	@PostConstruct
	public void listaUsuario(){
		this.usuarios = UsuarioService.listar();
	}
	
	
	
}
