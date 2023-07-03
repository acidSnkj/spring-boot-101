package com.warhammer40k.factions.controllers;

import com.warhammer40k.factions.entities.Battle;
import com.warhammer40k.factions.entities.Faction;
import com.warhammer40k.factions.services.BattleService;
import com.warhammer40k.factions.services.FactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BattleController {

    private final BattleService battleService;
    private final FactionService factionService;

    public BattleController(BattleService battleService, FactionService factionService) {
        this.battleService = battleService;
        this.factionService = factionService;
    }

    @PostMapping("/battle")
    public Long save(@RequestParam String name, @ModelAttribute(name="ids") String ids) {
        Battle battle = new Battle();
        battle.setName(name);
        List<Long> idsFactions = Arrays.stream(ids.split(",")).map(Long::parseLong).toList();
        List<Faction> factions = factionService.findAllById(idsFactions);
        battle.setFactions(factions);
        battleService.save(battle);
        return battle.getId();
    }

    @GetMapping("/battle/{id}")
    public String findById(@PathVariable(name = "id") Long id) {
        return battleService.findById(id).getName();
    }
}
