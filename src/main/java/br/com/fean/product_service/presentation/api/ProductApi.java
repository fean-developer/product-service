package br.com.fean.product_service.presentation.api;

import br.com.fean.product_service.application.dtos.CategoryRequest;
import br.com.fean.product_service.application.dtos.ProductRequest;
import br.com.fean.product_service.application.dtos.VendorRequest;
import br.com.fean.product_service.domain.entities.Category;
import br.com.fean.product_service.domain.entities.Product;
import br.com.fean.product_service.domain.entities.Vendor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/products")
public interface ProductApi {

    @PostMapping("/category")
    Category createCategory(@RequestBody CategoryRequest categoryRequest);

    @PostMapping("/vendor")
    Vendor createVendor(@RequestBody VendorRequest vendorRequest);

    @PostMapping
    Product createProduct(@RequestBody ProductRequest productRequest);


}
