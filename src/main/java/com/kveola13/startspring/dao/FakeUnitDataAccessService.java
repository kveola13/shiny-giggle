package com.kveola13.startspring.dao;

import com.kveola13.startspring.model.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeUnitDataAccessService implements UnitDao {

    private static List<Unit> database = new ArrayList<>();

    @Override
    public int insertUnit(UUID id, Unit unit) {
        database.add(new Unit(id, unit.getName()));
        return 1;
    }
}
