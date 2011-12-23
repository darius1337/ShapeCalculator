/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.controller;

import domain.Coordinates;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/index.do")
public class HomeController extends AbstractController {
        
    @RequestMapping(method=RequestMethod.GET, value="/")
    public ModelAndView goToPage(@RequestParam(value="pid", required=true, defaultValue="0") int pid) {
       
     List <Coordinates> coords = geofacade.getCoordsService().getCoords();

         return new ModelAndView("/home/index", "coords", coords);
         
        
    }
 
   
}
