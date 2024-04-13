package me.example.inventorycheck.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.inventorycheck.mockmodel.InventoryStatus;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryView {
    private long inventoryId;
    private long workerId;
    private Instant creationDate;
    private InventoryStatus status;
    List<InventoryCellView> cells;

    public class InventoryCellView { //отдельный класс
        private String cellKey;
        private String mostCommonGRI; //Превалирующий ВГХ в ячейке: СГТ/КГТ/МГТ.
        private Instant completionDate;
        List<InventorySkuView> skus;

        public class InventorySkuView { //отдельный класс
            private String cellKey;
            private int amount;
            private int missingAmount;
            private int restoredAmount;
            private int excessiveAmount;
            private int withdrawAmount;
            private String mostCommonGRI;
            private Instant completionDate;

        }
    }
}


