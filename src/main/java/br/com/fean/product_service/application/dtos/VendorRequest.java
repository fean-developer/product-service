package br.com.fean.product_service.application.dtos;

import jakarta.persistence.Column;
import lombok.Data;

import java.io.Serializable;

@Data
public class VendorRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String cnpj;
    private String email;
    private String phone;
    private String cellPhone;
    private Address address;

}
