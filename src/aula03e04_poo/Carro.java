package aula03e04;

public class Carro {
    String cor;
    String marca;
    String modelo;
    int anoFabricacao;
    int numPortas;
    double combustivel;

    private boolean ligado;
    private int velocidade;

    public Carro() {
    }

    public Carro(String cor, String marca, String modelo, int anoFabricacao, int numPortas, double combustivel) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.combustivel = combustivel;
    }


    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
            velocidade = 0; // Resetando a velocidade ao desligar
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para acelerar o carro
    public void acelerar(int incremento) {
        if (ligado) {
            velocidade += incremento;
            System.out.println("Acelerando. Nova velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("O carro está desligado. Não é possível acelerar.");
        }
    }

    // Método para frear o carro
    public void frear(int decremento) {
        if (ligado) {
            if (velocidade - decremento >= 0) {
                velocidade -= decremento;
                System.out.println("Freando. Nova velocidade: " + velocidade + " km/h");
            } else {
                System.out.println("O carro já está parado.");
                velocidade = 0; // Assegura que a velocidade não seja negativa
            }
        } else {
            System.out.println("O carro está desligado. Não é possível frear.");
        }
    }

    // Método para parar o carro instantaneamente
    public void parar() {
        if (ligado && velocidade > 0) {
            System.out.println("Parando o carro...");
            velocidade = 0;
            System.out.println("O carro parou.");
        } else if (!ligado) {
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    // Método para obter a velocidade atual do carro
    public int getVelocidade() {
        return velocidade;
    }

    // Método para verificar se o carro está ligado
    public boolean isLigado() {
        return ligado;
    }
}
