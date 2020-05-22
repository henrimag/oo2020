import java.util.ArrayList;
import java.util.List;

public class ProductStream {
    public static void main(String[] args) {
        List <Product> productList = new ArrayList <Product> ();
        
        productList.add(new Product(1, "Televiisor", 599.00f));
        productList.add(new Product(2, "Laptop", 1399.00f));
        productList.add(new Product(3, "iPhone", 1499f));
        productList.add(new Product(4, "Game Boy", 50.00f));
        productList.add(new Product(5, "Juustusai", 2.5f));
        
        productList.stream().filter(product -> product.getPrice() <= 600)
            .forEach(product -> System.out.println(product.getName()));
    }
}