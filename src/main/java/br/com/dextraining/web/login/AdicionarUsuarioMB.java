package br.com.dextraining.web.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "adicionarUsuarioMB")
@SessionScoped
public class AdicionarUsuarioMB {

	
	private Usuario usuario /*= new Usuario()*/;

	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public String adicionar(){
		
		UsuarioService.salvar(usuario);
		
		return "/listaDeUsuarios";
		
	}
	
	public String novoUsuario(){
		this.usuario = new Usuario();
	return "adicionarUsuario.xhtml?faces-redirect=true";
	}
	
	
	
	
	
}
