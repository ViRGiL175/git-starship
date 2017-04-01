/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.Universe;
import rape.brutal.gitstarship.parts.Hull;
import rape.brutal.gitstarship.parts.engine.Engine;

/**
 * Created by haze on 22.03.2017.
 */
public class GitStarship extends Starship {

    private Universe universe;

    public GitStarship(Engine engine, Hull hull, Storage storage, int hitPoints, Universe universe) {
        super(engine, hull, storage, hitPoints);
        this.universe = universe;
    }

    @Override
    protected void onDestroy() {
        universe.loseState(this);
    }
}
