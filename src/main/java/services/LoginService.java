package services;

import model.Usuario;
import model.nullobjects.NullUser;
import persistence.UserDAO;
import persistence.UsuarioDAO;
import persistence.commons.DAOFactory;

public class LoginService {

	public Usuario login(String nombre, String password) {
		UsuarioDAO usuarioDao = DAOFactory.getUserDAO();
    	Usuario usuario = usuarioDao.findByUsername(nombre);
    	
    	if (usuario.isNull() || !usuario.checkPassword(password)) {
    		usuario = NullUser.build();
    	}
    	return usuario;
	}
	
}
