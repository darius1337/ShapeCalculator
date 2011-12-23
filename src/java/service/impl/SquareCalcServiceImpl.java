/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import domain.Coordinates;
import service.SquareCalcService;

/**
 *
 * @author Demo
 */
public class SquareCalcServiceImpl implements SquareCalcService {
   
    @Override
    public double distanceBetween(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public int getCount(Coordinates coord) {        
        return calcuate();        
    }
    @Override
    public int calcuate () {
        
        return 1;
        
    }
  
}
