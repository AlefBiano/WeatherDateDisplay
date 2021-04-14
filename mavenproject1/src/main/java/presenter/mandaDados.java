/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;
import weatherdatadisplay.Application;
import model.info;
import view.WeatherDataDisplayView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author biano
 */
public class mandaDados {
  public void incluiDados(WeatherDataDisplayView display, info info){
        display.getincluirDadosTempo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviar(display, info);
            }
        });
    }
    
    private void enviar(WeatherDataDisplayView display, info info){
        String dados[] = new String[4];
        dados[0] = display.getdataIncluir().getText();
        dados[1] = display.gettemperaturaIncluir().getText();
        dados[2] = display.getumidadeIncluir().getText();
        dados[3] = display.getpressaoIncluir().getText();
        info.setInformacoes(dados);
        
       }
    
    public static int getIndex(){
        WeatherDataDisplayView tela = Application.getTela();
        return tela.getcomboPeriodo().getSelectedIndex();
    }      
}
