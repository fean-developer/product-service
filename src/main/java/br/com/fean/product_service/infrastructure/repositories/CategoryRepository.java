package br.com.fean.product_service.infrastructure.repositories;

import br.com.fean.product_service.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
}
