/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.stuff;

import rape.brutal.gitstarship.IValuable;
import rape.brutal.gitstarship.Storage;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ViRGiL7 on 29.03.2017.
 * Project: java-git-starship
 */
public abstract class LootableObject {

    protected Storage storage = new Storage(Integer.MAX_VALUE);

    protected void generateLoot(ArrayList<IValuable> lootVariantsArrayList) {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(10); i++) {
            int lootVariant = random.nextInt(lootVariantsArrayList.size());
            storage.putItem(lootVariantsArrayList.get(lootVariant));
        }
    }

    protected abstract ArrayList<IValuable> getLootVariants();
}
