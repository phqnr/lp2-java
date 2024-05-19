package aula10_arquivos;


// Bibliotecas importadas
import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


// Classe Person que implementa a interface para serializar um objeto
public class Person implements Serializable {
    String nome;
    LocalDate dataNascimento;
    float altura;

    public Person(String nome, LocalDate dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public static void main (String [] args) {

        // Correção: converter a string para LocalDate
        LocalDate dataNascimento = LocalDate.parse("1960-06-20");

        // Cria um objeto chamado 'Francisco' com os atributos de classe Person
        Person Francisco = new Person("Francisco de Pádua", dataNascimento, 1.75f);

        // Cria um objeto arquivo chamado 'pessoa.txt' para escrever os atributos da classe Person
        File arquivo = new File ("pessoa.txt");
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo '" + arquivo + "' foi criado com sucesso!");
            } else {
                System.out.println("O arquivo '" + arquivo + "' já existe.");
            }

            // Define uma variável para formatar a dataNascimento
            var dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            FileWriter escritor = new FileWriter("pessoa.txt");     // Cria o objeto para ler o arquivo 'pessoa.txt'
            escritor.write("\n\n# DADOS PESSOAIS # " +
                    "\nNome: " + Francisco.nome +
                    "\nData de nascimento: " + Francisco.dataNascimento.format((dataFormatada)) +
                    "\nAltura: " + Francisco.altura);
            escritor.close();       // Fecha o escritor

        } catch (FileNotFoundException e){      // Tratamento de erros caso o arquivo não seja encontrado e erros gerais
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Bloco de tratamento de erros para realizar a serialização do arquivo escrito para 'pessoa.bin'  (conversão em bytes)
        try {
            FileOutputStream arquivoSaida = new FileOutputStream("pessoa.bin");
            ObjectOutputStream saida = new ObjectOutputStream(arquivoSaida);
            saida.writeObject(Francisco);       // Escreve os dados do objeto Francisco
            saida.close();      // Encerra o processo de serialização
        } catch (IOException e) {
            e.printStackTrace();        // Tratamento de erros gerais
        }


        // Bloco de tratamento de erros para realizar a desserialização do arquivo 'pessoa.bin' (reconversão de bytes para objeto)
        try {
            FileInputStream arquivoEntrada = new FileInputStream("pessoa.bin");
            ObjectInputStream entrada = new ObjectInputStream(arquivoEntrada);
            Person Franchesco = (Person)entrada.readObject();
            entrada.close();

            Scanner leitor = new Scanner(arquivo);
            while(leitor.hasNextLine()) {       // Laço para executar enquanto estiverem linhas a serem lidas
                System.out.println(leitor.nextLine());      // Chamado para a ler a próxima linha
            }
            leitor.close();     // Fecha o leitor


        } catch (ClassNotFoundException e) {        // Tratamento de erro caso a classe não seja encontrada
            e.printStackTrace();
        } catch (FileNotFoundException e) {         // Tratamento de erro caso o arquivo não seja encontrado
            e.printStackTrace();
        } catch (IOException e) {                   // Tratamento de erros gerais
            e.printStackTrace();
        }
    }
}
