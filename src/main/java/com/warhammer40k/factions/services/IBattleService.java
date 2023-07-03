package com.warhammer40k.factions.services;

import com.warhammer40k.factions.entities.Battle;

import java.util.List;

public interface IBattleService {
    public void save(Battle battle);
    public Battle findById(Long id);
    public void delete(Long id);
    public List<Battle> findAll();
}
