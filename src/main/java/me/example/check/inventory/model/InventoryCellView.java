package me.example.check.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.example.check.inventory.mockmodel.InventoryStatus;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryCellView {
    private InventoryStatus status;
    private int totalAmount; //Не знаю должны ли такое вычислять на фронте
    private int totalMissingAmount;
    private int totalRestoredAmount;
    private int totalExcessiveAmount;
    private int totalWithdrawAmount;
    private List<CellView> cells;

    public class CellView{
        private String cellKey;
        private int totalAmount;
        private int totalMissingAmount;
        private int totalRestoredAmount;
        private int totalExcessiveAmount;
        private int totalWithdrawAmount;
        private String mostCommonGRI; //Превалирующий ВГХ в ячейке: СГТ/КГТ/МГТ.
        private Instant completionDate;
    }

}
