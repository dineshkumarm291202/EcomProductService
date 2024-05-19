package dev.dinesh.EcomProductService.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductResponseDTO {
    private int productId;
    private String title;
    private double price;
    private String description;
    private String category;
    private String imageUrl;
    private double rating;
}
