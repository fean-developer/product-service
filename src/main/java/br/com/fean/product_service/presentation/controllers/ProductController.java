package br.com.fean.product_service.presentation.controllers;

import br.com.fean.product_service.application.dtos.CategoryRequest;
import br.com.fean.product_service.application.dtos.ProductRequest;
import br.com.fean.product_service.application.dtos.VendorRequest;
import br.com.fean.product_service.application.services.CategoryService;
import br.com.fean.product_service.application.services.ProductService;
import br.com.fean.product_service.application.services.VendorService;
import br.com.fean.product_service.domain.entities.Category;
import br.com.fean.product_service.domain.entities.Product;
import br.com.fean.product_service.domain.entities.Vendor;
import br.com.fean.product_service.presentation.api.ProductApi;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ProductController  implements ProductApi {

    private CategoryService categoryService;
    private ProductService productService;
    private VendorService vendorService;

    @Override
    public Category createCategory(CategoryRequest categoryRequest) {
       return categoryService.createCategory(categoryRequest);
    }

    @Override
    public Vendor createVendor(VendorRequest vendorRequest) {
     return  vendorService.createVendor(vendorRequest);
    }

    @Override
    public Product createProduct(ProductRequest productRequest) {
            return productService.createProduct(productRequest);
    }
}
