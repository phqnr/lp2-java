package atividade01;
public class Medico extends Pessoa {
    protected String especialidade;
    protected String CRM;
    protected Paciente[] pacientesAtendidos;
    protected boolean[] consultasAgendadas;
    protected int totalPacientes;

    // Construtor


    public Medico() {
    }

    public Medico(String nome, String CPF, String especialidade, String CRM) {
        super(nome, CPF);
        this.especialidade = especialidade;
        this.CRM = CRM;
        this.pacientesAtendidos = new Paciente[10];
        this.consultasAgendadas = new boolean[100];
        this.totalPacientes = 0;
    }

    // Métodos Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public Paciente[] getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public void setPacientesAtendidos(Paciente[] pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public boolean[] getConsultasAgendadas() {
        return consultasAgendadas;
    }

    public void setConsultasAgendadas(boolean[] consultasAgendadas) {
        this.consultasAgendadas = consultasAgendadas;
    }

    // Método para incrementar o total de pacientes
    public int getTotalPacientes() {
        return totalPacientes;
    }

    // Método para incrementar o total de pacientes
    public void incrementarTotalPacientes() {
        if (totalPacientes < 10) {
            totalPacientes++;
        } else {
            System.out.println("Número máximo de pacientes atingido para este médico.");
        }
    }

    public void decrementarTotalPacientes() {
        if (totalPacientes > 0) {
            totalPacientes--;
        } else {
            System.out.println("Não há pacientes para decrementar.");
        }
    }
}

