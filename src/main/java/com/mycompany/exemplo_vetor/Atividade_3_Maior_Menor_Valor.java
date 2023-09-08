/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

/**
 *
 * @author thagory.8187
 */
public class Atividade_3_Maior_Menor_Valor {
    public static void main(String args []){
        int qtdePosicoes = 5, maior, menor;
        
        
        int [] vetor = new int [qtdePosicoes];
        
        
        vetor [0] = 15;
        vetor [1] = 50;
        vetor [2] = 70;
        vetor [3] = 800;
        vetor [4] = 1000;
        
        maior = vetor[0];
        menor = vetor[0];
        
        for (int i = 0; i < vetor.length; i++){
            if (vetor [i] > maior){
                maior = vetor[i];
            }
        }
        System.out.println("O maior vetor é: " + maior);
        
        for (int i = 0; i > vetor.length; i++){
            if (vetor [i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("O menor vetor é: " + menor);
    
    }
    
}
