package aula05;

public class Main {
    public static void main (String[] args) {
        Pessoa myPerson = new Pessoa("Paulo Henrique", "102.302.340-22");
        Funcionario myEmployee = new Funcionario("Paulo Henrique", "102.302.340-22" ,19293, "Programador", 3300.0);

        System.out.println(myPerson.falar());
        System.out.println("Nome: " + myPerson.nome);
        System.out.println("CPF: " + myPerson.cpf);
        System.out.println("Matrícula: " + myEmployee.matricula);
        System.out.println("Função: " + myEmployee.funcao);
        System.out.println("Salário: " + myEmployee.salario);
        System.out.println(myEmployee.falar());
    }
}
