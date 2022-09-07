/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author matheus
 */
public interface Builder {
    
    void setTemperatura(int temperatura);
    void setDensidade(float densidade);
    void setDiaNublado(boolean nublado);
    void setPrevisao(String previsao);
    void setRegiao(Regiao regiao);
  
}
