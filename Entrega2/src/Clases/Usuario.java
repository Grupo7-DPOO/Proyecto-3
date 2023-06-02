package Clases;

import java.util.HashMap;

public class Usuario {
	
		private HashMap<String, Usuario> usuario;
		
		public Usuario(String password, String login) {
			this.password = password;
			this.login = login;
		}
		
		private String password;
		private String login;
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		
		public boolean existeUsuario(String login) {
			return this.usuario.containsKey(login);
		}
		
		public boolean crearUsuario(String password, String login) {
			if (!existeUsuario(login)) {
				Usuario usuario = new Usuario(password, login);
				this.usuario.put(login, usuario);
				return true;
			}else {
				return false;
			}
		}
		
		public void deshabilitarUsuario(String login) {
			this.usuario.remove(login);
		}
}
