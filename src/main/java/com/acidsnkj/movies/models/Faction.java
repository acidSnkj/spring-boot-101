package com.acidsnkj.movies.models;

import java.util.ArrayList;
import java.util.List;

public class Faction {
    private String factionName;
    private List<Unit> units;

    public Faction() {
        units = new ArrayList<>();
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public String getFactionName() {
        return factionName;
    }

    public void setFactionName(String factionName) {
        this.factionName = factionName;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }
}
