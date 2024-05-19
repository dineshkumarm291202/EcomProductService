package dev.dinesh.EcomProductService.client;

import dev.dinesh.EcomProductService.DTO.FakeStoreProductResponseDTO;
import dev.dinesh.EcomProductService.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;// helps to make call to other service.
    @Value("${fakestore.api.base.url}") // this annotation will value from application properties and inject value to this variable
    private String fakeStoreAPIBaseUrl;
    @Value("${fakestore.api.product.path}")
    private String fakeStoreAPIProductPath;

    public List<FakeStoreProductResponseDTO> getAllProducts() {
        String fakestoreAllProductsURL = fakeStoreAPIBaseUrl.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate=restTemplateBuilder.build();//inbuilt library of spring which we are using to make the call
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponseList=
                restTemplate.getForEntity(fakestoreAllProductsURL, FakeStoreProductResponseDTO[].class);
        return List.of(productResponseList.getBody());

    }
}
