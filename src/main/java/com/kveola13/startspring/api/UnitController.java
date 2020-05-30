package com.kveola13.startspring.api;

import com.kveola13.startspring.model.Unit;
import com.kveola13.startspring.service.UnitService;

public class UnitController {
    private final UnitService unitService;

    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    public void addUnit(Unit unit) {
        unitService.addUnit(unit);
    }
}
