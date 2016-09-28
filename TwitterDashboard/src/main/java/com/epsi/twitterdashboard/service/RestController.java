package com.epsi.twitterdashboard.service;

import com.epsi.twitterdashboard.model.Tweet;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONObject;

/**
 *
 * @author Alexandre
 * REST Examples => https://www.mkyong.com/webservices/jax-rs/resteasy-hello-world-example/
 */
@Path("/controller")
public class RestController {
    
    @GET
    @Path("/{param}")
    /**
     * M�thode de test pour un appel de service REST avec RESTeasy
     * Accessible via : http://localhost:8080/TwitterDashboard/rest/controller/{param}
     */
    public Response printMessage(@PathParam("param") String msg) {
        // Utilisation des codes de retour http (SC_OK = 200)
        return Response.status(javax.servlet.http.HttpServletResponse.SC_OK)
                .entity("Server received param : " + msg)
                .build();
    }
    
    @GET
    @Path("/get")
    /**
     * M�thode de test pour un appel de service REST avec RESTeasy
     * Renvoi la r�f�rence d'un objet Java
     * Accessible via : http://localhost:8080/TwitterDashboard/rest/controller/get
     */
    public Tweet obj() {
        return new Tweet("test new tweet");
    }
    
    @GET
    @Path("/getJson")
    /**
     * M�thode de test pour un appel de service REST avec RESTeasy
     * Renvoi un objet Java pars� en JSON => /!\ Les getters sont requis pour parser les propri�t�s
     * Accessible via : http://localhost:8080/TwitterDashboard/rest/controller/getJSon
     */
    public String objJson() {
        return new JSONObject(new Tweet("test new tweet")).toString();
    }
    
    /*@GET
    @Path("/get")
    @Produces("application/json")
    public Product getProductInJSON() {
        return new Product("iPad 3", 999);
    }*/
    
    /*@POST
    @Path("/post")
    @Consumes("application/json")
    public Response createProductInJSON(Product product) {
        return Response.status(201).entity("Product created : " + product).build();
    }*/
}
