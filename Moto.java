package TrabalhoJava;
public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, double preco, boolean partidaEletrica) {
        super(marca, modelo, preco);
        this.partidaEletrica = partidaEletrica;
        this.realizarAcao();
    }

    public boolean getPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public void realizarAcao() {
        System.out.println("A moto está empinando.");
    }
}
