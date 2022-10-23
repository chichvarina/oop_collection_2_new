import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ProductStorage {

    private final Set<Product> productSet;

    public ProductStorage() {
        productSet = new HashSet<>();
    }

    public void addProduct(Product product) throws Exception {
        // Все товары в списке должны быть уникальными.
        // При попытке добавить уже имеющийся продукт необходимо выбросить исключение.
        if(! productSet.add(product)){
            //класс Set сам по себе не принимает дубли
            throw new Exception("Продукт "+product.getName()+" уже куплен");
        }
    }

    public void removeProduct(Product product){
        productSet.remove(product);
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    @Override
    public String toString() {
        return Arrays.toString(productSet.toArray());
    }
}
