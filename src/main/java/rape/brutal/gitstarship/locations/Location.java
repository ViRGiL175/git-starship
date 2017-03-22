/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.locations;

import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.ships.GitStarship;

/**
 * Created by haze on 22.03.2017.
 */
public abstract class Location {

    protected GitStarship gitStarship;
    private Storage storage;

    public GitStarship getGitStarship() {
        return gitStarship;
    }

    public void setGitStarship(GitStarship gitStarship) {
        this.gitStarship = gitStarship;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
