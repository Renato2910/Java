package TrabalhoJava;

public class Onibus extends Veiculo {
    private int capacidadePassageiros;

    public Onibus(String marca, String modelo, double preco, int capacidadePassageiros) {
        super(marca, modelo, preco);
        this.capacidadePassageiros = capacidadePassageiros;
        this.realizarAcao();
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    @Override
    public void realizarAcao() {
        System.out.println("O ônibus está transportando passageiros.");
    }
}

