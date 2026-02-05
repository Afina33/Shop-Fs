package repository.ProductRepository;

import model.Category;
import model.Product;
import model.ProductStatus;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryMap implements  ProductRepository{

    private Map<Long, Product> memoryStorage = new HashMap<>();
    private Long currentId = 0L;

    public ProductRepositoryMap() {
        initStorage();
    }

    private void initStorage() {
        addProduct(new Product( "iPhone 14",
                "Смартфон Apple iPhone 14, 128GB",
                new BigDecimal("34999.99"),
                10,
                ProductStatus.ACTIVE,
                new Category(2L,"telephon"),
                "https://example.com/images/iphone14.jpg"));addProduct(new Product(
                "Samsung Galaxy S23",
                "Флагманский смартфон Samsung Galaxy S23",
                new BigDecimal("32999.99"),
                12,
                ProductStatus.ACTIVE,
                new Category(2L, "telephon"),
                "https://example.com/images/galaxy_s23.jpg"
        ));

        addProduct(new Product(
                "Xiaomi Redmi Note 12",
                "Смартфон Xiaomi с большим экраном",
                new BigDecimal("19999.99"),
                25,
                ProductStatus.ACTIVE,
                new Category(2L, "telephon"),
                "https://example.com/images/redmi_note_12.jpg"
        ));

        addProduct(new Product(
                "MacBook Air M1",
                "Ноутбук Apple MacBook Air на чипе M1",
                new BigDecimal("89999.99"),
                5,
                ProductStatus.ACTIVE,
                new Category(3L, "laptop"),
                "https://example.com/images/macbook_air_m1.jpg"
        ));

        addProduct(new Product(
                "Sony WH-1000XM5",
                "Беспроводные наушники с активным шумоподавлением",
                new BigDecimal("29999.99"),
                18,
                ProductStatus.ACTIVE,
                new Category(4L, "headphones"),
                "https://example.com/images/sony_wh_1000xm5.jpg"
        ));

    }



    @Override
    public List<Product> getAll() {
        return memoryStorage.values().stream().toList();
    }

    @Override
    public Product addProduct(Product product) {
       Long id = ++currentId;
        product.setId(id);
        memoryStorage.put(product.getId(), product);
        return product;
    }

    @Override
    public Product removeProduct(Product product) {
        return memoryStorage.remove(product.getId());
    }

    @Override
    public Product getBayId(Long id) {
        return memoryStorage.get(id);
    }
}
