
package pojos;

/**
 *
 * @author LOGAN
 */
public class Catalogo {
    
    Integer idCatalogo;
    Integer idTipo;
    String nombre;
    Integer orden;

    public Catalogo() {
    }

    public Catalogo(Integer idCatalogo, Integer idTipo, String nombre, Integer orden) {
        this.idCatalogo = idCatalogo;
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.orden = orden;
    }

    public Integer getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
    
}
