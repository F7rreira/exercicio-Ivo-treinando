package Exercicio4;


public class Funcionario extends Pessoa {
    private double numeroMatricula;

    public Funcionario(double numeroMatricula, String nome, double idade,
                       String cidadeNascimento) {
        super(nome, idade, cidadeNascimento);
        this.numeroMatricula = numeroMatricula;
    }

    public double getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(double numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }


    public void exibirDados() {
        System.out.println("Nome " + getNome());
        System.out.println("Cidade de Nascimento " + getCidadeNascimento());
        System.out.println("Idade:" + getIdade());
        System.out.println("Matricula " + getNumeroMatricula());


    }
}