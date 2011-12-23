/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Coordinates;

/**
 *
 * @author Demo
 */
public interface SquareCalcService {
    
    public double distanceBetween(double x, double y);    
    public int getCount(Coordinates coord);    
    public int calcuate ();
    
}
