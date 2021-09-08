package com.carlos.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carlos.dsvendas.dto.SaleSuccessDTO;
import com.carlos.dsvendas.dto.SaleSumDTO;
import com.carlos.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

	@Query("SELECT new com.carlos.dsvendas.dto.SaleSumDTO(obj.seller,SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.carlos.dsvendas.dto.SaleSuccessDTO(obj.seller,SUM(obj.visited),SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();
}
 