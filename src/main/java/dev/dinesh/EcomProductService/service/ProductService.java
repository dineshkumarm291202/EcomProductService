package dev.dinesh.EcomProductService.service;

import dev.dinesh.EcomProductService.DTO.FakeStoreProductResponseDTO;
import dev.dinesh.EcomProductService.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    List<FakeStoreProductResponseDTO> getAllProducts();
    FakeStoreProductResponseDTO getProduct(int id);
    Product updateProduct(Product product,int productID);
    boolean deleteProduct(int id);
    Product createProduct(Product product);
}
