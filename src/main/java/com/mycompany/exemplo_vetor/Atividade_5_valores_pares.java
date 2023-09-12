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
        int qtdePosicoes = 8, contPar = 0, contImpar = 0;


            int [] vetor = new int [qtdePosicoes];
            
            
            vetor [0] = 12;
            vetor [1] = 52;
            vetor [2] = 101;
            vetor [3] = 22;
            vetor [4] = 87;
            vetor [5] = 46;
            vetor [6] = 88;
            vetor [7] = 72;
            
            
        for(int i = 0; i < vetor.length; i++){
            if((vetor[i] % 2) == 0){
                contPar++;
            }else{
                contImpar++;
            }
        }
       
        int [] numPar = new int [contPar];
        int [] numImpar = new int [contImpar];
        
        System.out.println("Numeros pares!");
        for(int i = 0; i < vetor.length; i++){
            if((vetor[i] % 2) == 0){                
                contPar = vetor[i];
                System.out.println(vetor[i]);
            }
            
        }
        System.out.println("Numeros Impares!");
        for(int i = 0; i < vetor.length; i++){
            if((vetor[i] % 2) == 0){
            }else{
                contImpar = vetor[i];
                System.out.println(vetor[i]);
            }
        }    
    }            
}
