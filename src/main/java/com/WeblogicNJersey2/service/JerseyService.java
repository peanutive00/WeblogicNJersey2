package com.WeblogicNJersey2.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/message")
public class JerseyService {
    
    @GET
    @Path("/getMessage")
    @Produces(MediaType.APPLICATION_JSON)
    public String getMsg()
    {
        return "{\"message\":\"Hello World\"}";
    }
    
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/testAuthentic")
    public String testAuthentic(@Context HttpServletRequest req){
        System.out.println(req.getAuthType());
        //boolean b = Authenication.isUserAuthenticated(authString);
        return "{\"message\":\"testing\"}";
    }
    
}
