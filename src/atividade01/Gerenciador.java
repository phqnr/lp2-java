package atividade01;

public class Gerenciador {
    protected Medico[] medicos = new Medico[10];
    protected Paciente[] pacientes = new Paciente[10];
    protected Consulta[] consultas = new Consulta[100];
    protected int totalConsultas;
    protected int diaAtendimento;


    public Gerenciador() {
    }

    public Gerenciador(Medico[] medicos, Paciente[] pacientes, Consulta[] consultas, int totalConsultas) {
        this.medicos = new Medico[10];
        this.pacientes = new Paciente[10];
        this.consultas = new Consulta[100];
        this.totalConsultas = 0;
    }

    public boolean cadastrarConsulta(Medico medico, Paciente paciente, int diaConsulta) {
        if (medico.getPacientesAtendidos().length < 10 || medico.getConsultasAgendadas()[diaConsulta]) {
            return false;
        }
        medico.getPacientesAtendidos()[medico.getTotalPacientes()] = paciente;
        medico.getConsultasAgendadas()[diaConsulta] = true;
        consultas[totalConsultas] = new Consulta(paciente, medico, diaConsulta);
        totalConsultas++;
        medico.incrementarTotalPacientes();
        return true;
    }

    public boolean excluirConsulta(Medico medico, Paciente paciente, int dia) {
        if (medico.getTotalPacientes() < 10 || !medico.getConsultasAgendadas()[dia]) {
            return false;
        }
        for (int i = 0; i < totalConsultas; i++) {
            if (consultas[i] != null && consultas[i].getMedico() == medico && consultas[i].getPaciente() == paciente && consultas[i].getDataAgendada() == dia) {
                consultas[i] = null;
                medico.getConsultasAgendadas()[dia] = false;
                totalConsultas--;
                medico.decrementarTotalPacientes();
                return true;
            }
        }
        return false;
    }

    public void listarConsultasPorMedico() {
        for (Medico medico : medicos) {
            if (medico != null) { // Verifica se o médico não é nulo
                boolean temConsultas = false;
                System.out.println("Consultas de " + medico.getNome() + " - " + medico.getEspecialidade() + ":");
                for (Consulta consulta : consultas) {
                    if (consulta != null && consulta.getMedico() == medico) {
                        if (!temConsultas) {
                            temConsultas = true;
                        }
                        System.out.println("- Paciente: " + consulta.getPaciente().getNome() + ", Dia: " + consulta.getDataAgendada());
                    }
                }
                if (!temConsultas) {
                    System.out.println("Nenhuma consulta agendada para este médico.");
                }
            }
        }
    }

    public void listarConsultasTodas() {
        System.out.println("\nTodas as consultas:");
        int i = 0;
        for (Consulta consulta : consultas) {
            if (consulta != null) {
                System.out.println("- Médico: " + consulta.getMedico().getNome() + ", Paciente: " + consulta.getPaciente().getNome() + ", Dia: " + consulta.getDataAgendada());
                i++;
            }
        }
        System.out.println("\nTotal de consultas realizadas: " + i);
    }
}


