package com.warhammer40k.factions.controllers;

import com.warhammer40k.factions.entities.Faction;
import com.warhammer40k.factions.services.FactionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class FactionController {

    private final FactionService factionService;

    public FactionController(FactionService factionService) {
        this.factionService = factionService;
    }

    @PostMapping("/faction")
    public Long save(@RequestParam String name) {
        Faction faction = new Faction();
        faction.setName(name);
        factionService.save(faction);
        return faction.getId();
    }

    @GetMapping("/faction/{id}")
    public String findById(@PathVariable Long id) {
        return factionService.findById(id).getName();
    }
}
