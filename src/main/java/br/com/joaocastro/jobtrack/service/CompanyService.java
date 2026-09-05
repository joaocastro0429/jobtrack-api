package br.com.joaocastro.jobtrack.service;

import br.com.joaocastro.jobtrack.entity.Company;
import br.com.joaocastro.jobtrack.repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    final private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;


    }

    public Company create(Company company){
        return companyRepository.save(company);
    }


}
