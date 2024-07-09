package br.com.fean.product_service.application.dtos;


import br.com.fean.product_service.domain.enums.EOrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private String id;
    private Customer customer;
    private List<OrderProducts> products;
    private EOrderStatus status;
    private String transactionId;
    private LocalDateTime createdAt;
    private double totalAmount;
    private int totalItems;
}
