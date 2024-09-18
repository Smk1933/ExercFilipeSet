package E;

public class Concessionaria {
    public static void main(String[] args) {

        Carro c1 = new Carro("X6",2024, "BMW", 4);
        Moto m1 = new Moto("Bis",2023, "Honda","clássico");

        c1.status();
        m1.status();
    }
}
