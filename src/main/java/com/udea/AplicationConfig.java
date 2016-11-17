/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea;

import javax.inject.Named;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Pedro Gallego
 */
@Configuration
public class AplicationConfig {
    @Named
    static class JerseyConfig extends ResourceConfig {
        public JerseyConfig(){
        this.packages("com.udea.rest");
        }
    }
    
}
