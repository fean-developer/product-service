package br.com.fean.product_service.application.services;

import br.com.fean.product_service.application.dtos.Event;
import br.com.fean.product_service.application.dtos.History;
import br.com.fean.product_service.application.dtos.OrderProducts;
import br.com.fean.product_service.application.dtos.ProductRequest;
import br.com.fean.product_service.domain.entities.Product;
import br.com.fean.product_service.domain.entities.Validation;
import br.com.fean.product_service.infrastructure.exceptions.ValidationException;
import br.com.fean.product_service.infrastructure.repositories.ProductRepository;
import com.ctc.wstx.shaded.msv_core.datatype.xsd.Base64BinaryType;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

import static br.com.fean.product_service.domain.enums.ESagaStatus.*;
import static org.springframework.util.ObjectUtils.isEmpty;

@Slf4j
@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .unitValue(productRequest.getUnitValue())
                .stock(productRequest.getStock())
                .image(productRequest.getImage())
                .color(productRequest.getColor())
                .size(productRequest.getSize())
                .vendorCode(productRequest.getVendorCode())
                .internalCode(productRequest.getInternalCode())
                .category(productRequest.getCategory())
                .vendor(productRequest.getVendor())
                .build();
        return productRepository.save(product);
    }

}
