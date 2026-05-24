package model;

import enums.Cargo;
public class Usuario{
    private String login;
    private String senha;
    private Cargo cargo;

    public Usuario() {
    }

    public Usuario(String login, String senha, Cargo cargo) {
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}