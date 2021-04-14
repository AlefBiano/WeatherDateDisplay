/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import collection.WeatherDatacollection;
/**
 *
 * @author biano
 */
public class info {
    private String data;
    private float temperatura;
    private float umidade;
    private float pressao;   
    
    public String getData() {
        return data;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public float getPressao() {
        return pressao;
    }
    
    public void setInformacoes(String[] infos){
        data = infos[0];
        temperatura = (Float.parseFloat(infos[1]));
        umidade = (Float.parseFloat(infos[2]));
        pressao = (Float.parseFloat(infos[3]));
        WeatherDatacollection dadoscolect = WeatherDatacollection.getIntances();
        dadoscolect.add(this);
    }
}
