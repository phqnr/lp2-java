package model;

public class Livro implements  Material { // Livro implementa a classe Material
    protected String titulo;
    protected String autor;
    protected int anoLancamento;
    protected String edicao;


    // Construtor vazio, valores dos campos podem ser definidos nos setters
    public Livro() {
    }

    // Construtor com parâmetros
    public Livro(String titulo, String autor, int anoLancamento, String edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.edicao = edicao;
    }


    /*
        Métodos getters e setters
        - get: acessar os valores
        - set: modificar os valores

     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    // @Override :: chamada da função exibirDetalhes() na classe Material
    @Override
    public void exibirDetalhes() {
        String info0 = "\n########## ::: LIVRO ::: ############\n";
        String info1= "Título: " + this.titulo + "\nAutor: " + this.autor + "\nAno: " + this.anoLancamento;
        String info2 = "\nEdição: " + this.edicao;
        System.out.println(info0 + info1 + info2);
    }

    @Override
    public String getTitulo() {
        return titulo;
    }
}
