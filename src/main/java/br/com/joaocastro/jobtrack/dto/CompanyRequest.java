package br.com.joaocastro.jobtrack.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CompanyRequest(

        @NotBlank(message = "Company name is required")
        @Size(max = 150, message = "Company name must have at most 150 characters")
        String name,

        @Size(max = 255, message = "Website must have at most 255 characters")
        String website

) {
}