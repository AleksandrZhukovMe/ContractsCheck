package me.example.inventorycheck.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.inventorycheck.mockmodel.InventoryStatus;

import java.time.Instant;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDto {
    private Long workerId;
    private InventoryStatus status;
    private Instant dateStarted;
    private Instant dateCompleted;

}
