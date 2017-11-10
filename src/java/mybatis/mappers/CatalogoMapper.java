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
    
    public List<Catalogo> getAllCatalogos();
    public List<Catalogo> getCatalogoByIdtipo(Integer id);
    
}
