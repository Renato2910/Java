package TrabalhoJava;

public class Carro extends Veiculo {
    private int numeroPortas;
    private Boolean arCondicionado;

    public Carro(String marca, String modelo, double preco, int numeroPortas, boolean arCondicionado) {
        super(marca, modelo, preco);
        this.numeroPortas = numeroPortas;
        this.arCondicionado = arCondicionado;
        this.realizarAcao();
    }



    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean ArCondicionado() {
        return arCondicionado;
    }

    @Override
    public void realizarAcao() {
        System.out.println("O carro está acelerando.");
    }
}
