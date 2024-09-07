
/**
 *
 * @author Hernan
 */
public class Categoria {
    
    private String idCategoria,nombreCategoria,desCategoria;

    public Categoria() {
        this.nombreCategoria = "Abarrotes";
    }

    public Categoria(String idCategoria, String nombreCategoria, String desCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.desCategoria = desCategoria;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDesCategoria() {
        return desCategoria;
    }

    public void setDesCategoria(String desCategoria) {
        this.desCategoria = desCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + ", desCategoria=" + desCategoria + '}';
    }
    
    
    
    
}
