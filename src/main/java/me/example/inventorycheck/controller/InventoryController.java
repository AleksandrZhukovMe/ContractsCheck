package me.example.inventorycheck.controller;

import me.example.inventorycheck.mockmodel.Place;
import me.example.inventorycheck.model.CellInventoryDraft;
import me.example.inventorycheck.model.CellInventoryDraftResult;
import me.example.inventorycheck.model.InventoryBoxView;
import me.example.inventorycheck.model.InventoryDto;
import me.example.inventorycheck.model.InventoryView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/inventory")
@RestController
public class InventoryController {
    @GetMapping("/init/{boxBarcode}")
    public long createInventoryWithBox(@PathVariable("boxBarcode") String boxBarcode) {
        return 0;
    }
    @GetMapping("/cell/{cellKey}/check")
    public void saveInventoryDraftInformation(@PathVariable("cellKey") String cellKey) {
    }
    @GetMapping("/get/by-worker")
    public InventoryDto getInventoryInProgressByWorker() {
        return null;
    }
    @PostMapping("/{inventoryId}/draft/save")
    public void saveInventoryDraftInformation(@PathVariable("inventoryId") long inventoryId,
                                              @RequestBody CellInventoryDraft draft) {
    }
    @GetMapping("/{inventoryId}/draft/verify")
    public CellInventoryDraftResult getInventoryDraftResult(@PathVariable("inventoryId") long inventoryId) {
        return null;
    }
    @GetMapping("/box-info/{boxBarcode}")
    public List<InventoryBoxView> getInventoryItemsByBox(@PathVariable("boxBarcode") String boxBarcode) {
        return null;
    }
    @GetMapping("/box/{boxBarcode}/place")
    public void checkInventoryBoxAndPlace(@PathVariable("boxBarcode") String boxBarcode,
                                          @RequestParam Place place) {
    }
    @GetMapping("/{inventoryId}/complete")
    public void completeInventory(@PathVariable("inventoryId") long inventoryId) {
    }
    //опциональные
    @GetMapping("/all/info")
    public List<InventoryView> getAllInventory() {
        return null;
    }
}
