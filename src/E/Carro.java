package E;

public class Carro extends Veiculo{

    int numeroDePortas;

    public Carro(String modelo, int ano, String marca, int numeroDePortas) {
        super(modelo, ano, marca);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void status(){
        System.out.println("O veículo de marca: " + marca + " é do modelo " + modelo + " feito no ano de " + ano + " e possui " + numeroDePortas + " portas.");
    }
}
