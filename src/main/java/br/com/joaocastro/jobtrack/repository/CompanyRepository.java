package br.com.joaocastro.jobtrack.repository;

import br.com.joaocastro.jobtrack.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
