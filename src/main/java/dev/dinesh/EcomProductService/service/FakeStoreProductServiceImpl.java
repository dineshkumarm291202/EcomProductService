package dev.dinesh.EcomProductService.service;

import dev.dinesh.EcomProductService.DTO.FakeStoreProductResponseDTO;
import dev.dinesh.EcomProductService.client.FakeStoreClient;
import dev.dinesh.EcomProductService.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FakeStoreProductServiceImpl implements ProductService{
    @Autowired
    private FakeStoreClient fakeStoreClient;
    @Override
    public List<Product> getAllProducts() {
         List<FakeStoreProductResponseDTO> fakeStoreProducts =fakeStoreClient.getAllProducts();
         return fakeStoreProducts;
    }

    @Override
    public Product getProduct(int id) {
        return null;
    }

    @Override
    public Product updateProduct(Product product, int productID) {
        return null;
    }

    @Override
    public boolean deleteProduct(int id) {
        return false;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }
}
