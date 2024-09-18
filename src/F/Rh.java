package F;

public class Rh {

    public static void main(String[] args) {

        Gerente g1 = new Gerente("Samuel", 15000, 7000);
        Assistente a1 = new Assistente("Vinicius", 5000);

        g1.imprimirSalario();
        a1.imprimirSalario();
    }


}
