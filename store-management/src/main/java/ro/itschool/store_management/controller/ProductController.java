package ro.itschool.store_management.controller;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.itschool.store_management.model.Product;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private static final List<Product> PRODUCTS = new ArrayList<>();

    @GetMapping
    public List<Product> getAllProducts() {
        return PRODUCTS;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
        Product product = PRODUCTS.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        PRODUCTS.add(product);
        return ResponseEntity.status(HttpStatus.CREATED).body("Product added successfully!");
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable long id) {
        PRODUCTS.removeIf(p -> p.getId() == id);
        return "Product deleted successfully!";
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable long id, @RequestBody Product product, HttpServletResponse response) {
        Product existingProduct = PRODUCTS.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        if (existingProduct == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return null;
        }

        if (product.getName() != null) {
            existingProduct.setName(product.getName());
        }

        if (product.getPrice() != 0) {
            existingProduct.setPrice(product.getPrice());
        }

        if (product.getQuantity() != 0) {
            existingProduct.setQuantity(product.getQuantity());
        }

        if (product.getCategory() != null) {
            existingProduct.setCategory(product.getCategory());
        }
        return existingProduct;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> replaceProduct(@PathVariable long id, @RequestBody Product product) {
        Product existingProduct = PRODUCTS.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        if (existingProduct == null) {
            return ResponseEntity.notFound().build();
        }
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setCategory(product.getCategory());
        return ResponseEntity.ok(existingProduct);
    }
}