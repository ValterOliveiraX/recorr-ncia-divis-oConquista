public class Main {

    public static void main(String[] args) {
        System.out.println("atividade");
        int[] dados = {120, 150, 15, 1234, 2};
        int start = 0;
        int maior;
        int menor;
        maior = max(dados, start, dados.length - 1);
        menor = min(dados, start, dados.length - 1);
        System.out.println("\n Numero maior: " + maior + "\n Numero menor " + menor);


        //bogosort
        Bogosort(dados);
        System.out.println();
    }

//===================   esruturas =================================

    //if (a, b) a:b
    //  QUESTAO UM:
    public int[] maior(int[] numeros) {
        int[] maiormenor = {0, 0};
        int valormaior = 0; // inicializando o valor
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiormenor[0])
                maiormenor[0] = numeros[i];
            if (numeros[i] > maiormenor[1])
                maiormenor[1] = numeros[i];
        }
        return maiormenor;
    }

    public static int max(int vet[], int ini, int fim) { //EXEMPLO: max(dados[], int 0; dados.lenth){}
        if (fim - ini <= 1) {//CASO TRIVIAL
            return (vet[ini] > vet[fim]) ? vet[ini] : vet[fim];
        } else {
            int meio = (ini + fim) / 2;
            int aux1 = max(vet, ini, meio);
            int aux2 = max(vet, meio + 1, fim);
            return (aux1 > aux2) ? aux1 : aux2;
        }
    }

    public static int min(int vet[], int ini, int fim) {//EXEMPLO: min(dados[], int 0; dados.lenth){}
        if (fim - ini <= 1) {
            return (vet[ini] < vet[fim]) ? vet[ini] : vet[fim];
        } else {
            int meio = (ini + fim) / 2;
            int aux1 = min(vet, ini, meio);
            int aux2 = min(vet, meio + 1, fim);
            return (aux1 < aux2) ? aux1 : aux2;
        }
    }
    //QUESTAO 2


    int BuscaBinariaRecursiva(int[] dados, int ini, int fim, int chave) {
        if (ini > fim) {
            return -1;
        }

        int meio = (ini + fim) / 2;

        if (dados[meio] == chave) {
            return meio;
        } else if (dados[meio] > chave) {
            return BuscaBinariaRecursiva(dados, meio - 1, meio + 1, chave);
        } else {
            return BuscaBinariaRecursiva(dados, meio - 1, meio - 1, chave);
        }

    }


    //-----------------TESTE DO BOGO SORT ------------------------
    static void Bogosort(int[] dados) {

        while (!ordenado(dados)) {
            permutar(dados);
        }
    }

    static void permutar(int[] dados) {
        for (int x = 0; x < dados.length; ++x) {
            int index1 = (int) (Math.random() * dados.length),
                    index2 = (int) (Math.random() * dados.length);
            int a = dados[index1];
            dados[index1] = dados[index2];
            dados[index2] = a;
        }
    }

    static boolean ordenado(int[] dados) {
        for (int x = 0; x < dados.length - 1; ++x) {
            if (dados[x] > dados[x + 1]) {
                return false;
            }
        }
        return true;
    }
}
//----------- combosort -------------------
/*
    int CombSort(int[] dados, int ini, int fim, int chave) {

}
*/
