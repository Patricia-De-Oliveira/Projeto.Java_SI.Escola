package model;

import enums.Cargo;
public class Usuario{
    private String login;
    private String senha;
    private Cargo cargo;
    private Pessoa pessoa;

    public Usuario() {
    }

    public Usuario(String login, String senha, Cargo cargo, Pessoa pessoa) {
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
                ", nome=" + pessoa.getNome() +
                '}';
    }
}