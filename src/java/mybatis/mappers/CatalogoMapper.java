/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.mappers;

import java.util.List;
import pojos.Catalogo;

/**
 *
 * @author LOGAN
 */
public interface CatalogoMapper {
    
    //Consultas catalogo
    public List<Catalogo> getAllCatalogos();
    public List<Catalogo> getCatalogoByIdtipo(Integer id);
    
    //Metodo para agregar catalogo
    public void registrarCatalogo(Integer idCatalogo, String nombre, Integer idTipo, Integer orden);
    
    //Metodo para editar registro
    public void actualizarCatalogo(Integer idcatalogo, String nombre, Integer orden);
    
    public void eliminarCatalogo(Integer idcatalogo);
    
}
