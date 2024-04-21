package atividade02;
import java.util.ArrayList;

public class Empresa {
    ArrayList<Funcionario> funcionarios;
    private static Empresa PangeaInc;

    private Empresa(){
        funcionarios = new ArrayList<>();
    }

    //Padrão singleton (Cria apenas uma instancia de Empresa)
    public static Empresa getInstance(){
        if (PangeaInc == null){
            PangeaInc = new Empresa();
        }
        return PangeaInc;
    }

    public void adicionarFuncionario (Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double folhaPagamento = 0;
        for (Funcionario funcionario : funcionarios) {
            folhaPagamento += funcionario.calcularSalario();
        }
        return folhaPagamento;
    }

    public void exibirInformacoes() {
        for(Funcionario funcionario : funcionarios) {
            funcionario.obterInfo();
        }
    }

}
