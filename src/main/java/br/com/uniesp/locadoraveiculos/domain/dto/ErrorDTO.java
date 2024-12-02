package br.com.uniesp.locadoraveiculos.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorDTO {
    private int status;
    private String message;
    private String details;
    private LocalDateTime timestamp;
}
