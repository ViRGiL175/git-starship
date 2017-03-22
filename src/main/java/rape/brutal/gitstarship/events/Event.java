/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.events;

import rape.brutal.gitstarship.Universe;
import rape.brutal.gitstarship.locations.Location;
import rape.brutal.gitstarship.ships.GitStarship;

/**
 * Created by haze on 22.03.2017.
 */
public abstract class Event {

    protected Universe universe;
    protected Location location;
    protected GitStarship gitStarship;

    public Universe getUniverse() {
        return universe;
    }

    public void setUniverse(Universe universe) {
        this.universe = universe;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public GitStarship getGitStarship() {
        return gitStarship;
    }

    public void setGitStarship(GitStarship gitStarship) {
        this.gitStarship = gitStarship;
    }

    public void Event(Universe universe, GitStarship gitStarship) {

    }

    public void start() {

    }
}
