package br.com.joaocastro.jobtrack.controller;

import br.com.joaocastro.jobtrack.dto.CompanyRequest;
import br.com.joaocastro.jobtrack.entity.Company;
import br.com.joaocastro.jobtrack.service.CompanyService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    final private CompanyService companyService;
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
     @PostMapping
     @ResponseStatus(HttpStatus.CREATED)

     public Company create(@Valid @RequestBody CompanyRequest  request) {
         Company company = new Company();
         company.setName(request.name());
         company.setWebsite(request.website());

         return companyService.create(company);

    }
}
