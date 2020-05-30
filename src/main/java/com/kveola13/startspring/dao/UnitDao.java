package com.kveola13.startspring.dao;

import com.kveola13.startspring.model.Unit;

import java.util.UUID;

public interface UnitDao {
    int insertUnit(UUID id, Unit unit);

    default int addUnit(Unit unit) {
        UUID id = UUID.randomUUID();
        return insertUnit(id, unit);
    }
}
