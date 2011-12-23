/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.controller;

import domain.Coordinates;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/plane")
public class PlaneController extends AbstractController {
  
    private int SQcount; 
    Coordinates Coords;
    ModelAndView mv;
  
    @RequestMapping(value="/info.do",method=RequestMethod.POST)    
    public ModelAndView getPlaneInfo(@RequestParam(value="coordGroup", required=true,
                                                   defaultValue="-1") int coordGroup) { 
       if ( coordGroup == -1 ) {
            return new ModelAndView("redirect:/index.do");
        }
        
       Coords = geofacade.getCoordsService().getCoordById(coordGroup);       
       SQcount = geofacade.getSquareCalcService().getCount ( Coords ); 
       
       mv = new ModelAndView("/plane/info");
       mv.addObject("coords", Coords);
       mv.addObject("sqcount", SQcount);
       
       return mv;
   } 
    
     
}