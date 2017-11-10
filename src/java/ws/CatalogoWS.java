/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import pojos.Catalogo;

/**
 * REST Web Service
 *
 * @author LOGAN
 */
@Path("catalogos")
public class CatalogoWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CatalogosWS
     */
    public CatalogoWS() {
    }

    @Path("all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Catalogo> getAll(){
        List<Catalogo> lista = new ArrayList<>();
        Catalogo miCatalogo;
        // Simulacion de consulta a la BD select * from catalogo
        for (int i = 1; i <= 100; i++) {
            miCatalogo = new Catalogo(i,i,"Nombre: "+i,i);
            lista.add(miCatalogo);
        }
        return lista;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("byId/{idCatalogo}")
    public Catalogo getCatalgoById (@PathParam("idCatalogo")Integer idCatalogo){
        Catalogo catalogo = new Catalogo(idCatalogo, 200,
                                    "Catalogo by ID", 0);
        return catalogo;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("byAll/{idCatalogo},{idTipo},{nombre},{orden}")
    public Catalogo getCatalgoById (@PathParam("idCatalogo") Integer idCatalogo,
                                    @PathParam("idTipo")     Integer idTipo,
                                    @PathParam("nombre")     String nombre,
                                    @PathParam("orden")      Integer orden){
        
        Catalogo catalogo = new Catalogo(idCatalogo, idTipo, nombre, orden);
        return catalogo;
    }
}
