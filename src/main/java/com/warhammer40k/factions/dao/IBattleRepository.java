package com.warhammer40k.factions.dao;

import com.warhammer40k.factions.entities.Battle;
import org.springframework.data.repository.CrudRepository;

public interface IBattleRepository extends CrudRepository<Battle, Long> {

}
