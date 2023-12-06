package com.ejem;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/saludar")
public class GreetingResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "Esto es lo del Mver";
    }

    @GET
    @Path("/tardes")
    @Produces(MediaType.APPLICATION_JSON)
    public String tardes() {
        return "Esto es lo del Tardes";
    }
}
