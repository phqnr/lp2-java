package aula10_arquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivos {
    public static void main (String [] args) {

        File arquivo2 = new File("lerArquivo.txt");

        try {
            // verifica se o arquivo já foi criado; caso contrário, cria o arquivo e informa a mensagem
            if(arquivo2.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("O arquivo já existe.");
            }

            // declara o método que vai escrever no arquivo criado
            FileWriter escritor = new FileWriter("lerArquivo.txt");

            escritor.write("\nContanto de 0 a 10: \n");
            for (int i = 0; i <= 10; i++) {
                escritor.write("Linha " + i + " do arquivo\n");
            }
            escritor.write("\nFim do programa.");
            escritor.close(); //fecha o escritor

            // cria o método que vai ler o arquivo criado e escrito acima
            Scanner leitor = new Scanner(arquivo2);
            while(leitor.hasNextLine()) {       // laço para executar enquanto estiverem linhas a serem lidas
                System.out.println(leitor.nextLine());      // chamado para a ler a próxima linha
            }
            leitor.close(); // fecha o leitor

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
