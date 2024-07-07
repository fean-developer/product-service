package br.com.fean.product_service.application.dtos;

import br.com.fean.product_service.domain.entities.Category;
import br.com.fean.product_service.domain.entities.Vendor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest  implements Serializable {
    private String name;
    private String description;
    private Double unitValue;
    private Double costValue;
    private Integer stock;
    private String image;
    private String color;
    private String size;
    private String vendorCode;
    private String internalCode;
    private Category category;
    private Vendor vendor;
}
