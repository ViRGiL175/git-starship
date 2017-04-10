/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.parts.engine.Engine;
import rape.brutal.gitstarship.parts.hull.Hull;

import java.util.ArrayList;

/**
 * Created by haze on 22.03.2017.
 */
public class PirateStarship extends Starship {

    private ArrayList<Starship> shipsFleetArrayList;

    public PirateStarship(Engine engine, Hull hull, Storage storage, int hitPoints,
                          ArrayList<Starship> shipsFleetArrayList) {
        super(engine, hull, storage, hitPoints);
        shipsFleetArrayList.add(this);
        this.shipsFleetArrayList = shipsFleetArrayList;
    }

    @Override
    protected void onDestroy() {
        shipsFleetArrayList.remove(this);
    }
}
