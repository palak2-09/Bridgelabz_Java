
import java.util.ArrayList;
import java.util.List;

// Generic Product class
// T is restricted to BookCategory, ClothingCategory, or GadgetCategory
class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category.getCategoryName());
        System.out.println("Price: " + price);
    }
}

// Parent class for all product categories
abstract class ProductCategory {
    abstract String getCategoryName();
}

// Book category
class BookCategory extends ProductCategory {
    String getCategoryName() {
        return "Books";
    }
}

// Clothing category
class ClothingCategory extends ProductCategory {
    String getCategoryName() {
        return "Clothing";
    }
}

// Gadget category
class GadgetCategory extends ProductCategory {
    String getCategoryName() {
        return "Gadgets";
    }
}

// Marketplace class
class Marketplace {

    // Generic method with bounded type parameter
    // T must be a Product or its subclass
    public <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double discount = product.getPrice() * percentage / 100;

        double finalPrice = product.getPrice() - discount;

        product.setPrice(finalPrice);

        System.out.println("Discount Applied: " + percentage + "%");
        System.out.println("Final Price: " + finalPrice);
    }

    // Display products using wildcard
    public void displayProducts(List<? extends Product<?>> products) {
        for (Product<?> product : products) {
            product.displayProduct();
            System.out.println("----------------------");
        }
    }
}

public class DynamicOnlineMarketplace {

    public static void main(String[] args) {

        Marketplace marketplace = new Marketplace();

        // Creating products with different categories
        Product<BookCategory> book =
                new Product<>("Java Programming", 800, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1200, new ClothingCategory());

        Product<GadgetCategory> laptop =
                new Product<>("Laptop", 60000, new GadgetCategory());

        // Applying discounts
        System.out.println("BOOK DISCOUNT");
        marketplace.applyDiscount(book, 10);

        System.out.println("\nCLOTHING DISCOUNT");
        marketplace.applyDiscount(shirt, 20);

        System.out.println("\nGADGET DISCOUNT");
        marketplace.applyDiscount(laptop, 15);

        // Adding products to a common catalog
        List<Product<?>> catalog = new ArrayList<>();

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(laptop);

        // Displaying all products
        System.out.println("\nFINAL PRODUCT CATALOG");
        marketplace.displayProducts(catalog);
    }
}
