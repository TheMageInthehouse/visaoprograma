/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.controle.ControleSistema;
import java.util.Scanner;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.VideoGame;


/**
 *
 * @author vicentin.7910
 */
public class VisaoMenu {
    public static int menuPrincipal(){
    
         System.out.println("SISTEMAS DE VENDAS 2.0 MOTHER FUCKER DO BERINBAL DA PARAFUZETA");
         System.out.println("1 - Cadastrar Produto");
         System.out.println(" 2 - alterar produto");
         System.out.println("3 - remover produto");
         System.out.println("4 - listar produto");
         
         int optionMenu = new Scanner (System.in).nextInt();
         
         return optionMenu;
    }
        public static int menuEscolhaProduto(){
         System.out.println("==================cadastrar produto==================");
         System.out.println("qual categoria de produto deseja cadasdtrar ?");
         System.out.println("1 - video game");
         System.out.println("2 - computador");
         System.out.println("=============================");
         int optionProduto = new Scanner(System.in).nextInt();
         
        return optionProduto;
        }   
    public static int menuAlteracaoProduto(){
       System.out.println("================ALTERAR PRODUTO================  ");
       System.out.println("qual produto deseja alterar?");
        
       for(int i = 0; i < ControleSistema.produtos.size(); i++){
           System.out.println(i + 1 + "|" + ControleSistema.produtos.get(i) );
       }
        System.out.println("===================================================");
        int  produtoAlterar = new Scanner(System.in).nextInt();
        return produtoAlterar;
    }
    
      public static Object menuAlteracaoProdutoInformarcoes(Object object){
        if(object instanceof VideoGame){
            System.out.println(" ===================ALTERAR_VIDEO_GAME=============   ");
            System.out.println("novo nome:   ");
            ((VideoGame) object).setNome(new Scanner(System.in).nextLine());
            System.out.println("novo preço");       
            ((VideoGame) object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("novo plataforma"); 
            ((VideoGame) object).setPlataforma(new Scanner(System.in).nextLine());
            System.out.println("====================================================");
        }else if (object instanceof Computador){
            System.out.println(" ====================ALTERAR COMPUTADOR================ ");
            System.out.println("novo nome:   ");
            ((Computador) object).setNome(new Scanner(System.in).nextLine());

            System.out.println("novo preço");       
            ((Computador) object).setPreco(new Scanner(System.in).nextDouble());

            System.out.println("memoria ram:     ");
            ((Computador) object).setMemoriaRam(new Scanner(System.in).nextDouble());

            System.out.println("processador");
            ((Computador) object).setProcessador(new Scanner(System.in).nextLine());
           
            System.out.println("===================================================================");
        }  
        return object;
       }
            public static int menuRemocaoProduto(){
            System.out.println("===============REMOVER PRODUTO==============");    
            System.out.println("qual produto deseja remover:            ");

            for(int i = 0; i < ControleSistema.produtos.size(); i++){
              System.out.println(i + 1 + "|" + ControleSistema.produtos.get(i) );
            }
            System.out.println("======================================================");
            int produtoRemover = new Scanner (System.in).nextInt();


            return produtoRemover;
       }       

    public static int MenuPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
