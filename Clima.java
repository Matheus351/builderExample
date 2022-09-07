/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author matheus
 */
public class Clima {
    
    int temperatura;
    float densidade;
    boolean nublado;
    String previsao;
    Regiao regiao;
    
    public Clima(Regiao regiao,int temp, float den, boolean nublado, String previsao){
        this.temperatura=temp;
        this.densidade=den;
        this.nublado=nublado;
        this.previsao=previsao;
        this.regiao=regiao;
    }
    
    
    public Regiao getRegiao(){
        return this.regiao;
    }
    
    public void exibirClima(){
        System.out.println("Temperatura:" + this.temperatura + " graus");
        System.out.println("Densidade do ar:" + this.densidade);
        System.out.println("Nublado:" + this.nublado);
        System.out.println("Previsão:" + this.previsao);
    }
    
}
