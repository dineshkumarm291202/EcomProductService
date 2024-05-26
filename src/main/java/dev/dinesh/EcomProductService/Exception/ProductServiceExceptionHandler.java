package dev.dinesh.EcomProductService.Exception;

import dev.dinesh.EcomProductService.DTO.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity handlenoproductException (ProductNotFoundException pe){
        ExceptionResponseDTO er=new ExceptionResponseDTO(
        pe.getMessage(),
        400
        );
        return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
    }
}
