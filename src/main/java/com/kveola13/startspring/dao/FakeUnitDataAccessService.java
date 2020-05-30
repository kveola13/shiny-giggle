package com.kveola13.startspring.dao;

import com.kveola13.startspring.model.Unit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUnitDataAccessService implements UnitDao {

    private static List<Unit> database = new ArrayList<>();

    @Override
    public int insertUnit(UUID id, Unit unit) {
        database.add(new Unit(id, unit.getName()));
        return 1;
    }

    @Override
    public List<Unit> selectAllUnits() {
        return database;
    }

    @Override
    public Optional<Unit> selectPersonById(UUID id) {
        return database.stream().filter(unit -> unit.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteUnitById(UUID id) {
        return 0;
    }

    @Override
    public int updateUnitById(UUID id, Unit unit) {
        return 0;
    }
}
