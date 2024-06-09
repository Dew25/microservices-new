package ee.jvm.inventory_service.controller;

import ee.jvm.inventory_service.dto.InventoryResponse;
import ee.jvm.inventory_service.repository.InventoryRepository;
import ee.jvm.inventory_service.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/inventory")
@AllArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam() List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
