package atividade02;
public class Main {
    public static void main (String[] args) {

        Empresa PangeaInc = Empresa.getInstance();

        PangeaInc.adicionarFuncionario(new Programador("Paulo Henrique", "222.336.665-65", "02/09/1994", 123456, "Portfólio Pessoal"));
        PangeaInc.adicionarFuncionario(new Gerente("Tayse Casado", "587.546.564.11", "07/12/1993", 789456, "Psicologia"));
        PangeaInc.adicionarFuncionario(new Vendedor("João Sales", "879.664.654.33", "01/11/1991", 568875, 1500.0));

        PangeaInc.exibirInformacoes();

        PangeaInc.calcularFolhaPagamento();
    }
}
