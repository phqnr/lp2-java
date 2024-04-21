package atividade02;

public class Vendedor extends Funcionario {
    private double meta;

    public Vendedor(String nome, String cpf, String dataNascimento, int matricula, double meta) {
        super(nome, cpf, dataNascimento, matricula);
        this.meta = meta;
    }

    @Override
    public double calcularSalario() {
        double salario = (SALARIOMINIMO * 3.0) + 1500.0;
        return salario;
    }

    @Override
    public void obterInfo() {
        String info0 = "\n############# :: VENDEDOR ::  ###################\n";
        String info1= "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nData da nascimento: " + this.dataNascimento;
        String info2 = "\nMeta: " + this.meta + "\nSalário: " + calcularSalario();
        System.out.println(info0 + info1 + info2);
    }
}


