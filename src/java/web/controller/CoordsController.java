/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.controller;

import javax.validation.Valid;
import domain.Coordinates;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping ("/coordinates")
public class CoordsController extends AbstractController {     
          
    @RequestMapping(value="/add.do",method=RequestMethod.POST) 
    public ModelAndView addCoords(@Valid Coordinates coord, BindingResult bindingResult) {
             
        if ( !bindingResult.hasErrors() ){
           geofacade.getCoordsService().addCoords(coord); 
        }    
       return new ModelAndView("redirect:/index.do");
    }
    
    @RequestMapping("/newCoordinate.do") 
    public ModelAndView newCoord() { 
       return new ModelAndView("/coords/addnew");
    }  
       
    
}