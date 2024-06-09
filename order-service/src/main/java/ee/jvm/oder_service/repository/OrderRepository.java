package ee.jvm.oder_service.repository;

import ee.jvm.oder_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
