/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import service.CoordsService;
import service.SquareCalcService;

/**
 *
 * @author Demo
 */
public interface iGeoFacade {
    
    public SquareCalcService getSquareCalcService();       
    public CoordsService getCoordsService();

}
