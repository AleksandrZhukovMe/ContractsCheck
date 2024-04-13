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
public class CellInventoryDraftResult {
    private int skuAmount;
    private String cellBarcode;
    private List<CellInventoryDraftInfo> draftInfo;

    public class CellInventoryDraftInfo { //отдельный класс
        private SkuDto skuInfo;

        private int amountToLeave;

        private int amountToWithdraw;

        private boolean matchesToActual;
    }
}
