package com.kveola13.startspring.api;

import com.kveola13.startspring.model.Unit;
import com.kveola13.startspring.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("/api/v1/unit")
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

    @GetMapping
    public List<Unit> getAllUnits() {
        return unitService.getAllUnits();
    }

    @GetMapping(path = "{id}")
    public Unit getUnitById(@PathVariable("id") UUID id) {
        return unitService.getUnitById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUnitById(@PathVariable("id") UUID id) {
        unitService.deleteUnit(id);
    }

    @PutMapping(path = "{id}")
    public void updateUnit(@PathVariable("id") UUID id, @RequestBody Unit unitToUpdate) {
        unitService.updateUnit(id, unitToUpdate);
    }
}
