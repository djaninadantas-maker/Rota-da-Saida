package RotaSaida;

public class Casa {
    private final int numero;
    private final String nomeEfeito;
    private final int destinoEspecial;

    public Casa(int numero, String nomeEfeito, int destinoEspecial){
        this.numero = numero;
        this.nomeEfeito = nomeEfeito;
        this.destinoEspecial = destinoEspecial;
    }
    public int getNumero(){
        return numero;
    }
    public String getNomeEfeito(){
        return nomeEfeito;
    }
    public int getDestinoEspecial() {
        return destinoEspecial;
    }
    public boolean temEfeitoEspecial(){
        return destinoEspecial > 0;
    }
}
