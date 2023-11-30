public class MenuHandler {

    private Object choice;

    void handleUserChoice(int choice) {
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

    private void addProduct() {
        // Implementa la lógica para agregar un producto aquí
        System.out.println("Función de agregar producto.");
    }

    private void removeProduct() {
        // Implementa la lógica para eliminar un producto aquí
        System.out.println("Función de eliminar producto.");
    }

    private void updateProduct() {
        // Implementa la lógica para actualizar un producto aquí
        System.out.println("Función de actualizar producto.");
    }

    private void showAllProducts() {
        // Implementa la lógica para mostrar todos los productos aquí
        System.out.println("Función de mostrar todos los productos.");
    }

    private void searchProduct() {
        // Implementa la lógica para buscar un producto aquí
        System.out.println("Función de buscar producto.");
    }

    private void generateReport() {
        // Implementa la lógica para generar un reporte aquí
        System.out.println("Función de generar reporte.");
    }

    private void setLowStockThreshold() {
        // Implementa la lógica para ajustar el límite de stock bajo aquí
        System.out.println("Función de ajustar límite de stock bajo.");
    }
}