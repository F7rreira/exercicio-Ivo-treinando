package Exercicio5;

public class main {

    public static void main(String[] args){
        PenaMosquito pena = new PenaMosquito("metal","nanquim");
        Caneta caneta1 = new Caneta ("plastico","tinta");
        Lapis lapis1 = new Lapis ("madeira","grafite");

        pena.escrever();
        caneta1.escrever();
        lapis1.escrever();
    }

}
