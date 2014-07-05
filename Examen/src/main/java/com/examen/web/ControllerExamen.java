

package com.examen.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicio-calificaciones")
public class ControllerExamen {
    
    @RequestMapping(value="/alumnos", method=RequestMethod.GET, headers=("Accept=Application/json"))
    
    public @ResponseBody ArrayList<Evaluacion> mostrar(){
        
        ArrayList<Evaluacion> calificacion = GeneradorCalificaciones.resultado();
        
        return calificacion;
    }
    
    
}
