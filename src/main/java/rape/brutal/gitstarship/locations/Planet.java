/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.locations;

import rape.brutal.gitstarship.ILandable;
import rape.brutal.gitstarship.IValuable;
import rape.brutal.gitstarship.ships.GitStarShip;
import rape.brutal.gitstarship.trade.Trader;

import java.util.ArrayList;

/**
 * Created by haze on 22.03.2017.
 */
public class Planet extends Location implements ILandable {

    private Trader trader;

    public Planet(Trader trader) {
        this.trader = trader;
        generateLoot(getLootVariants());
    }

    @Override
    public void land(GitStarShip gitStarship) {

    }

    @Override
    protected ArrayList<IValuable> getLootVariants() {
        // todo: add loot variants
        return null;
    }
}
