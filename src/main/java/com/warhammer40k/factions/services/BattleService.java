package com.warhammer40k.factions.services;

import com.warhammer40k.factions.dao.IBattleRepository;
import com.warhammer40k.factions.entities.Battle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BattleService implements IBattleService {

    @Autowired
    private IBattleRepository battleRepository;
    @Override
    public void save(Battle battle) {
        battleRepository.save(battle);
    }

    @Override
    public Battle findById(Long id) {
        return battleRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        battleRepository.deleteById(id);
    }

    @Override
    public List<Battle> findAll() {
        return (List<Battle>) battleRepository.findAll();
    }
}
