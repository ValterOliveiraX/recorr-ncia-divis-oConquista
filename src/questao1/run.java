package questao1;
/*
................................................................................
INSTITUTO FEDERAL DE CIÊNCIA E TECNOLOGIA DO MARANHÃO
ALGORITMOS E ESTRUTURAS DE DADOS
PROF. HÉLDER PEREIRA BORGES 
ACADÊMICO: VALTER PEREIRA OLIVEIRA 20192SI0027
--------------------------------------------------------------------------------
QUESTÃO 1
1. Dado uma lista encadeada de inteiros, encontrar a soma de todos os números ímpares e multiplicar pela soma
dos números pares. Os dados de entrada estarão em apenas uma linha, separados por ;

...............................................................................
*/

import java.util.List;

public class run {

    public static void main(String[] args) {
        var numeros = List.of(1, 2, 3, 4, 5, 6);

        System.out.println(somarPares(numeros));
        System.out.println(somarImpares(numeros));
        System.out.println(somarPares(numeros) * somarImpares(numeros));
    }

    static int somarPares(List<Integer> numeros) {
        return parAux(numeros, 0, numeros.size() - 1);
    }

    static int parAux(List<Integer> numeros, int indiceInicial, int indiceFinal) {
        if (indiceInicial != indiceFinal) {
            int meio = (indiceInicial + indiceFinal) / 2;
            return parAux(numeros, indiceInicial, meio) + parAux(numeros, meio + 1, indiceFinal);
        } else {
            if (numeros.get(indiceInicial) % 2 == 0) {
                return numeros.get(indiceInicial);
            } else {
                return 0;
            }
        }
    }

    static int somarImpares(List<Integer> numeros) {
        return imparesAux(numeros, 0, numeros.size() - 1);
    }

    static int imparesAux(List<Integer> numeros, int indiceInicial, int indiceFinal) {
        if (indiceInicial != indiceFinal) {
            int meio = (indiceInicial + indiceFinal) / 2;
            return imparesAux(numeros, indiceInicial, meio) + imparesAux(numeros, meio + 1, indiceFinal);
        } else {
            if (numeros.get(indiceInicial) % 2 == 1) {
                return numeros.get(indiceInicial);
            } else {
                return 0;
            }
        }
    }

}
