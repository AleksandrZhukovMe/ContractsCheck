package me.example.inventorycheck.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CellInventoryDraft {
    private long skuId;

    private Integer amountToLeave;

    private Integer amountToWithdraw;
}
