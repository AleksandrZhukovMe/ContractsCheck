package me.example.check.controller;

import io.swagger.annotations.ApiOperation;
import me.example.check.model.CellInventoryDraft;
import me.example.check.model.CellInventoryDraftInfo;
import me.example.check.model.InventoryBoxView;
import me.example.check.model.InventoryCellView;
import me.example.check.model.InventoryDto;
import me.example.check.model.InventorySkuView;
import me.example.check.model.InventoryView;
import me.example.check.model.ParkInventoryBoxToParkingRequest;
import me.example.check.model.TakeBoxForInventoryRequest;
import me.example.check.service.AnotherAppService;
import me.example.check.service.AppService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/inventory")
@RestController
public class InventoryController {
    private final String name;
    private final AppService appService;
    private final AnotherAppService anotherAppServiceApp;
    public InventoryController(@Value("${inventory.name}")String name,
                               AppService appService,
                               AnotherAppService anotherAppServiceApp) {
        this.name = name;
        this.appService = appService;
        this.anotherAppServiceApp = anotherAppServiceApp;
    }

    @ApiOperation(value = "Взять короб для инвентаризации")
    @PostMapping("/take-box") // todo 2-4 часа
    public void takeBoxForInventory(@RequestBody TakeBoxForInventoryRequest request) {
        // в пикинг контроллере тут возвращается ДТО с UUID короба. Не вижу смысла возвращать
    }

    @ApiOperation("Проверка ячейки")
    @GetMapping("/{inventoryNumber}/check-cell/{cellKey}/")
    public void checkCellForInventory(@PathVariable("inventoryNumber") long inventoryNumber,
                                      @PathVariable("cellKey") String cellKey) {
    }

    @ApiOperation(value = "Создание инвентаризации")
    @GetMapping("/create") // todo 8-16 часов
    public long createInventory() {
        //технически это сохранение сущности, но тело не нужно, но GetMapping тоже странно
        return 0;
    }

    @ApiOperation(value = "Получить список коробов")
    @GetMapping("/user-inventory-boxes") //todo 4-8 часов
    public InventoryDto getInventoryBoxesInProgressByWorker() {
        return null;
    }

    @ApiOperation(value = "Сохранение черновика")
    @PutMapping("/save-draft/{inventoryNumber}") //todo 8-16 часов
    public void saveInventoryDraftInformation(@PathVariable("inventoryNumber") long inventoryNumber,
                                              @RequestBody CellInventoryDraft draft) {
    }

    @ApiOperation(value = "Получение результата")
    @GetMapping("/verify-drafts/{inventoryNumber}") // todo ??? часов не известно как обрабатываем pending и reserve
    public List<CellInventoryDraftInfo> getInventoryDraftResult(
            @PathVariable("inventoryNumber") long inventoryNumber) {
        return null;
    }

    @ApiOperation(value = "Информация по товрам в боксе")
    @GetMapping("/box-info/{boxBarcode}") // todo 2-4 часа
    public List<InventoryBoxView> getInventoryItemsByBox(
            @PathVariable("boxBarcode") String boxBarcode) {
        return null;
    }

    @ApiOperation(value = "Парковка короба инвентаризации на парковке")
    @PostMapping("/park-inventory-box-to-parking") //todo 4-8 часов
    public void checkInventoryBoxAndPlace(@RequestBody ParkInventoryBoxToParkingRequest request) {
    }

    @ApiOperation(value = "Завершение инвентаризации")
    @GetMapping("/{inventoryNumber}/complete") //todo 4-8 часов
    public void completeInventory(@PathVariable("inventoryNumber") long inventoryNumber) {
    }

    //опциональные
    @ApiOperation(value = "Получение информации по инвентаризациям")
    @GetMapping("get-all-info") //todo 4-8 часов
    public List<InventoryView> getAllInventory() {
        return null;
    }

    @ApiOperation(value = "Получение информации по ячейкам в инвентаризациях")
    //опциональные
    @GetMapping("{inventoryNumber}/get-cell-info") //todo 4-8 часов
    public List<InventoryCellView> getAllInventoryCells(@PathVariable("inventoryNumber") long inventoryNumber) {
        return null;
    }

    @ApiOperation(value = "Получение информации по конкретной чейке в инвентаризации")
    //опциональные
    @GetMapping("{inventoryNumber}/get-sku-info/{cellBarcode}") //todo 4-8 часов
    public List<InventorySkuView> getAllInventorySkusByCell(@PathVariable("inventoryNumber") long inventoryNumber,
                                                            @PathVariable("cellBarcode") String cellBarcode) {
        return null;
    }
}


