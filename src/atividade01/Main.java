package atividade01;

public class Main {
    public static void main(String[] args) {
        // Criando médicos
        Medico medico1 = new Medico("Dr. Jorge", "12345678900", "Cardiologista", "CRM1234");
        Medico medico2 = new Medico("Dra. Lucia", "98765432100", "Pediatra", "CRM5678");
        Medico medico3 = new Medico("Dr. Carlos", "11122233344", "Ortopedista", "CRM91011");
        Medico medico4 = new Medico("Dra. Tayse", "55566677788", "Psiquiatra", "CRM121314");
        Medico medico5 = new Medico("Dr. Henrique", "99988877766", "Dermatologista", "CRM151617");

        // Criando pacientes
        Paciente paciente1 = new Paciente("Ana", "12345678900", true);
        Paciente paciente2 = new Paciente("João", "98765432100", false);
        Paciente paciente3 = new Paciente("Mariana", "11122233344", true);
        Paciente paciente4 = new Paciente("Bahabás", "55566677788", false);
        Paciente paciente5 = new Paciente("Camila", "99988877766", true);

        // Criando um gerenciador
        Gerenciador gerenciador = new Gerenciador();

        // Adicionando médicos ao gerenciador
        gerenciador.medicos[0] = medico1;
        gerenciador.medicos[1] = medico2;
        gerenciador.medicos[2] = medico3;
        gerenciador.medicos[3] = medico4;
        gerenciador.medicos[4] = medico5;

        // Adicionando pacientes ao gerenciador
        gerenciador.pacientes[0] = paciente1;
        gerenciador.pacientes[1] = paciente2;
        gerenciador.pacientes[2] = paciente3;
        gerenciador.pacientes[3] = paciente4;
        gerenciador.pacientes[4] = paciente5;

        // Agendando consultas
        gerenciador.cadastrarConsulta(medico1, paciente1, 10);
        gerenciador.cadastrarConsulta(medico2, paciente2, 12);
        gerenciador.cadastrarConsulta(medico3, paciente3, 21);
        gerenciador.cadastrarConsulta(medico4, paciente4, 25);
        gerenciador.cadastrarConsulta(medico5, paciente5, 30);
        gerenciador.cadastrarConsulta(medico1, paciente4, 22);
        gerenciador.cadastrarConsulta(medico5, paciente2, 25);
        gerenciador.cadastrarConsulta(medico2, paciente4, 24);
        gerenciador.cadastrarConsulta(medico5, paciente1, 2);
        gerenciador.cadastrarConsulta(medico2, paciente5, 9);

        // Listando consultas por médico
        gerenciador.listarConsultasPorMedico();

        // Listando todas as consultas
        gerenciador.listarConsultasTodas();
    }
}