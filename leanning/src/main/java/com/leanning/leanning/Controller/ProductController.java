// package com.leanning.leanning.Controller;

// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @CrossOrigin(origins = "http://localhost:4200")
// @RestController
// @RequestMapping("/products")
// public class ProductController {
//     private final ProductService productService;

//     public ProductController(ProductService productService) {
//         this.productService = productService;
//     }

//     @GetMapping
//     public List<Product> getAllProducts() {
//         return productService.findAll();
//     }

//     @GetMapping("/{id}")
//     public Product getProductById(@PathVariable Long id) {
//         return productService.findById(id);
//     }

//     @PostMapping
//     public Product createProduct(@RequestBody Product product) {
//         return productService.save(product);
//     }

//     @PutMapping("/{id}")
//     public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
//         return productService.update(id, product);
//     }

//     @DeleteMapping("/{id}")
//     public void deleteProduct(@PathVariable Long id) {
//         productService.delete(id);
//     }
// }
