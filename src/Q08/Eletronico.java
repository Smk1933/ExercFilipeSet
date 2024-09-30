package Q08;

public class Eletronico extends Produto {

    int garantia;

    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public double calcularPrecoComDesconto(){
        return preco * 0.9;
    }
}
