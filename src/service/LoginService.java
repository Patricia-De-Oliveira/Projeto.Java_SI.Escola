package service;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class LoginService{
    private final List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario autenticarUsuario(Usuario usuarioInformado) {
        if (usuarioInformado == null || usuarioInformado.getLogin() == null || usuarioInformado.getSenha() == null) {
            return null;
        }

        for (Usuario u : usuarios) {
            if (u.getLogin() != null && u.getSenha() != null) {
                if (u.getLogin().equals(usuarioInformado.getLogin())&& u.getSenha().equals(usuarioInformado.getSenha())) {
                    return u;
                }
            }
        }
        return null;
    }

    public void logout() {
    }
}
