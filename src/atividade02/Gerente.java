package atividade02;

public class Gerente extends Funcionario {
    private String departamento;
    public Gerente(String nome, String cpf, String dataNascimento, int matricula, String departamento) {
        super(nome, cpf, dataNascimento, matricula);
        this.departamento = departamento;
    }
    @Override
    public double calcularSalario() {
        return SALARIOMINIMO * 9.0;
    }
    @Override
    public void obterInfo() {
        String info0 = "\n############# :: GERENTE :: ##################\n";
        String info1= "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nData da nascimento: " + this.dataNascimento;
        String info2 = "\nDepartamento: " + this.departamento + "\nSalário: " + calcularSalario();
        System.out.println(info0 + info1 + info2);
    }

}
