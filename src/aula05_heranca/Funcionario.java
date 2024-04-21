package aula05;

public class Funcionario extends Pessoa {
    protected int matricula;
    protected String funcao;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int matricula, String funcao, double salario) {
        super(nome, cpf);
        this.matricula = matricula;
        this.funcao = funcao;
        this.salario = salario;
    }

    @Override
    protected String falar() {
        return "Funcionário falando...";
    }
}
