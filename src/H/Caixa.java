package H;

public class Caixa {
    public static void main(String[] args) {

        Eletronico e1 = new Eletronico("Teclado", 1000, 50);
        Alimento a1 = new Alimento("Abacaxi", 10, "21/09/2024");

        e1.imprimirFatura();
        a1.imprimirFatura();
    }
}
