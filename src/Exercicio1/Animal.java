package Exercicio1;

public class Animal {

        private String nome;
        private String cor;
        private double idade;

        public Animal(String nome, String cor, double idade) {
            this.nome = nome;
            this.cor = cor;
            this.idade = idade;
        }


        public void correndo(){
            System.out.println( nome + " está correndo");
        }
        public void idade(){
            System.out.println("a idade deste animal é " + idade);
        }
    }

