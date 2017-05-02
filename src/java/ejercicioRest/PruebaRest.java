/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioRest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Nectia
 */
@Path("respuesta")
public class PruebaRest {

    @GET
    public String respuesta(){
        return "Hello world ...";
    }
}
