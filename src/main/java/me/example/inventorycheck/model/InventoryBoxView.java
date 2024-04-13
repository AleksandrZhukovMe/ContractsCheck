package me.example.inventorycheck.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.inventorycheck.mockmodel.SkuDto;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryBoxView {
    private SkuDto skuDto;

    private String originalCellKey;
    private String boxBarcode;
    private int amount;

}
