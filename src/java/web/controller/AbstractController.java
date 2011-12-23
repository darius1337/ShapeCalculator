/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.controller;


import facade.iGeoFacade;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Demo
 */
public class AbstractController {
       
    @Autowired protected  iGeoFacade geofacade;
    
    
}


