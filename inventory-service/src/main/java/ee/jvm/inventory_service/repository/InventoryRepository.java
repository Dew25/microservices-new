package ee.jvm.inventory_service.repository;

import ee.jvm.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    public List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
