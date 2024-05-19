package dev.dinesh.EcomProductService.controller;

import dev.dinesh.EcomProductService.DTO.FakeStoreProductResponseDTO;
import dev.dinesh.EcomProductService.entity.Product;
import dev.dinesh.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    private ProductService productService; //field injection

    @GetMapping("/product")
    public ResponseEntity getAllProducts(){
        List<FakeStoreProductResponseDTO> products=ProductService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}
