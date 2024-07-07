package br.com.fean.product_service.infrastructure.repositories;


import br.com.fean.product_service.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Boolean existsByCode(UUID code);
}