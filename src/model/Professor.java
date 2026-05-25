package model;

import enums.Cargo;
import model.interfaces.Remuneravel;
public class Professor extends Pessoa implements Remuneravel {
    private String matricula;
    private double salario;
    private Cargo cargo;

    public Professor(){

    }

    public Professor(String nome, int idade, String cpf, String matricula, double salario, Cargo cargo) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario >= 0){
            this.salario = salario;
        }
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou um professor.");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Ensinar.");
    }

    @Override
    public void aplicarBonus() {
        salario += (salario  * 0.1);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula='" + matricula + '\'' +
                ", salario=" + salario +
                ", cargo=" + cargo +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}
