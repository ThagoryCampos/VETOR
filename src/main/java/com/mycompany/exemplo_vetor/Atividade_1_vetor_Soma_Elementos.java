/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

/**
 *
 * @author thagory.8187
 */
public class Atividade_1_vetor_Soma_Elementos {
    public static void main(String args[]){
        int soma = 0;
        int [] numeros = new int [4];
                
        numeros [0] = 5;
        numeros [1] = 3;
        numeros [2] = 2;
        numeros [3] = 1;
            
        for (int i = 0; i < 4; i++){
        soma = soma + numeros[i];
            
        }
        System.out.println("A soma dos vetores é: " + soma);
    }
}
