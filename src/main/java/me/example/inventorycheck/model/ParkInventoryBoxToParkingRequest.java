package me.example.inventorycheck.model;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ParkInventoryBoxToParkingRequest {
    @ApiParam(value = "Штрих-код короба")
    private String boxBarcode;
    @ApiParam(value = "Штрих-код парковки")
    private String parkingBarcode;
}
