/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa;

import com.mycompany.controle.ControleSistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;

/**
 *
 * @author vicentin.7910
 */
public class SistemaVendas_2_0 {

    public static void main(String[] args) {
        int optionMenu;
     
        while(true){
            optionMenu = VisaoMenu.menuPrincipal();
       
            if(optionMenu == Constantes.CADASTRAR){
                ControleSistema.cadastrar();
            }else if(optionMenu == Constantes.ALTERAR){
              ControleSistema.alterar(VisaoMenu.menuAlteracaoProduto());
            }else if(optionMenu == Constantes.LISTAR){
               ControleSistema.listar(ControleSistema.produtos);
            }
        }
    }
}

