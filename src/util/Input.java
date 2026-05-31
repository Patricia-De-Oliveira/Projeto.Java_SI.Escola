package util;

import java.util.Scanner;

public class Input {

    private static final Scanner TEXTO =
            new Scanner(System.in);

    private static final Scanner NUMERO =
            new Scanner(System.in);

    public static String lerTexto() {
        return TEXTO.nextLine();
    }

    public static int lerInteiro() {
        return Integer.parseInt(
                NUMERO.nextLine()
        );
    }

    public static double lerDouble() {
        return Double.parseDouble(
                NUMERO.nextLine()
        );
    }

}
