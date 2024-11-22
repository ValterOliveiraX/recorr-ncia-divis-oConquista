package questao2;
/*
................................................................................
INSTITUTO FEDERAL DE CIÊNCIA E TECNOLOGIA DO MARANHÃO
ALGORITMOS E ESTRUTURAS DE DADOS
PROF. HÉLDER PEREIRA BORGES 
ACADÊMICO: VALTER PEREIRA OLIVEIRA 20192SI0027
---------------------------------------------------------------------------------
QUESTÃO 2
2. Dada uma String qualquer, retornar sua quantidade de caracteres.
...............................................................................
*/

public class run {

    public static void main(String[] args) {
        System.out.println(tamanhoString("Valter"));
    }

    static int tamanhoString(String str) {
        if (str.isEmpty()) {
            return 0;
        } else if(str.length() == 1) {
            return 1;
        } else {
            int ini = 0;
            int fim = str.length() - 1;
            int meio = (ini + fim) / 2;
            return tamanhoString(str.substring(ini, meio + 1)) + tamanhoString(str.substring(meio + 1, fim + 1));
        }
    }
    
}
