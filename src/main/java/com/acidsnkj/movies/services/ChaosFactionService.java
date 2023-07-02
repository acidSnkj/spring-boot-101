package com.acidsnkj.movies.services;

import com.acidsnkj.movies.models.Faction;
import com.acidsnkj.movies.models.Unit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChaosFactionService implements IService {
    @Override
    public List<Faction> getFactions() {

        Faction chaosSpaceMarines = new Faction();
        chaosSpaceMarines.setFactionName("Chaos-Space-Marines");
        Unit chaosSpaceMarinesUnit = new Unit("berzerkers");
        chaosSpaceMarinesUnit.setDescription("Chaos Space Marines are the main antagonist of the Warhammer 40,000" +
                "setting; with the Horus Heresy arguably being the most pivotal moment of the W40K timeline. " +
                "They are also known as the Traitor Legions," +
                "primarily in background material written from the perspective of the Imperium.");
        chaosSpaceMarines.addUnit(chaosSpaceMarinesUnit);
        return List.of(chaosSpaceMarines);
    }
}
