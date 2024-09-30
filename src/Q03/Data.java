package Q03;

public class Data {

    int dia;
    String mes;
    int ano;

    public Data (int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void displayData(){
        System.out.println("Hoje é "+ dia + "/" + mes + "/" + ano);
    }
}
