/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author matheus
 */
public class Director {
    
    public void construirClimaRegiao(Builder builder){
        builder.setTemperatura(30);
        builder.setRegiao(new Regiao("NORDESTE"));
        builder.setDensidade((float) 1.115);
        builder.setDiaNublado(true);
        builder.setPrevisao("Previsão de chuva");
    }
    
    public void constuirClimaCidade(Builder builder){
        builder.setTemperatura(31);
        builder.setRegiao(new Regiao("Cajazeiras"));
        builder.setDensidade((float) 1.119);
        builder.setDiaNublado(false);
        builder.setPrevisao("Não há previsão de chuvas");
    }
        
     
    public void constuirClimaEstado(Builder builder){
        builder.setTemperatura(28);
        builder.setRegiao(new Regiao("Paraíba"));
        builder.setDensidade((float) 1.220);
        builder.setDiaNublado(true);
        builder.setPrevisao("Previsão de chuva");
    }
       
}

