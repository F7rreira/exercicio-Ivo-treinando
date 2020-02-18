package Exercicio4;

public class main {
    public static void main(String[] args){
        Cliente client1= new Cliente ("012.345.678-97","Maria",12,"São Paulo");
        Funcionario func1 = new Funcionario (1245367,"Vinicius",12,"Taboão");

        client1.exibirDados();
        func1.exibirDados();



    }
}
