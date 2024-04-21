package model;

public class Revista implements  Material { // Revista também implementa a classe Material
    protected String titulo;
    protected String editora;
    protected int numeroPaginas;

    // Construtor vazio, valores dos campos podem ser definidos nos setters
    public Revista() {
    }

    // Construtor com parâmetros
    public Revista(String titulo, String editora, int numeroPaginas) {
        this.titulo = titulo;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }


    /*
        Métodos getters e setters
        - get: acessar os valores
        - set: modificar os valores

     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // @Override :: chamada da função exibirDetalhes() na classe Material
    @Override
    public void exibirDetalhes() {
        System.out.println("\n########## ::: REVISTA ::: ############");
        System.out.println("Título: " + this.titulo + "\nAutor: " + this.editora + "\nAno: " + this.numeroPaginas);
    }

    @Override
    public String getTitulo() {
        return titulo;
    }
}


