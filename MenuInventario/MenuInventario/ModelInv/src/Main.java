import model.Product;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("Leche Alpina Deslactosada  ", 17700, 0);

        // Verifica si el producto está agotado
        if (product.isOutOfStock()) {
            System.out.println("El producto está agotado");
        } else {
            System.out.println("El producto no está agotado");
        }

        // Verifica si el precio del producto es mayor que 10000
        if (product.isPriceGreaterThan(10000)) {
            System.out.println("El precio del producto es mayor que 10000");
        } else {
            System.out.println("El precio del producto es menor o igual que 10000");
        }

        // Verifica si el precio del producto es menor o igual que 20000
        if (product.isPriceLessThanOrEqual(20000)) {
            System.out.println("El precio del producto es menor o igual que 20000");
        } else {
            System.out.println("El precio del producto es mayor que 20000");
        }

        // Verifica si el nombre del producto contiene la palabra "Leche"
        if (product.containsWord("Leche")) {
            System.out.println("El nombre del producto contiene la palabra 'Leche'");
        } else {
            System.out.println("El nombre del producto no contiene la palabra 'Leche'");
        }
    }
}