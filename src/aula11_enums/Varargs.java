package aula11_enums;

public class Varargs {
    public static void main (String [] args) {
        concat("Hoje é domingo pé de cachimbo.", "\n O cachimbo é de ouro, bate no touro.", "\n  O touro é valente, bate na gente.", "\n   A gente é fraco, cai no buraco.", "\n    O buraco é fundo, 'cabou-se o mundo." + "\n     AAAAAAEEEEEEEEEEE!");
    }

    static void concat(String x, String... texto) {
        for (String palavra: texto) {
            x = x.concat(palavra);
        }
        System.out.println(x);
    }
}
