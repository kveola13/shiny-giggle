package com.kveola13.startspring.service;

import com.kveola13.startspring.dao.UnitDao;
import com.kveola13.startspring.model.Unit;

public class UnitService {
    private final UnitDao unitDao;

    public UnitService(UnitDao unitDao) {
        this.unitDao = unitDao;
    }

    public int addUnit(Unit unit){
        return unitDao.insertUnit(unit);
    }
}
