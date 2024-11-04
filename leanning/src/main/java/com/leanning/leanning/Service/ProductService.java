// package com.leanning.leanning.Service;

// import org.springframework.stereotype.Service;
// import org.springframework.beans.factory.annotation.Autowired;
// import java.util.List;
// import com.leanning.leanning.Model.Product;
// import com.leanning.leanning.Repository.ProductRepository;

// @Service
// public class ProductService {

//     private final ProductRepository productRepository;

//     @Autowired
//     public ProductService(ProductRepository productRepository) {
//         this.productRepository = productRepository;
//     }

//     // ฟังก์ชันเพื่อค้นหาผลิตภัณฑ์ทั้งหมด
//     public List<Product> findAll() {
//         return productRepository.findAll();
//     }

//     // ฟังก์ชันเพื่อค้นหาผลิตภัณฑ์ตาม ID
//     public Product findById(Long id) {
//         return productRepository.findById(id).orElse(null);
//     }

//     // ฟังก์ชันเพื่อสร้างผลิตภัณฑ์ใหม่
//     public Product save(Product product) {
//         return productRepository.save(product);
//     }

//     // ฟังก์ชันเพื่ออัปเดตผลิตภัณฑ์
//     public Product update(Long id, Product product) {
//         product.setId(id);
//         return productRepository.save(product);
//     }

//     // ฟังก์ชันเพื่อลบผลิตภัณฑ์ตาม ID
//     public void delete(Long id) {
//         productRepository.deleteById(id);
//     }
// }
