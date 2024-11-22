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

import java.security.InvalidParameterException;


/**
 *
 * @author PROBOOK
 */


public class ListaEncDupla<T>{
    
    No<T> inicio;
    No<T> fim;
    int tamanho;

    public ListaEncDupla() {
        this.tamanho = 0;
    }
    

    public void inserir(T o, Integer posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new InvalidParameterException("Posição inválida");
        }

        No<T> novoNo = new No<>();
        novoNo.setValor(o);

        if (posicao == 0) {
            if (!vazia()) {
                novoNo.setProximo(inicio);
                inicio.setAnterior(novoNo);
            }
            inicio = novoNo;
            fim = novoNo;
        } else {

            No<T> noAnt = inicio;
            for(int i=1; i<posicao; i++){
                noAnt = noAnt.getProximo();
            }

            novoNo.setAnterior(noAnt);
            novoNo.setProximo(noAnt.getProximo());

            if (noAnt.getProximo() != null) {
                noAnt.getProximo().setAnterior(novoNo);
            }
            noAnt.setProximo(novoNo);
        }

        tamanho++;
    }

   
    public boolean inserirObjeto(T o) {
        //inserir no início
        No<T> novoNo = new No<>();
        novoNo.setValor(o);
        // verificar se esta vazio
        if(this.vazia()){
            inicio = novoNo;
            fim = novoNo;
        }else{
            No<T> noAux = inicio;
            // vamos procurar o final da lista
            while (noAux.getProximo() != null){
                noAux = noAux.getProximo();
            }
            novoNo.setAnterior(noAux);
            noAux.setProximo(novoNo);
            fim = novoNo;
        }
        this.tamanho++;
        return true;
    }

    public boolean remover(Object o) {
        if (this.tamanho == 0){
            return false;
        }

        No<T> noAux = this.inicio;
        while(noAux != null && !noAux.getValor().equals(o)){
            noAux = noAux.getProximo();
        }

        if (noAux == null) {
            return false;
        }

        if (noAux == inicio && noAux == fim) {
            this.inicio = null;
            this.fim = null;
        }
        else if (noAux == inicio) {
            noAux.getProximo().setAnterior(null);
            this.inicio = noAux.getProximo();
        }
        else if (noAux == fim) {
            noAux.getAnterior().setProximo(null);
            this.fim = noAux.getAnterior();
        } 
        else {
            noAux.getAnterior().setProximo(noAux.getProximo());
            noAux.getProximo().setAnterior(noAux.getAnterior());
        }

        this.tamanho--;
        System.out.println("ELEMENTO REMOVIDO COM SUCESSO");
        return true;
    }

  
    public Object buscar(Object o) {
        No<T> noAux = inicio;
        while(noAux != null && !noAux.getValor().equals(o)){
            noAux = noAux.getProximo();
        }
        if(noAux == null){
            System.out.println("Valor não encontrado :(");
        }else{
            //return noAux.getValor();
            System.out.println(noAux.getValor());
            System.out.println("VALOR ENCONTRADO\n");
        }
        return null;
    }

   
    public void imprimir() {
        if(this.tamanho > 0){
            No<T> noAux = inicio;
            while(noAux != null){
                System.out.println(noAux.getValor());
                noAux = noAux.getProximo();
            }
        }else{
            System.out.println("Nenhum item na lista :(");
        }
    }
  //   private No inicio;
    public boolean vazia(){
        return this.tamanho == 0;
    }
     
}
