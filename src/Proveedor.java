/**
 *
 * @author Hernan
 */
public class Proveedor {
    
    private String idProveedor,nomProveedor,contacto; 

    public Proveedor() {
    }

    public Proveedor(String idProveedor, String nomProveedor, String contacto) {
        this.idProveedor = idProveedor;
        this.nomProveedor = nomProveedor;
        this.contacto = contacto;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNomProveedor() {
        return nomProveedor;
    }

    public void setNomProveedor(String nomProveedor) {
        this.nomProveedor = nomProveedor;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nomProveedor=" + nomProveedor + ", contacto=" + contacto + '}';
    }

    public void imprimirProveedor()
    {
        System.out.println("ID Proveedor: " + getIdProveedor());
        System.out.println("Nombre Proveedor: " + this.getNomProveedor());
        System.out.println("Contacto: " + this.getContacto());
    }
    
    
    
}
