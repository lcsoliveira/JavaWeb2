package br.com.dextraining.web.login;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

	
	
	
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>();

	//Aqui estamos salvando um novo usuario quando o ususario clicar no botão ADICIONAR
	
	public static void salvar(Usuario usuario){
		usuarios.add(usuario);
	}
	
	
	
	// Criamos um método do tipo List<Usuarios> recebendo uma lista de usuarios
	public static List<Usuario> listar() {
		return usuarios;
	}
		
	
	
	// Criamos um método estático, vericamos a condição, retornamos um estado
	// TRUE or FALSE

	public static boolean logar(Usuario usuario) {

		if (usuario.getUsuario().equals("lucas") && usuario.getSenha().equals("1234")) {
			return true;
		}
		
		for(Usuario u : usuarios){
			if(usuario.getUsuario().equals(u.getUsuario()) 
					
					&& usuario.getSenha().equals(u.getSenha())){
				
				return true;
			}
		}
						
		return false;

	}

}
