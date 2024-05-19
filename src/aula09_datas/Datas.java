package aula09_datas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;


public class Datas {
    public static void main (String [] args) {

        // LocalDate
        var dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        var dataEspecifica = LocalDate.of(1994, 9, 2);
        System.out.println("Meu nascimento: " + dataEspecifica);

        System.out.println("\n\n");
        System.out.println(dataAtual.getDayOfMonth()); // retorna o dia do mês
        System.out.println(dataAtual.getMonth()); // retorna o mês
        System.out.println(dataAtual.getYear()); // retorna  o ano
        System.out.println("Dia do ano atual: " + dataAtual.getDayOfYear()); // retorna o dia do ano

        // adicionando e subtraindo dias, meses e anos das datas
        System.out.println("\nAdicionando dias na data atual: " + dataAtual.plusDays(6)); // adiciona um dia
        System.out.println(dataAtual.minusMonths(2)); // subtrai dois meses



        // LocalTime
        var horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);

        var horaEspecifica = LocalTime.of(9, 9, 10); // não inserir zeros nos dias e meses, pois a base é octal
        System.out.println("Hora específica: " + horaEspecifica);

        // adicionando e subtraindo horas, minutos, segundos
        System.out.println("\nAdicionando horas no horário atual: " + horaAtual.plusHours(3)); // adiciona 3 horas
        System.out.println(horaAtual.minusMinutes(2)); // subtrai dois minutos


        //LocalDateTime
        var dataHoraAtual = LocalDateTime.now();
        System.out.println("\nData e horário atual: " + dataHoraAtual);

        var dataHoje = LocalDateTime.of(2024, 5, 2, 8, 16, 10);
        System.out.println("Data criada: " + dataHoje);

        System.out.println("\nRetorna o dia da semana: " + dataHoraAtual.getDayOfWeek()); // retorna o dia da semana

        System.out.println(dataHoje.getHour());
        System.out.println(dataHoje.getMinute());
        System.out.println(dataHoje.getSecond());
        System.out.println(dataHoje.getNano());


        // Classe Calendar
        Calendar dataCalendario = Calendar.getInstance();
        System.out.println(dataCalendario.getTime());

        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.YEAR);
        System.out.println(Calendar.MONTH);

        System.out.println("\nDia da semana: " + dataCalendario.get(Calendar.DAY_OF_WEEK));
        System.out.println("Ano: " + dataCalendario.get(Calendar.YEAR));
        System.out.println("Mês: " + dataCalendario.get(Calendar.MONTH ) + " (janeiro é mês 0)"); // Janeiro é 0


        // Data e Hora formatadas
        var dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("\nData atual: " + dataAtual.format(dataFormatada));
        var horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Hora atual: " + horaAtual.format(horaFormatada));
    }
}
