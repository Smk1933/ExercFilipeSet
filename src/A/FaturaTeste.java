package A;

public class FaturaTeste {

        public static void main(String[] args) {

            Fatura f1 = new Fatura("12345", "Teclado", 5, 79.99);
            f1.getTotalFatura();
            f1.imprimirFatura();
            f1.status();

        }
    }