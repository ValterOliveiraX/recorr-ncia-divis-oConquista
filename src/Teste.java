/**
................................................................................
INSTITUTO FEDERAL DE CIÊNCIA E TECNOLOGIA DO MARANHÃO
ALGORITMOS E ESTRUTURAS DE DADOS
PROF. HÉLDER PEREIRA BORGES
ACADÊMICO: VALTER PEREIRA OLIVEIRA 20192SI0027
...............................................................................
*/

import lerarquivo.Arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Teste {

    /**
     * Classe principal
     * * @author VALTER PEREIRA OLIVEIRA 20192SI0027
     *
     * @param <T> coparador usado para o tipo generico
     */


    public static void main(String[] args) throws IOException {

        // Dados simples lidos do arquivo
        List<String> dados = Arquivo.lerDadosSimples("src//entrada//dados.txt");

        // Abre o arquivo de comandos
        BufferedReader buffered = new BufferedReader(new FileReader("src//entrada//exec.txt"));

        // Lê a primeira linha dos comandos, essa linha define a estrutura
        String estrutura = buffered.readLine();

        // Faz a leitura dos comandos restantes no arquivo
        String linha = "";
        List<String> comandos = new ArrayList<>();
        while ((linha = buffered.readLine()) != null) {
            comandos.add(linha);
        }

        // Verfica qual estrutura foi selecionada e executa as acoes correspondentes
        System.out.println("\n -----NIVELAMENTO ------\nA estrutura selecionada foi " + estrutura + "\n-----------------------------");
        switch (estrutura) {
            case "lista":
                //Pilhas filas ou arvore <String> pilha = new Pilhas<>();
                // exemplo dados.forEach(dado -> pilha fila ou arvore .inserirObjeto(dado));

                comandos.forEach(comando -> {
                    String[] acao = comando.split(";");
                    System.out.println("\nCOMANDO SELECIONADO : " + acao[0] + "\n");
                    switch (acao[0]) {
                        case "REMOVER":
                            System.out.println("\nselecionado remover\n");
                            break;
                        case "IMPRIMIR":
                            System.out.println("\nselecionado imprimir\n");
                            break;
                        case "INSERIR":
                            System.out.println("\nselecionado inserir\n");
                            break;
                        case "BUSCAR":
                            System.out.println("\nselecionado buscar\n");
                            break;
                    }
                });
                break;
            case "pilha":
                //Pilhas filas ou arvore <String> pilha = new Pilhas<>();
                //dados.forEach(dado -> pilha.inserirObjeto(dado));

               /*
                comandos.forEach(comando -> {
                    String[] acao = comando.split(";");
                    System.out.println("\nCOMANDO SELECIONADO : " + acao[0] + "\n");
                    switch (acao[0]) {
                        case "REMOVER":
                            System.out.println("\nselecionado remover\n");
                            break;
                        case "IMPRIMIR":
                            System.out.println("\nselecionado imprimir\n");
                            break;
                        case "INSERIR":
                            System.out.println("\nselecionado inserir\n");
                            break;
                        case "BUSCAR":
                            System.out.println("\nselecionado buscar\n");
                            break;
                    }
                });
                */
                break;
            case "fila":
                //Pilhas filas ou arvore <String> pilha = new Pilhas<>();
                // exemplo dados.forEach(dado -> pilha.inserirObjeto(dado));

                /*
                comandos.forEach(comando -> {
                    String[] acao = comando.split(";");
                    System.out.println("\nCOMANDO SELECIONADO : " + acao[0] + "\n");
                    switch (acao[0]) {
                        case "REMOVER":
                            System.out.println("\nselecionado remover\n");
                            break;
                        case "IMPRIMIR":
                            System.out.println("\nselecionado imprimir\n");
                            break;
                        case "INSERIR":
                            System.out.println("\nselecionado inserir\n");
                            break;
                        case "BUSCAR":
                            System.out.println("\nselecionado buscar\n");
                            break;
                    }
                });
                */
                break;
            case "arvore":
                //Pilhas filas ou arvore <String> pilha = new Pilhas<>();
                // exemplo dados.forEach(dado -> pilha, fila arvore .inserirObjeto(dado));
                /*
                comandos.forEach(comando -> {
                    String[] acao = comando.split(";");
                    System.out.println("\nCOMANDO SELECIONADO : " + acao[0] + "\n");
                    switch (acao[0]) {
                        case "REMOVER":
                            System.out.println("\nselecionado remover\n");
                            break;
                        case "IMPRIMIR":
                            System.out.println("\nselecionado imprimir\n");
                            break;
                        case "INSERIR":
                            System.out.println("\nselecionado inserir\n");
                            break;
                        case "BUSCAR":
                            System.out.println("\nselecionado buscar\n");
                            break;
                    }
                });
                break;
            default:
                System.out.println("Opção inválida");
                */
                break;
        }
        // Fecha o arquivo
        buffered.close();
    }
}
