package Q04;

public class Conhecimento {

    String name;
    int programaOrientadaObjeto;
    int estruturaDados;
    int java;
    int logicaDeProgramacao;


    public Conhecimento() {
    }

    public Conhecimento(String name, int programaOrientadaObjeto, int estruturaDados, int java, int logicaDeProgramacao) {
        this.name = name;
        this.programaOrientadaObjeto = programaOrientadaObjeto;
        this.estruturaDados = estruturaDados;
        this.java = java;
        this.logicaDeProgramacao = logicaDeProgramacao;
    }

    public void fazerQuestao4 (){

        if (programaOrientadaObjeto > 70 && estruturaDados > 70 && java > 70 && logicaDeProgramacao > 70){
            System.out.println("Consigo fazer a questão 4");
        } else {
            System.out.println("Estude mais " + name + " e volte mais forte !!" );
        }

    }
}
