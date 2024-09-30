package Q02;

public class Empregado {

    String nome;
    String sobrenome;
    double salarioMensal;

    public Empregado (String nome, String sobrenome, double salarioMensal){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.salarioMensal = salarioMensal;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public double getSalarioMensal(){
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnual(){

        return salarioMensal * 12;
    }
    public void imprimirSalarioAnual(){
        System.out.println("O salário anual de " + nome + " corresponde a: " + salarioAnual());
    }

    }
