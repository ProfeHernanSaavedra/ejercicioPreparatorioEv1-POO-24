
import java.util.Scanner;


/**
 *
 * @author Hernan
 */
public class SistemaInventario {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Validacion val = new Validacion();
        Producto prod = null;
        Categoria cat = null;
        Proveedor prov = null;
        int opc,precio,stock;
        String codigoCat,nomCat,descCat,codProv,nomProv,contactoProv,codProd,nomProd;
        
        do {            
            
            System.out.println("----MENU----");
            System.out.println("1. Ingresar Categoria");
            System.out.println("2. Ingresar Proveedor");
            System.out.println("3. Ingresar Producto");
            System.out.println("4. Mostrar Producto");
            System.out.println("5. Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.print("Ingrese codigo categoria: ");
                    codigoCat = leer.next();
                    System.out.print("Ingrese nombre categoria: ");
                    nomCat = leer.next();
                    leer.nextLine();//tip para nextLine
                    System.out.print("Descripcion categoria: ");
                    descCat = leer.nextLine();
                    
                    cat= new Categoria(codigoCat, nomCat, descCat);
                    break;
                case 2:
                    System.out.print("Ingrese codigo Proveedor: ");
                    codProv = leer.next();
                    System.out.print("Ingrese nombre Proveedor: ");
                    nomProv = leer.next();
                    leer.nextLine();//tip para nextLine
                    System.out.print("Contacto: ");
                    contactoProv = leer.next();
                    prov = new Proveedor(codProv, nomProv, contactoProv);
                    break;
                case 3:
                    System.out.print("Ingrese codigo Producto: ");
                    codProd = leer.next();
                    leer.nextLine();//tip para nextLine
                    System.out.print("Ingrese nombre Producto: ");
                    nomProd = leer.nextLine();
                    if (val.validarNombre(nomProd)==false) {
                        System.out.print("Error,ingrese nombre nuevamente:");
                        nomProd = leer.next();
                    }
                    System.out.print("Ingrese precio Producto: ");
                    precio = leer.nextInt();
                    if (val.validarPrecio(precio)== false) {
                        do {                            
                            System.out.println("Error, Ingrese Precio Nuevamente");
                            precio = leer.nextInt();
                        } while (val.validarPrecio(precio)== false);
                    }
                    
                    System.out.print("Ingrese Stock: ");
                    stock = leer.nextInt();
                    
                    prod = new Producto(codProd, nomProd, precio, stock, prov, cat);
                    
                    break;
                case 4:
                    prod.mostrarInformacionProducto();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
        } while (opc !=5);
        
        
        
        
        
        
    }
    
}
