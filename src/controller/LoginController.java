package controller;

import model.Usuario;
import service.LoginService;

public class LoginController {

    private final LoginService loginService = new LoginService();

    // LOGIN
    public Usuario autenticarUsuario(String login, String senha){
        return loginService.autenticarUsuario(login, senha);
    }

    // LOGOUT
    public void logout(){
        loginService.logout();
    }
}