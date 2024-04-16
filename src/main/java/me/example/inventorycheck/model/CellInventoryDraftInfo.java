package me.example.inventorycheck.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.inventorycheck.mockmodel.SkuDto;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CellInventoryDraftInfo {
        private SkuDto skuInfo;
        private int amountToKeep;
        private int amountToWithdraw;
        private boolean matchesToActual;
}
