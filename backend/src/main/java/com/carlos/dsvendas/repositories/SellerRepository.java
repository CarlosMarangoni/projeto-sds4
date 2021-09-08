package com.carlos.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
