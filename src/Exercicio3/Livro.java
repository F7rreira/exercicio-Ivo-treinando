package Exercicio3;

public class Livro {
    private String titulo;
    private String autor;
    private double numeroPaginas;

    public Livro(String titulo, String autor, double numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getNumeroPaginas() {
        return numeroPaginas;
    }



}
