/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import rape.brutal.gitstarship.IValuable;
import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.Universe;
import rape.brutal.gitstarship.parts.engine.Engine;
import rape.brutal.gitstarship.parts.hull.Hull;

import java.util.ArrayList;

/**
 * Created by haze on 22.03.2017.
 */
public class GitStarShip extends StarShip {

    private Universe universe;

    public GitStarShip(Engine engine, Hull hull, Storage storage, int hitPoints, Universe universe) {
        super(engine, hull, storage, hitPoints);
        this.universe = universe;
    }

    @Override
    protected void onDestroy() {
        universe.loseState();
    }

    @Override
    protected ArrayList<IValuable> getLootVariants() {
        return null;
    }
}
