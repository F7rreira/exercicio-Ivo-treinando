package Exercicio5;

public class Caneta implements Interface {
    private String ehFeitoDe;
    private String escreveCom;

    public Caneta(String ehFeitoDe, String escreveCom) {
        this.ehFeitoDe = ehFeitoDe;
        this.escreveCom = escreveCom;
    }

    @Override
    public void escrever() {
        System.out.println ("Escrevendo com " + escreveCom);
    }
}