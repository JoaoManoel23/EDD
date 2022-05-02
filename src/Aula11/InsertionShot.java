package Aula11;
import java.util.Random;

public class InsertionShot {
    public static void main(String[] args) {
        int[] valor = new int[10000];
        Random aleatorio = new Random();
        int atual;

        //Gerando o vetor
        for (int i = 0; i < valor.length; i++) {
            valor[i] = aleatorio.nextInt(10) + 1;
            System.out.println(valor[i] + " ");
        }
        //Ordenando o vetor
        for(int i=1;i<valor.length;i++){
            int j=i-1;
            atual = valor[i];
            while(j>= 0 && atual<valor[j]){
                valor[j+1] = valor[j];
                j--;
            }
            valor[j+1] = atual;
        }
        //vetor ordenado printado
        System.out.println("Vetor ordenado");
        for(int i=0;i<valor.length;i++){
            System.out.println(valor[i]);
        }
    }
}

