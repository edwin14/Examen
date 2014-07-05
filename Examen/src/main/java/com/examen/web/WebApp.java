
package com.examen.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebApp extends AbstractAnnotationConfigDispatcherServletInitializer {
    

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
       return new Class<?>[]{WebAppconfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{
            "/calificacion/*"
        };
    }
}
