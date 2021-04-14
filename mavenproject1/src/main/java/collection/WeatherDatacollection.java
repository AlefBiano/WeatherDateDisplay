/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import model.IObserver;
import model.IDados;
import model.info;
import model.ultimaAtt;
import model.attMedia;
import model.attTable;

/**
 *
 * @author biano
 */
public class WeatherDatacollection implements IDados{
    private ArrayList<IObserver> observers;
    private ArrayList<info> infoObservers;
    
    public ArrayList<info> getinfoObservers() {
        return infoObservers;
    }
    
        private static WeatherDatacollection instances;
    
    private ultimaAtt ob1 = new ultimaAtt();
    private attMedia ob2 = new attMedia();
    private attTable ob3 = new attTable();
    
    private WeatherDatacollection (){
        observers = new ArrayList<IObserver>();
        infoObservers = new ArrayList<info>();
        register(ob1);
        register(ob2);
        register(ob3);
    }
    
    
    public  void notifyy (){
        for (int i = 0; i < observers.size(); i++){
            IObserver ob = observers.get(i);
            ob.update(infoObservers.get(infoObservers.size() - 1));
        }
    }
    
    public void register (IObserver ob){
        observers.add(ob);
    }
    
    public void add (info info){
        infoObservers.add(info);
        notify();
    }
    
    public static WeatherDatacollection getIntances (){
        if (instances == null){
            instances = new WeatherDatacollection();
        }
        
        return instances;
    }
}