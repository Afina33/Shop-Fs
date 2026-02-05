import model.*;
import repository.ProductRepository.ProductRepository;
import repository.ProductRepository.ProductRepositoryMap;
import repository.UserRepository.UserRepository;
import repository.UserRepository.UserRepositoryMap;

import java.math.BigDecimal;



public class ShopDemo {
    public static void main(String[] args) {
        Product ipad = new Product(
                "iPad Air 5",
                "Планшет Apple iPad Air 5-го поколения",
                new BigDecimal("45999.99"),
                8,
                ProductStatus.ACTIVE,
                new Category(5L, "tablet"),
                "https://example.com/images/ipad_air_5.jpg"
        );

        ProductRepository repository = new ProductRepositoryMap();

        repository.addProduct(ipad);

        repository.getAll().forEach(System.out::println);

    }

}
