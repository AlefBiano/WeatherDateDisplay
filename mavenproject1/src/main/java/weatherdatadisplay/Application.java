/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherdatadisplay;
import model.info;
import presenter.mandaDados;
import view.WeatherDataDisplayView;

/**
 *
 * @author biano
 */
public class Application {
    
    private static WeatherDataDisplayView display;
    
    public static WeatherDataDisplayView getTela (){
     return display;   
    }
    
    public static void main (String args[]){
        display = new WeatherDataDisplayView();
        info info = new info();
        mandaDados incluir = new mandaDados();
        incluir.incluiDados(display, info);
    }
    
}
