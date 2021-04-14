/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import presenter.attTela;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author biano
 */
public class attTable implements IObserver{
    private ArrayList<info> infoObservers;
    
    public attTable(){
        infoObservers = new ArrayList<info>();
    }
    
    public void update(info info) {
        attTela.attTable(info);
        
    }
}
