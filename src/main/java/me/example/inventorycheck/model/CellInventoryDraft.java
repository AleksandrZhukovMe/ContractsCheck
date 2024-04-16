package me.example.inventorycheck.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.inventorycheck.mockmodel.SkuItem;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CellInventoryDraft {
    private List<UUID> skuItemIds;
    private DraftType type;
}
