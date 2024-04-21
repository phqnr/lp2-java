package atividade01;

public class Consulta {
    protected Paciente paciente;
    protected Medico medico;
    protected int dataAgendada;

    // Construtor vazio
    public Consulta() {
    }

    // Construtor com parâmetros
    public Consulta(Paciente paciente, Medico medico, int dataAgendada) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataAgendada = dataAgendada;
    }

    // Métodos Getters e Setters
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public int getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(int dataAgendada) {
        this.dataAgendada = dataAgendada;
    }
}
