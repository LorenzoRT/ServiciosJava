/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Mensaje;
import pojos.Usuario;

/**
 * REST Web Service
 *
 * @author LOGAN
 */
@Path("usuarios")
public class UsuarioWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of UsuarioWS
     */
    public UsuarioWS() {
    }

    
    
    @Path("registro")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje registrarUsuario(@FormParam("idUsuario")Integer idUsuario,
                                    @FormParam("nombre")String nombre,
                                    @FormParam("apellidoPaterno")String apellidoPaterno,
                                    @FormParam("apellidoMaterno")String apellidoMaterno,
                                    @FormParam("edad")String edad,
                                    @FormParam("usuario")String usuario,
                                    @FormParam("password")String password){
        
        Mensaje resultado;
        Usuario user = new Usuario(idUsuario, nombre, apellidoPaterno, apellidoMaterno, edad, usuario, password);
        SqlSession conn = MyBatisUtil.getSession();
        try{
           
            int codeResult = conn.insert("Usuario.registrarUsuario", user);
            conn.commit();
            System.out.println("Filas afectadas: "+codeResult);
            if (codeResult > 0){
                resultado = new Mensaje(false, "Usuario nuevo resgistrado");
            }else{
                resultado = new Mensaje(true, "El nombre de usuario ya se encuentra registrado");
            }
        }catch(Exception e){
            resultado = new Mensaje(true, e.getMessage());
        }finally{
            conn.close();
        }
        return resultado;
    }
}
