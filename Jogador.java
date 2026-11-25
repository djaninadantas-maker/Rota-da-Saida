package RotaSaida;

import java.util.Scanner;

public class Jogador {

    public static void Jogadores() {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira o nome do primeiro jogador: ");
        String nome1 = input.nextLine();
        System.out.print("Insira o nome do segundo jogador: ");
        String nome2 = input.nextLine();
        System.out.println("---Jogador 1: " + nome1 + "---\n---Jogador 2: " + nome2 + "---");

        int posicao1 = 0;
        int posicao2 = 0;

//        for (int turno = 1; turno <= 80; turno++) {
//            System.out.println("Rodada nº "+ turno);
//            System.out.println("Prima Enter para lançar o dado...");
//            input.nextLine();
//            int resultado = DadoAleatorio.lancar();
//
//            if (turno % 2 != 0) {
//                posicao1 += resultado;
//                System.out.println(nome1 + " tirou: " + resultado);
//                System.out.println(nome1 + " está agora na posição " + posicao1 + "\n");
//            }
//            else {
//                posicao2 += resultado;
//                System.out.println(nome2 + " tirou: " + resultado);
//                System.out.println(nome2 + " está agora na posição " + posicao2 + "\n");
//            }
//
//        }
        for (int turno = 1; turno <= 80; turno++) {
            System.out.println("Rodada nº " + turno);
            System.out.println("Prima Enter para lançar o dado...");
            input.nextLine();

            int resultado = DadoAleatorio.lancar();

            if (turno % 2 != 0) {
                System.out.println(nome1 + " tirou: " + resultado);

                if (posicao1 + resultado <= 30) {
                    posicao1 += resultado;
                }
                else {
                    System.out.println("Ultrapassaria a saída. Fica na mesma posição.");
                }

                System.out.println(nome1 + " está agora na posição " + posicao1+"\n");

                if (posicao1 == 30) {
                    System.out.println(nome1 + " venceu!");
                    break;
                }
            }
            else {
                System.out.println(nome2 + " tirou: " + resultado);

                if (posicao2 + resultado <= 30) {
                    posicao2 += resultado;
                }
                else {
                    System.out.println("Ultrapassaria a saída. Fica na mesma posição.");
                }

                System.out.println(nome2 + " está agora na posição " + posicao2+"\n");

                if (posicao2 == 30) {
                    System.out.println(nome2 + " venceu!");
                    break;
                }
            }
        }

    }
}

