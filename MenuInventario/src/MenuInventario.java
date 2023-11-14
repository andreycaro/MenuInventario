import java.util.Scanner;
import java.util.ArrayList;



public class MenuInventario {



    private static Scanner scanner = new Scanner(System.in);

    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1 -> addProduct();
            case 2 -> removeProduct();
            case 3 -> updateProduct();
            case 4 -> showAllProducts();
            case 5 -> searchProduct();
            case 6 -> generateReport();
            case 7 -> setLowStockThreshold();
            case 8 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción invalida. Por favor intenta de nuevo.");
        }

    }

    private void displayMenu() {

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
    }

    public void runMenu() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleUserChoice(choice);
        } while (choice != 8);
    }

    private void addProduct() {
        System.out.println("Agregando producto...");
    }

    private void removeProduct() {
        System.out.println("Eliminando producto...");
    }

    private void updateProduct() {
        System.out.println("Actualizando producto...");
    }

    private void showAllProducts() {
        System.out.println("Mostrando todos los productos...");
    }

    private void searchProduct() {
        System.out.println("Buscando producto...");
    }

    private void generateReport() {
        System.out.println("Generando reporte...");
    }

    private void setLowStockThreshold() {
        System.out.println("Ajustando límite de stock bajo...");
    }

    public static void main(String[] args) {
        MenuInventario menu = new MenuInventario();
        menu.runMenu();
    }
}


