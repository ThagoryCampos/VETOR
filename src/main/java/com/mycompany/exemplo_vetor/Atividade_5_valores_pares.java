/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

/**
 *
 * @author thagory.8187
 */
public class Atividade_5_valores_pares {
    public static void main (String args []){
        int qtdePosicoes = 5, num = 0;


            int [] vetor = new int [qtdePosicoes];

            vetor [0] = 12;
            vetor [1] = 52;
            vetor [2] = 100;
            vetor [3] = 87;
            vetor [4] = 15;
            
        for(int i = 0; i <vetor.length; i++){
            if((vetor[i] % 2) == 0){
                System.out.println("Numero Par");
            }    
        }    
    }
}
