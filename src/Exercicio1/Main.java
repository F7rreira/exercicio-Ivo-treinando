package Exercicio1;


public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Animal("Bob", "Cinza", 3);
        Animal leao = new Animal("Rei", "marrom", 10);
        Animal gato = new Animal("Tom", "preto", 4);

        leao.correndo();
        gato.idade();


    }
}
