package br.com.dextraining.web.login;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginMB")
@SessionScoped
public class Login {

	private Usuario usuario = new Usuario();

	private boolean usuarioLogado;

	// Criamos um método no usuario
	public Usuario getUsuario() {
		return usuario;
	}

	// Verificamos se o usuario está ou não logado
	// isUsuarioLogado() ou  getUsuarioLogado()
	//por convenção os dois funcionam.
	public boolean isUsuarioLogado() {
		return usuarioLogado;
	}

	// Criamos o método login
	// Estamos pegando um boolean para saber a condição
	// Em que o usuario está  LOGADO ou DESLOGADO

	public String login() {
		
		this.usuarioLogado = UsuarioService.logar(this.usuario);
		
		if(this.usuarioLogado){
			
			/* ?faces-redirect=true com este código
			 * podemos MUDAR a URI quando navegamos entre as telas.
			 */
			
			return "/listaDeUsuarios?faces-redirect=true";
		}
		
		return null;
	}
}
