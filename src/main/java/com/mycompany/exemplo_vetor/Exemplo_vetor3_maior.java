/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

/**
 *
 * @author thagory.8187
 */
public class Exemplo_vetor3_maior {
    public static void main (String args []){
        int qtdePosicoes = 5, maior;
        
        
        int [] vetor = new int [qtdePosicoes];
        
        vetor [0] = 12;
        vetor [1] = 52;
        vetor [2] = 100;
        vetor [3] = 87;
        vetor [4] = 15;
        
        maior = vetor[0];
        
        for(int i = 0; i < vetor.length; i++) { //refere-se a todas as casas do vetor, altera somente na variavel
            if(vetor [i] > maior ){
                maior = vetor[i];
            }
//            System.out.println(vetor[i]);
        }
        System.out.println("O maior valor neste vetor é: " + maior);
        
    }
    
}
