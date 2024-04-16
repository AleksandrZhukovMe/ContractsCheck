package me.example.check.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.check.mockmodel.ShortSkuInfo;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryBoxView {
    private ShortSkuInfo shortSkuInfo;
    private String originalCellKey;
    private int amount;
}
