package aula10_arquivos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


/*
    - declara um objeto File chamado 'arquivo', cujo arquivo é 'java.txt';
    - try { que cria o arquivo; caso já existe, informa que o arquivo já está criado
    - FileWriter é um objeto para escrever no arquivo declarado acima;
    - loop for para escrever 10 linhas no arquivo em questão;
    - algumas linhas para exibir o diretório do arquivo e o nome do arquivo;
    - catch { trata as exceções;
 */



public class Arquivos {
    public static void main (String [] args) {
        File arquivo = new File("java.txt");

        try {
            if(arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("O arquivo já existe.");
            }

            FileWriter escritor = new FileWriter("java.txt");
            escritor.write("Contanto de 0 a 10: \n");
            for (int i = 0; i <= 10; i++) {
                escritor.write("Linha " + i + " do arquivo\n");
            }
            escritor.write("\nFim do programa.");

            System.out.println("Caminho do arquivo: " + arquivo.getAbsolutePath());
            System.out.println("Nome do arquivo: " + arquivo.getName());
            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
