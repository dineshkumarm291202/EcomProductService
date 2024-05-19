package dev.dinesh.EcomProductService.Mapper;

import dev.dinesh.EcomProductService.DTO.ProductResponseDTO;
import dev.dinesh.EcomProductService.entity.Product;

public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product) {
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setProductId(product.getProductId());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setRating(product.getRating());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setCategory(product.getCategory());
        responseDTO.setImageUrl(product.getImageUrl());
        return responseDTO;
    }
}
