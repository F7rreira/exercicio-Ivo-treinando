package Exercicio4;

    public class Cliente extends Pessoa{
        private String cpf;

        public Cliente(String cpf, String nome, double idade, String cidadeNascimento) {
            super(nome, idade, cidadeNascimento);
            this.cpf = cpf;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }


        public void exibirDados(){
            System.out.println("Nome "+ getNome());
            System.out.println("CPF: "+ getCpf());
            System.out.println("Cidade de Nascimento " + getCidadeNascimento());
            System.out.println("Idade:"+ getIdade());


        }
}
