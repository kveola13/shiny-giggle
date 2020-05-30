package com.kveola13.startspring.dao;

import com.kveola13.startspring.model.Unit;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UnitDao {
    int insertUnit(UUID id, Unit unit);

    default int insertUnit(Unit unit) {
        UUID id = UUID.randomUUID();
        return insertUnit(id, unit);
    }

    List<Unit> selectAllUnits();

    Optional<Unit> selectPersonById(UUID id);

    int deleteUnitById(UUID id);

    int updateUnitById(UUID id, Unit unit);
}
