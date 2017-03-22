/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.locations;

import rape.brutal.gitstarship.ILandable;
import rape.brutal.gitstarship.ships.GitStarship;
import rape.brutal.gitstarship.trade.Trader;

/**
 * Created by haze on 22.03.2017.
 */
public class Planet extends Location implements ILandable {

    private Trader trader;

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    @Override
    public void land(GitStarship gitStarship) {

    }
}
