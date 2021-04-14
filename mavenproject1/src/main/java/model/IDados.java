/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.WeatherDataDisplayView;

/**
 *
 * @author biano
 */
public interface IDados {
    public void notifyy ();
    public void register (IObserver ob);
}
