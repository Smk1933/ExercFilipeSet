package Q02;

public class EmpregadoTeste {

    public static void main(String[] args) {

        Empregado e1 = new Empregado("Kleber", "Santos", 2000);
        Empregado e2 = new Empregado("Henry","Sandres", 4000);

        e1.imprimirSalarioAnual();
        e2.imprimirSalarioAnual();

        e1.setSalarioMensal(2200);
        e2.setSalarioMensal(4400);

        e1.imprimirSalarioAnual();
        e2.imprimirSalarioAnual();

    }
}
