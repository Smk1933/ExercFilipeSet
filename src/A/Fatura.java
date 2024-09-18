package A;

public class Fatura {

    String codigoProduto;
    String descricaoProduto;
    int quantidadeComprada;
    double precoPorItem;

    public Fatura (String codigoProduto, String descricaoProduto, int quantidadeComprada, double precoPorItem) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura() {

        return quantidadeComprada * precoPorItem;
    }

    public void imprimirFatura(){
        System.out.println("A fatura deu um total de: " + getTotalFatura() + " Reais");
    }

    public void status(){
        System.out.println("O código do produto é :" + codigoProduto);
        System.out.println("O produto descreve ser um: " + descricaoProduto);
        System.out.println("Foi comprada: " + quantidadeComprada + " unidades");
        System.out.println("No valor de: " + precoPorItem + "reais");
    }

}
