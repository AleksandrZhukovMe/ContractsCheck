package me.example.check.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventorySkuView {
    private String skuBarcode;
    private int amount;
    private int missingAmount;
    private int restoredAmount;
    private int excessiveAmount;
    private int withdrawAmount;
    private String boxBarcode;
}
