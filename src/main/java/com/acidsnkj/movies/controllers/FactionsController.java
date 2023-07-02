package com.acidsnkj.movies.controllers;

import com.acidsnkj.movies.models.Faction;
import com.acidsnkj.movies.models.Unit;
import com.acidsnkj.movies.services.IService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class FactionsController {

    IService factionService;
    public FactionsController(@Qualifier("factionService") IService factionService) {
        this.factionService = factionService;
    }

    @GetMapping("/factions/{factionName}/{unitName}")
    public String getFactionUnit(@PathVariable String factionName, @PathVariable String unitName, Model model) {
        Optional<Faction> optionalFaction = factionService.getFactions().stream().
                filter(faction -> faction.getFactionName().toLowerCase().equals(factionName)).findFirst();
        if (optionalFaction.isPresent()) {
            Faction faction = optionalFaction.get();
            Optional<Unit> optionalUnit = faction.getUnits().stream().
                    filter(unit -> unit.getUnitName().toLowerCase().equals(unitName)).findFirst();
            if (optionalUnit.isPresent()) {
                Unit unit = optionalUnit.get();
                model.addAttribute("unit", unit);
            }
        }
        model.addAttribute("title", "Factions of Warhammer 40k");

        return "factions";
    }


}
