package br.com.fean.product_service.application.services;

import br.com.fean.product_service.application.dtos.VendorRequest;
import br.com.fean.product_service.domain.entities.Vendor;
import br.com.fean.product_service.infrastructure.repositories.VendorRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class VendorService {

        private final VendorRepository vendorRepository;

        public Vendor createVendor(VendorRequest vendorRequest) {
            Vendor vendor = Vendor.builder()
                    .cnpj(vendorRequest.getCnpj())
                    .email(vendorRequest.getEmail())
                    .name(vendorRequest.getName())
                    .phone(vendorRequest.getPhone())
                    .build();

            return  vendorRepository.save(vendor);
        }
}
