package dev.dinesh.EcomProductService.DTO;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ExceptionResponseDTO {
    public String message;
    public int code;
    public ExceptionResponseDTO(String message, int code) {
        this.message = message;
        this.code = code;
    }
}

