package com.warhammer40k.factions.dao;

import com.warhammer40k.factions.entities.Faction;
import org.springframework.data.repository.CrudRepository;

public interface IFactionRepository extends CrudRepository<Faction, Long> {
}
