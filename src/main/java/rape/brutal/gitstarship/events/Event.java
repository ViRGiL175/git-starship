/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.events;

import rape.brutal.gitstarship.ships.GitStarship;
import rape.brutal.gitstarship.Universe;
import rape.brutal.gitstarship.locations.Location;

/**
* Created by haze on 22.03.2017.
*/
public abstract class Event {
protected Universe universe;
protected Location location;
protected GitStarship gitStarship;

    public void Event(Universe universe, GitStarship gitStarship) {

    }

    public void start() {

    }
}
