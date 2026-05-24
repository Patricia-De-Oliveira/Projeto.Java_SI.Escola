package util;

public class Validacoes {

    public boolean validarNota(double valor) {
        return valor >= 0 && valor <= 10;
    }

    public boolean validarFaltas(int faltas){
        return faltas >= 0;
    }
}