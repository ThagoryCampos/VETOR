/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo_vetor;

/**
 *
 * @author thagory.8187
 */
public class Exemplo_Vetor {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        int soma = 0;
        
        numeros [0] = 12;
        numeros [1] = 50;
        numeros [2] = 78;
        numeros [3] = 140;
        numeros [4] = 6;
        
        for(int i = 0; i < 5; i ++){
            soma = soma + numeros[i];
            
//System.out.println("Numeros na posicao ["  + i + "] possui o valor " + numeros[i]);
        }
        System.out.println(soma);
    }
}
