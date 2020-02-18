package Exercicio5;


public class PenaMosquito implements Interface {
    private String ehFeitoDe;
    private String escreveCom;

    public PenaMosquito(String ehFeitoDe, String escreveCom) {
        this.ehFeitoDe = ehFeitoDe;
        this.escreveCom = escreveCom;
    }

    @Override
    public void escrever() {
        System.out.println ("Escrevendo com " + escreveCom);
    }
}