package com.kveola13.startspring.api;

import com.kveola13.startspring.model.Unit;
import com.kveola13.startspring.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnitController {
    private final UnitService unitService;

    @Autowired
    public UnitController(UnitService unitService) {
        this.unitService = unitService;
    }

    @PostMapping
    public void addUnit(@RequestBody Unit unit) {
        unitService.addUnit(unit);
    }
}
