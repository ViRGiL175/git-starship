/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.locations;

import rape.brutal.gitstarship.IValuable;
import rape.brutal.gitstarship.ships.StarShip;

import java.util.ArrayList;

/**
 * Created by haze on 22.03.2017.
 */
public class OpenSpace extends Location {

    private ArrayList<StarShip> enemyShips;

    public OpenSpace(ArrayList<StarShip> enemyShips) {
        this.enemyShips = enemyShips;
        generateLoot(getLootVariants());
    }

    @Override
    protected ArrayList<IValuable> getLootVariants() {
        // todo: add loot variants
        return null;
    }
}
