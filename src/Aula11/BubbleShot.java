package Aula11;

import java.util.Random;

public class BubbleShot {
    public static void main(String[] args){
        int [] valor = new int[10000];
        Random aleatorio = new Random();
        int aux;

        //Gerando o vetor
        for(int i=0;i<(valor.length);i++){
            valor[i] = aleatorio.nextInt(10000)+1;
            System.out.println(valor[i]+" ");
        }
        //Ordenação do vetor
        for(int i=0;i<valor.length;i++){
            for(int j=0;j<(valor.length-1);j++){
                if(valor[j]>valor[j+1]){
                    aux = valor[j];
                    valor[j] = valor[j+1];
                    valor[j+1]=aux;
                }
            }
        }
        //Vetor printado
        System.out.println("Vetor ordenado:");
        for(int i=0;i<valor.length;i++){
            System.out.println(valor[i]);
        }
    }
}
