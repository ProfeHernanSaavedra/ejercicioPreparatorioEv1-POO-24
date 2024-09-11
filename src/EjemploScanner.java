import java.text.SimpleDateFormat;

import java.time.LocalDate;

import java.time.Month;

import java.time.Period;

import java.util.Date;

import java.util.Scanner;







/**

 *

 * @author Hernan

 */

public class EjemploScanner {

   

  public static void main(String[] args) {

     

//    Date fecha = new Date();

//    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

//    String fechaFormateada = formato.format(fecha);

//     

//    System.out.println(fecha);

//    System.out.println(fechaFormateada);

//     

     Scanner leer = new Scanner(System.in);

//     LocalDate fecha2 = LocalDate.of(2024,05,12);

//     LocalDate fecha3 = LocalDate.now();

//     System.out.println(fecha2);

//     System.out.println(fecha3.getMonth());

     

     System.out.println("Ingrese su fecha de Nacimiento, separada por dia , mes y año");

     System.out.print("Ingrese dia:");

     int dia = leer.nextInt();

     System.out.print("Ingrese mes:");

     int mes = leer.nextInt();

     System.out.print("Ingrese año:");

     int año = leer.nextInt();

     LocalDate fechaNac = LocalDate.of(año, mes, dia);

     LocalDate fechaActual = LocalDate.now();

     

     Period periodo = Period.between(fechaNac, fechaActual);

     int edad = periodo.getYears();

     System.out.println("Su edad es: "+edad);

     

//     System.out.print("Ingrese un numero: ");

//     int numero = leer.nextInt();

//     

//     System.out.print("Ingrese palabra: ");

//     String palabra = leer.next();

//     

//     leer.nextLine();

//     System.out.print("Ingrese frase: ");

//     String frase = leer.nextLine();

//     System.out.println("UD es: " + frase);

     

  }

   

    

     

     

   

   

}