/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import presenter.attTela;
/**
 *
 * @author biano
 */
public class ultimaAtt implements IObserver{
    private String data;
    private float temperatura;
    private float umidade;
    private float pressao;
    
    public void update(info info){
        data = info.getData();
        temperatura = info.getTemperatura();
        umidade = info.getUmidade();
        pressao = info.getPressao();
        
        attTela.atualizarUltima(data, temperatura, umidade, pressao);
    }
}
