package questao3;
/*
................................................................................
INSTITUTO FEDERAL DE CIÊNCIA E TECNOLOGIA DO MARANHÃO
ALGORITMOS E ESTRUTURAS DE DADOS
PROF. HÉLDER PEREIRA BORGES 
ACADÊMICO: VALTER PEREIRA OLIVEIRA 20192SI0027
---------------------------------------------------------------------------------
QUESTÃO 3
3. Na loja do DCOMP está rolando uma promoção na compra de chocolates, a cada X unidades você ganha um
chocolate extra. Considerando as variáveis Dinheiro (quantidade em R$ disponível), unidade (preço de um
chocolate) e troca (quantidade de unidades para ganhar um chocolate extra), desenvolver uma solução com o
objetivo de identificar a quantidade máxima de balas que podem ser adquiridas. Todos os valores sempre serão
maiores que 0.
...............................................................................
*/

class run {

    public static void main(String[] args) {
        System.out.println(qtdChocolate(16, 2, 2));
        System.out.println(qtdChocolate(15, 1, 3));
        System.out.println(qtdChocolate(20, 3, 5));
        System.out.println(qtdChocolate(14, 1, 3));
    }

    static int qtdChocolate(int dinheiro, int unidade, int troca) {
        int qtdChocolate = (dinheiro / unidade);
        return qtdChocolate + qtdChocolateExtra(qtdChocolate, troca);
    }

    static int qtdChocolateExtra(int qtdChocolate, int troca) {
        int qtdExtra = qtdChocolate / troca;
        int qtdRestante = qtdChocolate % troca;

        if (qtdExtra == 0) {
            return 0;
        }

        return qtdExtra + qtdChocolateExtra(qtdExtra + qtdRestante, troca);
    }

}