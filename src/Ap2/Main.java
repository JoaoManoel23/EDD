package Ap2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Lista palavras = new Lista();
        int op=0;
        Scanner tc = new Scanner(System.in);
        do{
            System.out.println("Digite a opção");
            System.out.println("1.Para add");
            System.out.println("2.Para add fim");
            System.out.println("3.Para mostrar a lista");
            System.out.println("4.Para mostrar o primeiro elemento da lista");
            System.out.println("5.Para mostrar o ultimo elemento da lista");
            System.out.println("6.Para remover no fim");
            System.out.println("7.Para remover no inicio");
            System.out.println("8.Para remover uma posição");
            System.out.println("9.Para remover uma palavra");
            System.out.println("10.Para pesquisar uma palavra");
            System.out.println("11.Para mostrar quantas vezes aparece uma palavra na lista");
            System.out.println("12.Para remover todas as palavras com base em uma string passada ");
            System.out.println("13.Para finalizar o programa");
            op=tc.nextInt();
            switch(op){
                case 1: {
                    System.out.println("Digite uma palavra");
                    String value = tc.next();
                    Elemento e = new Elemento(value);
                    palavras.Add(e);
                    break;
                }
                case 2: {
                    System.out.println("Digite uma palavra");
                    String value = tc.next();
                    Elemento e = new Elemento(value);
                    palavras.addFim(e);
                    break;
                }
                case 3: {
                    if(!palavras.mostrar()){
                        System.out.println("Lista Vazia");
                    }
                    break;
                }
                case 4: {
                    if(!palavras.getInicio()){
                        System.out.println("Lista Vazia");
                    }
                    break;
                }
                case 5: {
                    if(!palavras.getFim()){
                        System.out.println("Lista vazia");
                    }
                    break;
                }
                case 6: {
                    if(palavras.delFim()){
                        System.out.println("Elemento removido");
                    }
                    break;
                }
                case 7: {
                    if(palavras.delInicio()){
                        System.out.println("Elemento removido");
                    }
                    break;
                }
                case 8: {
                    System.out.println("Qual posição você deseja remover?");
                    int value = tc.nextInt();
                    System.out.println(palavras.removerPosicao(value));
                    break;
                }
                case 9: {
                    System.out.println("Qual palavra você deseja remover?");
                    String value = tc.next();
                    System.out.println(palavras.removerPalavra(value));
                    break;
                }
                case 10: {
                    System.out.println("Qual palavra você deseja saber?");
                    String value = tc.next();
                    int posicao=palavras.find(value);
                    if(posicao!=-1){
                        System.out.println("O elemento está na posição "+posicao);
                    }else{
                        System.out.println("Essa palavra não existe na lista");
                    }
                    break;
                }
                case 11: {
                    System.out.println("Qual palavra você deseja conferir");
                    String value = tc.next();
                    int conta=palavras.contador(value);
                    if(conta!=-1){
                        System.out.println("O elemento aparece:"+conta);
                    }else{
                        System.out.println("Essa palavra não existe na lista");
                    }
                    break;

                }
                case 12: {
                    System.out.println("Qual palavra você deseja remover");
                    String value = tc.next();
                    palavras.remove(value);
                    break;
                }
            }

        }while(op!=14);

    }
}
