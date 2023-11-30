import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuInventario {

    public static void main (String[] args) {
        try {
            File file = new File("resources/Inventario.csv");
            Scanner fileScanner = new Scanner(file);
            //Saltar el encabezado del CSV
            fileScanner.nextLine();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] productInfo = line.split(",");
                System.out.println(productInfo[0]);
                System.out.println(line);
                //TODO implement the logic to transform this code so it can convert the information in each line into a Product objet
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        MenuHandler menuHandler = new MenuHandler();

        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            menuHandler.handleUserChoice(choice);
        } while (choice != 8);


        System.out.println("Saliendo del programa...");
        scanner.close();
    }


        static void displayMenu () {

            System.out.println(
                    """
                            |o|                         /////////////\\\\\\
                            |o|                        (((((((((((((   \\\\\\
                            |o|                        ))) ~~      ~~   (((
                            |o|                        ((( (*)     (*)  )))
                            |o|                        )))     <        (((\s
                            |o|                        ((( '\\______/`   )))\s
                            |o|                        )))\\___________/(((\s
                            |o|                        (((   _)  (_    )))\s\s
                            |o|                              /\\__/\\""");
            System.out.println("±----------------------------------------±");
            System.out.println("|   Administrador Mi Tienda de Barrio    |");
            System.out.println("±----------------------------------------±");
            System.out.println("1. Agregar producto                      |");
            System.out.println("2. Eliminar producto                     |");
            System.out.println("3. Actualizar producto                   |");
            System.out.println("4. Ver todos los productos               |");
            System.out.println("5. Buscar producto                       |");
            System.out.println("6. Generar reporte                      |");
            System.out.println("7. Ajustar límite de stock bajo         |");
            System.out.println("8. Salir                                  |");
            System.out.println("±----------------------------------------±");
            System.out.print("   Ingresa tu opción:    (1 - 8)  ");


         /*   Product product1 = new Product("Leche", 4500.0, 0);

            System.out.println("¿Producto agotado? " + product1.isOutOfStock());

            System.out.println("¿Precio mayor a $1000? " + product1.isPriceGreaterThan(1000.0));

            System.out.println("¿Precio menor o igual a $1500? " + product1.isPriceLessThanOrEqualTo(1500.0));

            System.out.println("¿Nombre contiene 'Leche'? " + product1.doesNameContainWord("Leche"));
*/
        }
    }






