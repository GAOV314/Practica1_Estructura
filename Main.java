import java.util.Scanner;
import java.util.Comparator;

public class Main{

public static void main(String args[]){

    SaveInArrayListWalk autoSave = new SaveInArrayListWalk<>();

    Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Registrar automovil");
            System.out.println("2. Buscar automovil");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            // Leer la opción ingresada por el usuario
            opcion = scanner.nextInt();

            // Manejar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la marca del auto: ");
                    String marca = scanner.nextLine();
                    System.out.println("Ingrese el modelo del auto: ");
                    String modelo = scanner.nextLine();
                    System.out.println("Ingrese la linea del auto: ");
                    String linea = scanner.nextLine();
                    System.out.println("Ingrese el precio del auto: ");
                    double precio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese la placa del auto: ");
                    String placa = scanner.nextLine();

                    Auto carro1 = new Auto(marca,modelo,linea,precio,placa);
                    autoSave.doWalk(carro1);
                    break;
                case 2:
                    System.out.println("Seleccionaste la Opción 2");
                    // Agrega aquí el código para la Opción 
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (opcion != 0);

        // Cerrar el scanner
        scanner.close();
    


    
    }
}