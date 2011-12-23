/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import dao.CoordsDaoImpl;
import java.util.List;
import domain.Coordinates;
import service.CoordsService;

/**
 *
 * @author Demo
 */
public class CoordsServiceImpl implements CoordsService {
      
    @Override
    public void addCoords (Coordinates coord) {        
        CoordsDaoImpl.addCoord(coord);        
    }
    @Override
    public Coordinates getCoordById (int id) {        
       return CoordsDaoImpl.FindCoord(id);
    }
    @Override
    public int getCoordinateCount () {        
       return CoordsDaoImpl.getCoordinateCount();
    }
    @Override
    public List <Coordinates> getCoords () {        
       return CoordsDaoImpl.getCoords();
    }    
    
}
