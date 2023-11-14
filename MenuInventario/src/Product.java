public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void increaseStock(int quantity) {
        // Método para aumentar el stock del producto en una cantidad específica
        this.stock += quantity;
    }

    public void decreaseStock(int quantity) {
        // Método para reducir el stock del producto en una cantidad específica
        if (this.stock >= quantity) {
            this.stock -= quantity;
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    public double calculateTotalPrice(int quantity) {
        // Método para calcular el precio total de una cantidad específica de productos
        return price * quantity;
    }

    // Puedes agregar más métodos según tus necesidades, como calcular impuestos, descuentos, etc.
}
