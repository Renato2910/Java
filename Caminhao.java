package TrabalhoJava;
public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, double preco, double capacidadeCarga) {
        super(marca, modelo, preco);
        this.capacidadeCarga = capacidadeCarga;
        this.realizarAcao();
    }

    public double getCapacidadeCarga() {

        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {

        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void realizarAcao() {
        System.out.println("O caminhão está carregando a carga.");
    }
}
