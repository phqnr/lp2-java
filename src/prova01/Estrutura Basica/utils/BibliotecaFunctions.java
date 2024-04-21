package utils;
import java.lang.reflect.Array;
import java.util.ArrayList;

import utils.*;
import model.Material;
import model.Livro;
import model.Revista;
import DAO.BibliotecaDAO;

public abstract class BibliotecaFunctions {
    protected static BibliotecaDAO bd = BibliotecaDAO.getInstance(); // declaração da instância

    public static void pesquisarMaterial(String titulo) {
        for (Material material : bd.getMateriais()) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                material.exibirDetalhes();
                return;
            }
        }
        System.out.println("\nMaterial não encontrado.");
    }

    // exibe a listagem dos materiais cadastrados de acordo com a função @Override
    public static void exibirListaMateriais() {
        for (Material material : bd.getMateriais()) {
            material.exibirDetalhes();
        }
    }

    // métodos de cadastro de material, a depender dos parâmetros, cadastra num tipo de material diferente
    public static void cadastrarMaterial(String titulo, String autor, int anoPublicacao, String edicao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao, edicao);
        bd.getMateriais().add(livro);
    }

    public static void cadastrarMaterial(String titulo, String editora, int numeroPaginas) {
        Revista revista = new Revista(titulo, editora, numeroPaginas);
        bd.getMateriais().add(revista);
    }

    public static void removerMaterial(String titulo) {
        for (Material material : bd.getMateriais()) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                bd.getMateriais().remove(material);
                System.out.println("\nMaterial removido com sucesso.");
                return;
            }
        }
        System.out.println("Material não encontrado para remover.");
    }

    private static Material buscaPorNome(String titulo) {
        for (Material material : bd.getMateriais()) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }
}
