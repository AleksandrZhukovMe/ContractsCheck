package me.example.check.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.check.mockmodel.InventoryStatus;

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


