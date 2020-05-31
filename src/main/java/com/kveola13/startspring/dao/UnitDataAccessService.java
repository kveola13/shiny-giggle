package com.kveola13.startspring.dao;

import com.kveola13.startspring.model.Unit;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UnitDataAccessService implements UnitDao {
    @Override
    public int insertUnit(UUID id, Unit unit) {
        return 1;
    }

    @Override
    public List<Unit> selectAllUnits() {
        return List.of(new Unit(UUID.randomUUID(), "FROM POSTGRES DB"));
    }

    @Override
    public Optional<Unit> selectUnitById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUnitById(UUID id) {
        return 1;
    }

    @Override
    public int updateUnitById(UUID id, Unit unit) {
        return 1;
    }
}
