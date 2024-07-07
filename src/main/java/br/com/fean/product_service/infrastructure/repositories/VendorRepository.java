package br.com.fean.product_service.infrastructure.repositories;

import br.com.fean.product_service.domain.entities.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository  extends JpaRepository<Vendor, Long> {
}
