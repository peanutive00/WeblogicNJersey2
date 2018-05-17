package com.WeblogicNJersey2.app;

import com.WeblogicNJersey2.auth.AuthenticationFilter;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {

    public AppConfig() {
        packages("com.WeblogicNJersey2.service");
        register(LoggingFilter.class);
        register(AuthenticationFilter.class);
        //property("jersey.config.beanValidation.enableOutputValidationErrorEntity.server", "true");
    }
    
}
