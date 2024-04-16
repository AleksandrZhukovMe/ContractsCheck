package me.example.inventorycheck.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.inventorycheck.mockmodel.InventoryStatus;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDto {
    private Long inventoryNumber;
    private List<String> boxBarcodes;
}
