/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builder;

/**
 *
 * @author matheus
 */
public class ClimaCidadeBuilder implements Builder {
    
    Regiao regiao;
    int temperatura;
    float densidade;
    String previsao;
    boolean nublado;
    
    @Override
    public void setTemperatura(int temperatura) {
      this.temperatura=temperatura;
    }

    @Override
    public void setDensidade(float densidade) {
      this.densidade=densidade;
    }

    @Override
    public void setDiaNublado(boolean nublado) {
        this.nublado=nublado;
    }

    @Override
    public void setPrevisao(String previsao) {
      this.previsao=previsao;
    }

    @Override
    public void setRegiao(Regiao regiao) {
      this.regiao=regiao;
    }
    
    public Clima getResult() {
        return new Clima(regiao,temperatura,densidade,nublado,previsao);
    }
    
}
