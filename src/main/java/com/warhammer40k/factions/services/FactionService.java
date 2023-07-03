package com.warhammer40k.factions.services;

import com.warhammer40k.factions.dao.IFactionRepository;
import com.warhammer40k.factions.entities.Faction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactionService implements IFactionService {

    @Autowired
    private IFactionRepository factionRepository;
    @Override
    public void save(Faction faction) {
        factionRepository.save(faction);
    }

    @Override
    public Faction findById(Long id) {
        return factionRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        factionRepository.deleteById(id);
    }

    @Override
    public List<Faction> findAll() {
        return (List<Faction>) factionRepository.findAll();
    }

    @Override
    public List<Faction> findAllById(List<Long> ids) {
        return (List<Faction>) factionRepository.findAllById(ids);
    }
}
