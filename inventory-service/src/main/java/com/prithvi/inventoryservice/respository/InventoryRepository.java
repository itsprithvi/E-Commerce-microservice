package com.prithvi.inventoryservice.respository;

import com.prithvi.inventoryservice.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    Optional<Inventory> findBySkuCode(String skuCode);
}
