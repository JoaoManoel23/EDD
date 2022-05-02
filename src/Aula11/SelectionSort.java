package Aula11;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] valor = new int[10000];
        Random aleatorio = new Random();
        int menor,aux;

        //Gerando o vetor
        for (int i = 0; i < valor.length; i++) {
            valor[i] = aleatorio.nextInt(10000) + 1;
            System.out.println(valor[i] + " ");
        }
        //Ordenando o vetor
        for(int i =0;i<valor.length;i++){
            menor=i;
            for(int j=i+1;j< valor.length;j++){
                if(valor[j]<valor[menor]){
                    menor=j;
                }
            }
            aux =valor[menor];
            valor[menor] = valor[i];
            valor[i] = aux;
        }
        //Printando o vetor ordenado
        System.out.println("Vetor ordenado");
        for(int i=0;i<valor.length;i++){
            System.out.println(valor[i]);
        }
    }

}
