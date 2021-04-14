/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;
import weatherdatadisplay.Application;
import model.info;
import view.WeatherDataDisplayView;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author biano
 */
public class attTela {
      public static void atualizarUltima(String data, float temperatura, float umidade, float pressao){
        WeatherDataDisplayView display = Application.getTela();
        display.getdataUltima().setText(data);
        display.gettemperaturaUltima().setText(Float.toString(temperatura));
        display.getumidadeUltima().setText(Float.toString(umidade));
        display.getpressaoUltima().setText(Float.toString(pressao));
    }
    
    public static void attTable(info info){
        
        JTable registroTabela = Application.getTela().gettabelaRegistro();
        
        DefaultTableModel model = (DefaultTableModel) registroTabela.getModel();
        model.addRow(new Object[]{info.getData(), info.getTemperatura(), info.getUmidade(), info.getPressao()});
    }
    
    public static void atualizarMedia (String data, float temperatura, float umidade, float pressao){
        
        WeatherDataDisplayView display = Application.getTela();
        
        
        display.gettemperaturaDadosMedios().setText(Float.toString(temperatura));
        display.getumidadeDadosMedios().setText(Float.toString(umidade));
        display.getpressaoDadosMedios().setText(Float.toString(pressao));

    }
    
    public static void numeroLeituras (int numLeituras){
        WeatherDataDisplayView display = Application.getTela();
        display.getnumRegDadosMedios().setText(Integer.toString(numLeituras));
    }
}
