package com.WeblogicNJersey2.app;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        packages("com.WeblogicNJersey2.service");
        register(org.glassfish.jersey.filter.LoggingFilter.class);
        property("jersey.config.beanValidation.enableOutputValidationErrorEntity.server", "true");
    }
    
}
