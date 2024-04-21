package atividade01;

public class Paciente extends Pessoa {
    protected boolean convenio;
    protected String[] enfermidadesRegistradas;
    protected Medico[] medicosAtendentes;

    // Construtor vazio
    public Paciente() {
    }

    // Construtor com parãmetros
    public Paciente(String nome, String CPF, boolean convenio) {
        super(nome, CPF);
        this.convenio = convenio;
        this.enfermidadesRegistradas = new String[10];
        this.medicosAtendentes = new Medico[10];
    }

    // Métodos Getters e Setters
    public boolean getConvenio() {
        return convenio;
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }

    public String[] getEnfermidadesRegistradas() {
        return enfermidadesRegistradas;
    }

    public void setEnfermidadesRegistradas(String[] enfermidadesRegistradas) {
        this.enfermidadesRegistradas = enfermidadesRegistradas;
    }

    public Medico[] getMedicosAtendentes() {
        return medicosAtendentes;
    }

    public void setMedicosAtendentes(Medico[] medicosAtendentes) {
        this.medicosAtendentes = medicosAtendentes;
    }
}

