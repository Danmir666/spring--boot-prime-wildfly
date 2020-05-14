/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milmonosmilmaquinas.bootfaceswild.configuracion;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Clase para configurar la pagina de inicio
 * @author Daniel
 * @version 1.0 27/03/2020
 * @since JDK 1.8
 */
@Configuration
public class SpringBootWelcomePage implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/")
                .setViewName("forward:/index.xhtml");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
