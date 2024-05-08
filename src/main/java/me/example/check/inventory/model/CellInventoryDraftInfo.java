package me.example.check.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.check.inventory.mockmodel.ShortSkuInfo;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CellInventoryDraftInfo {
        private ShortSkuInfo skuInfo;
        private int amountToKeep;
        private int amountToWithdraw;
        private boolean matchesToActual;
}
