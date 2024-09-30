package Q05;

public abstract class Veiculo {

    String marca;
    String modelo;
    int ano;

    public Veiculo(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void status(){
        System.out.println("O veículo de marca:" + marca + " é do modelo " + modelo + "feito no ano de " + ano);
    }

}
