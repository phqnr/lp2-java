package atividade02;

public abstract class Funcionario {

    protected String nome;
    protected String cpf;
    protected int matricula;
    protected String dataNascimento;

    public static double SALARIOMINIMO = 1412.00;

    public Funcionario(String nome, String cpf, String dataNascimento, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;

    }

    public abstract double calcularSalario();
    public abstract void obterInfo();

}
