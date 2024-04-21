package atividade02;

public class Programador extends Funcionario {
    private String projetoAssociado;

    public Programador(String nome, String cpf, String dataNascimento, int matricula, String projetoAssociado) {
        super(nome, cpf, dataNascimento, matricula);
        this.projetoAssociado = projetoAssociado;
    }

    @Override
    public double calcularSalario() {
        return SALARIOMINIMO * 7.5;
    }
    @Override
    public void obterInfo() {
        String info0 = "\n###############  :: PROGRAMADOR :: ###################\n";
        String info1= "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nData da nascimento: " + this.dataNascimento;
        String info2 = "\nProjeto: " + this.projetoAssociado + "\nSalário: " + calcularSalario();
        System.out.println(info0 + info1 + info2);
    }
}
