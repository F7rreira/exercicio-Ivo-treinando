package Exercicio2;

public class Triangulo {

        public double base;
        public double altura;

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }


        public void calcular(){
            double area = base*altura;
            area /= 2;
            System.out.println(area);

        }
}
