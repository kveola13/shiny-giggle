package com.kveola13.startspring.model;

import java.util.UUID;

public class Unit {
    private final UUID id;
    private final String name;

    public Unit(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
