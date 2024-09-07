
/**
 *
 * @author Hernan
 */
public class Producto {
    
    private String idProducto,nomProducto;
    private int precio,stock;
    private Proveedor proveedor;
    private Categoria categoria;

    public Producto() {
    }

    public Producto(String idProducto, String nomProducto, int precio, int stock, Proveedor proveedor, Categoria categoria) {
        
        //Validacion objVal = new Validacion();
       // if (objVal.precio(precio)){
            this.precio = precio;
            //this.setPrecio(precio);
        //}
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
       // if (objVal.cantidad(stock)) {
            this.stock = stock;
       // }
        this.proveedor = proveedor;
        this.categoria = categoria;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        //if(precio > 0)
       // {
            this.precio = precio;
      //  }
      //  else{
     //       System.out.println("El precio debe ser mayor a cero");
      //  }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nomProducto=" + nomProducto + ", precio=" + precio + ", stock=" + stock + ", proveedor=" + proveedor + ", categoria=" + categoria + '}';
    }
    
    public void mostrarInformacionProducto()
    {
        System.out.println("Producto: " + this.getNomProducto());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Cantidad de Stock: " + this.getStock());
        System.out.println("Categoria: " + this.getCategoria().getNombreCategoria());
        System.out.println("Proveedor: " + this.getProveedor().getNomProveedor());
    }
    
    public void comprarProducto(int cantidad)
    {
        System.out.println("El stock actual es: " + this.getStock());
        if (this.getStock()>= cantidad) {
            int total = this.getPrecio() *  cantidad;
            this.setStock(this.getStock()-cantidad);
            System.out.println("El nuevo stock es: " + this.getStock());
            System.out.println("El total de la compra es: $" + total);
        }
        else{
            System.out.println("No hay stock del producto o hay un error");
        }
    }
    
    
    
}
