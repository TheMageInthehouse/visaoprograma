/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import java.util.Scanner;
import com.mycompany.modelo.VideoGame;

/**
 *
 * @author vicentin.7910
 */
public class VisaoVideoGame {
    public static VideoGame telaCadastroVideoGame(){
     VideoGame videoGame = new VideoGame();
     
     System.out.println(" ==============CADASTRO DE VIDEO GAME===========  ");
     
     
     System.out.println(" nome:   ");
      videoGame.setNome(new Scanner(System.in).nextLine());
     System.out.println("   preço:  ");       
      videoGame.setPreco(new Scanner(System.in).nextDouble());
     System.out.println("   plataforma:  "); 
      videoGame.setPlataforma(new Scanner(System.in).nextLine());
    System.out.println(" ========================================================");
      return videoGame;
    }
}
