package RotaSaida;

import java.util.Random;

public class DadoAleatorio {

    public static int lancar() {
        Random random = new Random();
        int dado = random.nextInt(6) + 1;
        return dado;
    }

    public static void main(String[] args) {
        System.out.println("Saiu: " + lancar());
    }
}

