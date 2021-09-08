package com.carlos.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
