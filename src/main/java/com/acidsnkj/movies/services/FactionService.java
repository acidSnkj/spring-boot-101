package com.acidsnkj.movies.services;

import com.acidsnkj.movies.models.Faction;
import com.acidsnkj.movies.models.Unit;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("factionService")
@Primary
public class FactionService implements IService {
    public List<Faction> getFactions() {
        Faction spaceMarines = new Faction();
        spaceMarines.setFactionName("Space-Marines");
        Unit spaceMarineUnit = new Unit("Tactical-Squad");
        spaceMarineUnit.setDescription("Tactical Squads are the backbone of any Space Marine army. " +
                "They hold ground; provide fire support and charge into bloody melees, as the ever-changing" +
                "theatre of war dictates.");
        spaceMarines.addUnit(spaceMarineUnit);


        Faction chaosSpaceMarines = new Faction();
        chaosSpaceMarines.setFactionName("Chaos-Space-Marines");
        Unit chaosSpaceMarinesUnit = new Unit("berzerkers");
        chaosSpaceMarinesUnit.setDescription("Chaos Space Marines are the main antagonist of the Warhammer 40,000" +
                "setting; with the Horus Heresy arguably being the most pivotal moment of the W40K timeline. " +
                "They are also known as the Traitor Legions," +
                "primarily in background material written from the perspective of the Imperium.");
        chaosSpaceMarines.addUnit(chaosSpaceMarinesUnit);

        return List.of(spaceMarines, chaosSpaceMarines);
    }
}
