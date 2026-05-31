package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class LoginService {

    private static final List<Usuario> usuarios = new ArrayList<>();

    // CREATE
    public void cadastrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    // LOGIN
    public Usuario autenticarUsuario(String login, String senha){
        if(login == null || senha == null){
            return null;
        }
        for(Usuario usuario : usuarios){
            if(usuario.getLogin() != null && usuario.getSenha() != null){
                if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){
                    return usuario;
                }
            }
        }
        return null;
    }

    // LOGOUT
    public void logout(){

    }
}