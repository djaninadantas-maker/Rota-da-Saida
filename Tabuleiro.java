package RotaSaida;

public class Casa {
    private final int numero;
    private final String nome;

    public Casa(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {return numero};

    public String getNome() {
        return nome;
    }

    public abstract int posicaoFinal();
}

public class CasaNormal extends Casa {
    public CasaNormal(int numero) {
        super(numero, "Casa normal");
    }

    @Override
    public int posicaoFinal() {
        return getNumero();   // fica onde está
    }
}