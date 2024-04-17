package com.compassuol.estagio.springcourse.resources;

import com.compassuol.estagio.springcourse.entities.Product;
import com.compassuol.estagio.springcourse.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping("/find-products")
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/find-product-id/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = productService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
