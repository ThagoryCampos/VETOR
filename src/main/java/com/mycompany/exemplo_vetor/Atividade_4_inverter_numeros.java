
  /*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
  Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_vetor;

import com.sun.source.doctree.ReturnTree;
import java.lang.invoke.SwitchPoint;


 
/* * @author thagory.8187
 */
public class Atividade_4_inverter_numeros {
    public static void main(String args []){
        int qtdPosicoes = 6, num = 0;

        int [] numero = new int[qtdPosicoes];

        numero[0] = 1; 
        numero[1] = 2; 
        numero[2] = 3; 
        numero[3] = 4; 
        numero[4] = 5;
        numero[5] = 6;
    
        for(int i = 0; i < numero.length; i++){
           num = numero[i];
            System.out.println(num);
        }
        System.out.println("------Lista Invertida");
        for (int i = 0; i < numero.length; i++){
            System.out.println(num--);
        }
            
            

    }
    
}
