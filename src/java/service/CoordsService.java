/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import domain.Coordinates;

/**
 *
 * @author Demo
 */
public interface CoordsService {
    
    public void addCoords (Coordinates coord);    
    public Coordinates getCoordById (int id);    
    public int getCoordinateCount ();
    public List <Coordinates> getCoords ();
   
}
