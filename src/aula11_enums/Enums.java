package aula11_enums;

public class Enums {

    // Definindo uma enumeração para os dias da semana
    public enum DiaDaSemana {
        DOMINGO(1), SEGUNDA(2), TERÇA(3), QUARTA(4), QUINTA(5), SEXTA(6), SÁBADO(7);
        private final int dia;

        DiaDaSemana(int dia) {
            this.dia = dia;
        }

        public int getDia() {
            return  dia;
        }
    }

    public static void main (String [] args) {
//        DiaDaSemana dia = Enums.DiaDaSemana.DOMINGO;
//        System.out.println("Hoje é " + dia);
//        System.out.println("Hoje é " + dia.getDia());

        for (DiaDaSemana dia : DiaDaSemana.values()) {
            System.out.println(dia.getDia() + ": " + dia);
        }
    }
}
