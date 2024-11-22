/*
................................................................................
INSTITUTO FEDERAL DE CIÊNCIA E TECNOLOGIA DO MARANHÃO
ALGORITMOS E ESTRUTURAS DE DADOS
PROF. HÉLDER PEREIRA BORGES 
ACADÊMICO: VALTER PEREIRA OLIVEIRA 20192SI0027
...............................................................................
*/

package util;

/**
 * Classe que implementa a estrutura da arvore binaria
 * * @author VALTER PEREIRA OLIVEIRA 20192SI0027
 * @param <T> coparador usado para o tipo generico
 */

class No<T> {// T = String, Integer, Double
    private T valor;
//    char nome;
//    int idade;
//    char sexo;
//    char formação;
    //---
    private No<T> proximo;
    private No<T> anterior;
    
    // getters e setters

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }
    
}


