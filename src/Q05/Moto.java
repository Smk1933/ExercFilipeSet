package Q05;

public class Moto extends Veiculo{

    String tipoDeGuidon;

    public Moto(String modelo, int ano, String marca, String tipoDeGuidon) {
        super(modelo, ano, marca);
        this.tipoDeGuidon = tipoDeGuidon;
    }

    public String getTipoDeGuidon() {
        return tipoDeGuidon;
    }

    public void setTipoDeGuidon(String tipoDeGuidon) {
        this.tipoDeGuidon = tipoDeGuidon;
    }

    @Override
    public void status(){
        System.out.println("O veículo de marca: " + marca + " é do modelo " + modelo + " feito no ano de " + ano + " e possui um guidon do tipo " + tipoDeGuidon);
    }
}
