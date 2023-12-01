import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuHandler {

    private List<Product> productList;

    public MenuHandler() {
        this.productList = new ArrayList<>();
    }

    public static void main(String[] args) {
        MenuHandler menuHandler = new MenuHandler();
        menuHandler.startMenu();
    }

    private void startMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenuOptions();
            System.out.print("Ingrese su elección: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número

            handleUserChoice(choice);

            if (choice == 8) {
                // Salir del bucle si la elección es 8 (Salir)
                break;
            }
        }
    }

    private void printMenuOptions() {
        System.out.println("----------- Menú -----------");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Eliminar Producto");
        System.out.println("3. Actualizar Producto");
        System.out.println("4. Mostrar Todos los Productos");
        System.out.println("5. Buscar Producto");
        System.out.println("6. Generar Reporte");
        System.out.println("7. Establecer Límite de Stock Bajo");
        System.out.println("8. Salir");
    }

    public void handleUserChoice(int choice) {
        switch (choice) {
            case 1 -> addProduct();
            case 2 -> removeProduct();
            case 3 -> updateProduct();
            case 4 -> showAllProducts();
            case 5 -> searchProduct();
            case 6 -> generateReport();
            case 7 -> setLowStockThreshold();
            case 8 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
        }
    }

    private void addProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto:");
        String name = scanner.nextLine();

        System.out.println("Ingrese el precio del producto:");
        double price = scanner.nextDouble();

        System.out.println("Ingrese la cantidad disponible:");
        int quantity = scanner.nextInt();

        Product newProduct = new Product(name, price, quantity);
        productList.add(newProduct);

        System.out.println("Producto agregado con éxito.");
    }

    private void removeProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto a eliminar:");
        String name = scanner.nextLine();

        productList.removeIf(product -> product.getName().equals(name));

        System.out.println("Producto eliminado con éxito.");
    }

    private void updateProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto a actualizar:");
        String name = scanner.nextLine();

        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println("Ingrese el nuevo precio del producto:");
                double newPrice = scanner.nextDouble();

                System.out.println("Ingrese la nueva cantidad disponible:");
                int newQuantity = scanner.nextInt();

                product.setPrice(newPrice);
                product.setQuantity(newQuantity);

                System.out.println("Producto actualizado con éxito.");
                return;
            }
        }

        System.out.println("Producto no encontrado. No se realizó ninguna actualización.");
    }

    private void showAllProducts() {
        System.out.println("----------- Lista de Productos -----------");
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("-----------------------------------------");
    }

    private void searchProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto a buscar:");
        String name = scanner.nextLine();

        for (Product product : productList) {
            if (product.getName().equals(name)) {
                System.out.println("----------- Producto Encontrado -----------");
                System.out.println(product);
                System.out.println("-----------------------------------------");
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    private void generateReport() {
        System.out.println("----------- Reporte de Productos -----------");
        for (Product product : productList) {
            System.out.println(product);
        }
        System.out.println("--------------------------------------------");
    }

    private void setLowStockThreshold() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nuevo límite de stock bajo:");
        int newThreshold = scanner.nextInt();

        Product.setLowStockThreshold(newThreshold);

        System.out.println("Límite de stock bajo actualizado con éxito.");
    }
}

/*class Product {
    private static int lowStockThreshold = 10;
*/