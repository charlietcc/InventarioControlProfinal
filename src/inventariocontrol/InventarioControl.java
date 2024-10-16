
package inventariocontrol;

/**
 *
 * @author Juan Carlos Tubac
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InventarioControl {
    
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Se declara a los categorias principales
        int GestionProductos = 0;
        int ControlExistencias = 0;
        int PedidosCompras = 0;
        int InformesEstadisticas = 0;
        int opcion;
        
         File f = new File("Registro_de_Categoria.txt");
        
        
        System.out.println("Bienvenido al Control de Inventario");     
        System.out.println("Por favor seleccione una de las siguientes opciones: ");
        System.out.println("1. Gestion de Productos ");
        //GestionProductos = scanner.nextInt();
        System.out.println("2. Control de Existenicas ");
        //ControlExistencias = scanner.nextInt();
        System.out.println("3. Pedidos de compra ");
        //PedidosCompras = scanner.nextInt();
        System.out.println("4. Informes y Estadisticas ");
        //InformesEstadisticas = scanner.nextInt();
        opcion = scanner.nextInt();
        
        
        switch (opcion){
            case 1: 
                try {
                    Scanner scanCat = new Scanner(System.in);
                        FileWriter fw = new FileWriter(f, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        System.out.println("Ingrese su codigo: \n");
                        String codigo = scanner.nextLine();
                        System.out.println("Ingrese su nombre: \n");
                        String nombre = scanner.nextLine();
                        System.out.println("ESTA ES UNA PRUBEBA PARA VER LOS CAMBIOS");
                        bw.write(codigo+"|"+nombre+"\n");
                        bw.close();
                        fw.close();
                    } catch (IOException ex) {
                        Logger.getLogger(InventarioControl.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                
        
        
        
        
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
    }
  
}
