package RotaSaida;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    public static final int TOTAL_CASAS = 30;
    public static final int POSICAO_INICIAL = 0;
    private final List<Casa> casas;

    public Tabuleiro() {
        this.casas = new ArrayList<>();
        inicializarCasas();

    }
    private void inicializarCasas(){
        for (int i = 1; i <= TOTAL_CASAS; i++){
            casas.add(criarCasa(i));
        }
    }
    private Casa criarCasa(int numero){

        switch (numero){
            case 5:
                return new Casa(5, "Passagem secreta", 9);
            case 8:
                return new Casa(8, "Beco sem saída", 4);
            case 14:
                return new Casa(14, "Mapa antigo", 19);
            case 18:
                return new Casa(18, "Armadilha escondida", 12);
            case 23:
                return new Casa(23, "Túnel subterrâneo", 27);
            case 27:
                return new Casa(27, "Parede falsa", 21);
            default:
                return new Casa(numero, null, 0);

        }
    }
    public Casa getCasa(int numero){
        if (numero < 1 || numero > TOTAL_CASAS){
            return null;
        }
        return casas.get(numero - 1);
    }
    public void mostrarResumoEspecial(){
        System.out.println("--- Casas Especiais (Tabuleirode " + TOTAL_CASAS + "casas) ---");
        for (Casa c: casas){
            if(c.temEfeitoEspecial()){
                System.out.println("Casa " + c.getNumero() + " - " + c.getNomeEfeito() + " --> vai para a casa " + c.getDestinoEspecial());
            }
        }
    }
}
