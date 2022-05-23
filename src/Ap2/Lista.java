package Ap2;
import Ap2.Elemento;

public class Lista {
    Elemento inicio;
    int quantidade;
    Elemento fim;

    public void Add(Elemento e){
        if(inicio == null){
            inicio = e;
            quantidade++;
            fim = e;
        }else{
            e.prox = inicio;
            inicio = e;
            quantidade++;
        }
    }
    public void addFim(Elemento e){
        if(inicio == null){
            inicio = e;
            quantidade++;
            fim = e;
        }else{
            fim.prox = e;
            fim = e;
            quantidade++;
        }
    }
    public boolean mostrar(){
        if(inicio!= null){
            Elemento aux = inicio;
            while(aux!=null){
                aux.show();
                aux=aux.prox;
            }

            return true;
        }else{
            return false;
        }
    }
    public boolean getInicio(){
        if(inicio!=null){
            inicio.show();
            return true;
        }else{
            return false;
        }
    }

    public boolean getFim(){
        if(fim!=null){
            fim.show();
            return true;
        }else{
            return false;
        }
    }
    public boolean delFim(){
        if(inicio!=null){
            Elemento aux= inicio;
            Elemento pena= inicio;
            while (aux.prox!=null){
                pena=aux;
                aux=aux.prox;
            }
            if (inicio==fim){
                inicio=null;
            }
            pena.prox=null;
            fim=pena;
            quantidade--;
            return true;
        }else{
            return false;
        }
    }
    public boolean delInicio(){
        if(inicio!=null){
            Elemento aux=inicio;
            if(inicio==fim){
                fim=null;
            }
            inicio=aux.prox;
            quantidade--;
            return true;
        }else{
            return false;
        }
    }
    public int find(String palavra){
        int posicao=-1;
        if(inicio!=null){
            Elemento aux= inicio;
            while (aux!=null){
                posicao++;
                if(aux.dado.equals(palavra)){
                    return posicao;
                }
                aux=aux.prox;
            }
            return -1;
        }else{
            return -1;
        }
    }
    public boolean removerPalavra(String palavra){
        int posicao = find(palavra);
        return removerPosicao(posicao);
    }
    public boolean removerPosicao(int posicao){
        if(posicao>quantidade){
            return false;
        }else{
            if(posicao==0){
                return delInicio();
            }else if(posicao==quantidade-1){
                return delFim();
            }else{
                Elemento aux = inicio;
                Elemento ant = inicio;
                for(int i=0;i<posicao;i++){
                    ant= aux;
                    aux=aux.prox;
                }
                ant.prox=aux.prox;
                quantidade--;
                return true;
            }
        }
    }
    public int contador(String palavra){
        int conta = 0;
        Elemento aux = inicio;
        do {
            if (aux.dado.equals(palavra))
                conta++;
            aux = aux.prox;
        } while (aux.prox != null);

        if (conta > 0)
            return conta;
        return -1;
    }
    public void remove(String palavra){
        if(inicio!=null){
            Elemento aux = inicio;
            while(aux!=null){
                if(aux.dado.equals(palavra)){
                    removerPalavra(palavra);
                }
                aux = aux.prox;
            }
        }
    }

}
