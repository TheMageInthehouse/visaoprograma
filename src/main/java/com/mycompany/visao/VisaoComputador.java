/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import java.util.Scanner;
import com.mycompany.modelo.Computador;

/**
 *
 * @author vicentin.7910
 */
public class VisaoComputador {
    public static Computador telaCadastroComputador(){
    Computador computador = new Computador();
    
    System.out.println("================= CADASTRO DE COMPUTADOR==============  ");
  System.out.println("Nome:  ");
    computador.setNome(new Scanner(System.in).nextLine());
   System.out.println("preço:  ");
    computador.setPreco(new Scanner(System.in).nextDouble());
    System.out.println("memoria ram:  ");
    computador.setMemoriaRam(new Scanner(System.in).nextDouble());
    System.out.println("procesador:  ");
    computador.setProcessador(new Scanner(System.in).nextLine());
    System.out.println(" =====================================================   ");
    return computador;
    }
}
