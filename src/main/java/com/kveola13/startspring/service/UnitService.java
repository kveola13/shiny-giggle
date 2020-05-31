package com.kveola13.startspring.service;

import com.kveola13.startspring.dao.UnitDao;
import com.kveola13.startspring.model.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UnitService {
    private final UnitDao unitDao;

    @Autowired
    public UnitService(@Qualifier("fakeDao") UnitDao unitDao) {
        this.unitDao = unitDao;
    }

    public int addUnit(Unit unit) {
        return unitDao.insertUnit(unit);
    }

    public List<Unit> getAllUnits() {
        return unitDao.selectAllUnits();
    }

    public Optional<Unit> getUnitById(UUID id) {
        return unitDao.selectUnitById(id);
    }

    public int deleteUnit(UUID id) {
        return unitDao.deleteUnitById(id);
    }

    public int updateUnit(UUID id, Unit updatedUnit) {
        return unitDao.updateUnitById(id, updatedUnit);
    }
}
