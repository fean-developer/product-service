package br.com.fean.product_service.application.services;

import br.com.fean.product_service.application.dtos.CategoryRequest;
import br.com.fean.product_service.domain.entities.Category;
import br.com.fean.product_service.infrastructure.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public Category createCategory(CategoryRequest categoryRequest) {
        Category category = Category.builder()
                .description(categoryRequest.getDescription())
                .name(categoryRequest.getName())
                .build();
        return  categoryRepository.save(category);
    }
}
