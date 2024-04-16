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
public class InventoryView {
    private long inventoryNumber;
    private long workerId;
    private Instant creationDate;
    private int cellAmount;
    private InventoryStatus status;
}


