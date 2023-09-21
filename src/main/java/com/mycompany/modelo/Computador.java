/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author vicentin.7910
 */
public class Computador extends Produto {
    private Double memoriaRam;
    private String processador;

    public Computador() {
    }

    public Double getMemmoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Double memmoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "Nome:   " + super.getNome() + 
                "| preço:   " + super.getPreco() + 
                 "| memoriaRam:  " + this.memoriaRam + 
                  "|  preocessador:  " + this.processador;
    }

    
    
    
}
