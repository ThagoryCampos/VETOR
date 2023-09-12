/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

/**
 *
 * @author thagory.8187
 */
public class Atividade_6_mesclar_listas {
    public static void main(String args []){
        int qtdPosicoes = 5, qtdPosicoes2 = 5, lista1 = 0, lista2 = 0;
        
        int [] lst1 = new int [qtdPosicoes]; 
        
        lst1 [0] = 1;
        lst1 [1] = 2;
        lst1 [2] = 3;
        lst1 [3] = 4;
        lst1 [4] = 5;
        
        int [] lst2 = new int [qtdPosicoes2]; 
        
        lst2 [0] = 6;
        lst2 [1] = 7;
        lst2 [2] = 8;
        lst2 [3] = 9;
        lst2 [4] = 10;
        
        for(int i = 0; i < lst1.length; i++){
            lista1 = lst1[i];
            System.out.println(lista1);
        }
        
        for(int i = 0; i < lst2.length; i++){
            lista2 = lst2[i];
            System.out.println(lista2);
        }
    }
}
