package presentacion;
import java.util.*;
import controladores.DepartamentoController;
import controladores.CiudadController;

public class Interfaz {
  public static void main(String args[]) {
	  Scanner scanner = new Scanner(System.in);
	  DepartamentoController on = new DepartamentoController();
	  CiudadController o = new CiudadController();
	  
	  String nombre; 
	  int eleccion; 
	  
	  System.out.println("Hacer CRUD CON CIUDAD(1), DEPARTAMENTOS(2)");
	  eleccion = scanner.nextInt();
	  
	  if(eleccion == 1) { 
		  
		  boolean continuar = true; 
	      while (continuar) {
	          System.out.println("Seleccione una opción:");
	          System.out.println("1. Agregar ciudad");
	          System.out.println("2. Obtener ciudad por nombre");
	          System.out.println("3. Actualizar ciudad");
	          System.out.println("4. Eliminar ciudad");
	          System.out.println("5. Mostrar todas las ciudades");
	          System.out.println("6. Salir");
	          int opcion = scanner.nextInt();
	          scanner.nextLine(); // Consumir el salto de línea

	          switch (opcion) {
	              case 1:
	                  o.agregarCiudad();
	                  break;
	              case 2: 
	            	  
	            	  System.out.println("nombre a departamento a buscar"); 
	            	  nombre = scanner.nextLine();
	                  o.buscarCiudades(nombre);
	                  break;
	              case 3:
	            	 
	                  //on.actualizarDepartamento();
	                  break;
	              case 4:
	            	
	            	  System.out.println("nombre a departamento a eliminar");
	            	  nombre = scanner.nextLine();
	                  o.eliminarCiudad(nombre);
	                  break;
	              case 5: 
	            	  
	            	  o.obtenerCiudad();
	            	  break;
	            	  
	              case 6 :
	 
	                  continuar = false;
	                  break;
	              default:
	                  System.out.println("Opción no válida");
	          }
	      }
	      scanner.close();
		  
		  
		  
		  
	  }else if(eleccion ==2) {
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  boolean continuar = true; 
      while (continuar) {
          System.out.println("Seleccione una opción:");
          System.out.println("1. Agregar departamento");
          System.out.println("2. Obtener departamento por nombre");
          System.out.println("3. Actualizar departamento");
          System.out.println("4. Eliminar departamento");
          System.out.println("5. Mostrar todos los departamentos");
          System.out.println("6. Salir");
          int opcion = scanner.nextInt();
          scanner.nextLine(); // Consumir el salto de línea

          switch (opcion) {
              case 1:
                  on.agregarDepartamento();
                  break;
              case 2: 
            	  
            	  System.out.println("nombre a departamento a buscar"); 
            	  nombre = scanner.nextLine();
                  on.buscarDepartamentos(nombre);
                  break;
              case 3:
            	 
                  //on.actualizarDepartamento();
                  break;
              case 4:
            	
            	  System.out.println("nombre a departamento a eliminar");
            	  nombre = scanner.nextLine();
                  on.eliminarDepartamento(nombre);
                  break;
              case 5: 
            	  
            	  on.obtenerDepartamentos();
            	  break;
            	  
              case 6 :
 
                  continuar = false;
                  break;
              default:
                  System.out.println("Opción no válida");
          }
      }
      scanner.close();
	  
	  
	  
  }else { System.out.println("ERROR");
	  
	  
	  
  }
}
  
}
