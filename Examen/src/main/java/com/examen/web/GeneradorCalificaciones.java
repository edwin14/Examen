

package com.examen.web;

import java.util.ArrayList;


public class GeneradorCalificaciones {
    
    public static ArrayList<Evaluacion> resultado(){
      
        ArrayList<Evaluacion> arregloalumno= new ArrayList<Evaluacion>();
        
        Evaluacion calif;
        
        calif = new Evaluacion("Petra", (float) 5.8);
        arregloalumno.add(calif);
        
        calif = new Evaluacion("Jose", (float) 7.4);
        arregloalumno.add(calif);
        
        calif = new Evaluacion("Roberta", (float) 5.8);
        arregloalumno.add(calif);
        
       
        return arregloalumno;
        
    }
    
}
