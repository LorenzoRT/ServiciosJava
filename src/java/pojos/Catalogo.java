
package pojos;

/**
 *
 * @author LOGAN
 */
public class Catalogo {
    
    Integer idcatalogo;
    Integer idTipo;
    String nombre;
    Integer orden;

    public Catalogo() {
    }

    public Catalogo(Integer idcatalogo, Integer idTipo, String nombre, Integer orden) {
        this.idcatalogo = idcatalogo;
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.orden = orden;
    }

    public Integer getIdcatalogo() {
        return idcatalogo;
    }

    public void setIdcatalogo(Integer idcatalogo) {
        this.idcatalogo = idcatalogo;
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
