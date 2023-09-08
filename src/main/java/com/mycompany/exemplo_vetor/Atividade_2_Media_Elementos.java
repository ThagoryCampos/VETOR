/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

/**
 *
 * @author thagory.8187
 */
public class Atividade_2_Media_Elementos {
    public static void main (String args []){
        float soma = 0;
        float [] numeros = new float[4];        
        float media = 0;
        
        numeros [0] = 9;
        numeros [1] = 8;
        numeros [2] = 7;
        numeros [3] = 6;
    
        for(int i = 0; i < 4; i++){
            soma = soma + numeros[i];
                
        }
        System.out.println("A soma dos vetores é: " + soma);
        
        media = soma / numeros.length;
        System.out.println("A media dos vetores é: " + media);
    }
    
}
