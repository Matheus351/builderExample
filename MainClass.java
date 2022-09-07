/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author matheus
 */
public class MainClass {
    
    
    public static void main(String [] args){
        
        Director director = new Director();
        
        ClimaCidadeBuilder builder = new ClimaCidadeBuilder();
        ClimaRegiaoBuilder builder2 = new ClimaRegiaoBuilder();
        ClimaEstadoBuilder builder3 = new ClimaEstadoBuilder(); 
        
        director.constuirClimaCidade(builder);
        director.construirClimaRegiao(builder2);
        director.constuirClimaEstado(builder3);
        
        
        
        Clima clima = builder.getResult();
        System.out.println("Clima para cidade " + clima.getRegiao().nome+":");
        clima.exibirClima();
        System.out.println("\n -----------------");
        
        Clima clima2 = builder2.getResult();
        System.out.println("Clima para região " + clima2.getRegiao().nome+":");
        clima2.exibirClima();
        System.out.println("\n -----------------");
        
        Clima clima3 = builder3.getResult();
        System.out.println("Clima para o estado " + clima3.getRegiao().nome+":");
        clima3.exibirClima();
        System.out.println("\n -----------------");
        
        
    }
}
