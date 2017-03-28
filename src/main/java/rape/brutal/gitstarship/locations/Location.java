/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.locations;

import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.stuff.Loot;

import java.util.ArrayList;

/**
 * Created by haze on 22.03.2017.
 */
public abstract class Location {

    protected Storage storage;

    protected abstract void generateLoot(ArrayList<Loot> lootVariantsArrayList);

    protected abstract ArrayList<Loot> getLootVariants();
}
