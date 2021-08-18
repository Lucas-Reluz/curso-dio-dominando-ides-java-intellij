package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {


    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro1 = new Livro("A arte da Guerra", 160);
        System.out.println(gato);
        System.out.println(livro1);

        /*int a = 5;

 int b = 3;

        System.out.println("Hello World "  +   (a+b));*/

    }
}
class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
}