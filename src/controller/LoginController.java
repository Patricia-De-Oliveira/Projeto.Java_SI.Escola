package controller;

import model.Usuario;

import service.LoginService;

public class LoginController {
    private final LoginService loginService = new LoginService();

    public Usuario autenticarUsuario(Usuario usuarioInformado) {
        return loginService.autenticarUsuario(usuarioInformado);
    }
    public void logout() {
        loginService.logout();
    }
}
