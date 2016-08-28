/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.jee.alexius_diakogiannis.lightjee7withjaxrs.services.rest;

import com.google.gson.Gson;
import gr.jee.alexius_diakogiannis.lightjee7withjaxrs.model.json.HelloWorld;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Alexis-Dionisis
 */
@Stateful
@Path("/myservice")
public class MyRestService {
    
    @GET
    @Path("/simple")
    // /api/myservice/simple
    @Produces(MediaType.TEXT_PLAIN)
    public Response mySimpleRest(){
        return Response.ok().entity("Hello World").build();
    }
    
    @POST
    @Path("/speakout")
    @Produces(MediaType.APPLICATION_JSON)
    public Response speakOutMyName(){
        
        HelloWorld hw = new HelloWorld();
        List<String> cities = new ArrayList();
        
        cities.add("Athens");
        cities.add("Paris");
        
        hw.setMyName("Alexius");
        hw.setMyCities(cities);
        
        Gson gson = new Gson();
        
        String jsonString = gson.toJson(hw);
        
        return Response.ok().entity(jsonString).build();
    }
    
}
