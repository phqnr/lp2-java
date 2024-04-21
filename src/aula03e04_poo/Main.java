package aula03e04;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro meuCarro = new Carro("cinza", "Toyota", "Etios", 2015, 5, 7.0);


        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano de Fabricação: " + meuCarro.anoFabricacao);
        System.out.println("Nº de portas: " + meuCarro.numPortas);
        System.out.println("Consumo de combustível (km p/ lts): " + meuCarro.combustivel);

        System.out.println();

        meuCarro.ligar();
        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.desligar();
        meuCarro.acelerar(30);

    }
}