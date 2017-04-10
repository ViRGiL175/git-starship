/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

import rape.brutal.gitstarship.IMagnetable;
import rape.brutal.gitstarship.IStorageable;
import rape.brutal.gitstarship.Storage;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by haze on 22.03.2017.
 */
public class RailGun extends Gun {

    private Storage storage;

    public RailGun(Storage storage) {
        super("RailGun", 10, 60);
        this.storage = storage;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int fire() {
        if (storage.getCapacity() > 0) {
            ArrayList<String> namesArrayList = new ArrayList<>(storage.getAllItemNames());
            for (String name : namesArrayList) {
                if (!(storage.getItem(name) instanceof IMagnetable)) {
                    namesArrayList.remove(name);
                }
            }
            String selectedItemName = namesArrayList.get(new Random().nextInt(namesArrayList.size()));
            IStorageable storageItem = storage.getItem(selectedItemName);
            int damage = storageItem.getSize();
            storage.deleteItem(storageItem.getName());
            return damage;
        } else {
            return 0;
        }
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
