

/**
 *
 * @author Hernan
 */
public class Validacion {
    
    //recomendacion , todas las validaciones haganlas boolean
    public boolean validarPrecio(int precio)
    {
        if (precio > 0) {
            return true;
        }
        else{
            return false;
        }
        //return precio > 0;
    }
    
    public boolean validarCantidad(int cantidad)
    {
        return cantidad > 0;
    }
    
    public boolean validarNombre(String nombre)
    {
        if (nombre.isEmpty()) {
            return false;
        }
        else{
            return true;
        }
    }
    
    
    
}
