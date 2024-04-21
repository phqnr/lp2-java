package DAO;
import java.util.ArrayList; // biblioteca do arrayList
import model.Material;

public class BibliotecaDAO {
    private ArrayList<Material> materiais; // arrayList pra armazenar os materiais (livros e revistas)
    private static BibliotecaDAO instance = new BibliotecaDAO(); // armazena a única instância da classe

    private BibliotecaDAO() { // construtor privado para garantir que a instância seja criada somente nessa classe
        materiais = new ArrayList<>();
    }

    public static BibliotecaDAO getInstance() {  // método que retorna a instância
        return instance;
    }

    public ArrayList<Material> getMateriais() { // método que retorna a lista dos materiais armazenados
        return materiais;
    }
}
