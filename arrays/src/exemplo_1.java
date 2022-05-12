//Algoritmo feito por Kauê Andrade dos Santos

import java.util.ArrayList;

public class exemplo_1 {
    public static void main(String[] args){

        // O array serve para armazenar vários valores do mesmo tipo
        // tipo[] nomeVariavel = new tipo[5]

        //Uma escola quer armazenar 4 nomes e depois mostrar no

        ArrayList<String> nomes = new ArrayList<String>();; //Cria um array com o tipo String que dá a possibilidade de armazenar 5 nomes
        //Lembrando: começa da posição 0. 0, 1, 2, 3

        //nomes[0] = "Kauê"; //Armazena o nome Breno Araújo na posição 0
        //nomes[1] = "Breno Araújo"; //Armazena o nome Kauê na posição 1
        //nomes[2] = "João"; //Armazena o nome João na posição 2
        //nomes[3] = "Maria"; //Armazena o nome Maria na posição 3

        nomes.add(0, "Kauê"); //Armazena o nome Breno Araújo na posição 0
        nomes.add(1, "Breno Araújo"); //Armazena o nome Kauê na posição 1
        nomes.add(2, "João"); //Armazena o nome João na posição 2
        nomes.add(3, "Maria"); //Armazena o nome Maria na posição 3

        System.out.println(nomes); //Imprime a array nomes

        //System.out.println("\nNome na posição 3: " + nomes[3]); //Consulta o nome na posição 3 do array
        //System.out.println("Nome na posição 1: " + nomes[1]); //Consulta o nome na posição 1 no array

        nomes.remove(2);

        System.out.println(nomes); //Imprime a array nomes

        //for(int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++){ //Usa o laço de repetição for e cria a variável do tipo int denominada posicaoVetor
        //    System.out.println("Nome na posição" + posicaoVetor + ": " + nomes[posicaoVetor] + " "); //Imprime o nome correspondente a posicaoVetor
        //}
    }
}
