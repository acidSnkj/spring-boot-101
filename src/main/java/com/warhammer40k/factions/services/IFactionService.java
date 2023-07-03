package com.warhammer40k.factions.services;

import com.warhammer40k.factions.entities.Faction;

import java.util.List;

public interface IFactionService {
    public void save(Faction faction);
    public Faction findById(Long id);
    public void delete(Long id);
    public List<Faction> findAll();

    public List<Faction> findAllById(List <Long> ids);
}
