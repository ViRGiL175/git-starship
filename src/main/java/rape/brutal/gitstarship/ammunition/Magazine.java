/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

import rape.brutal.gitstarship.IStorageable;

/**
* Created by haze on 22.03.2017.
*/
public class Magazine implements IStorageable {
    private int capacity;
    private Ammo[] ammo;
    private String name;
    private int size;

    public void removeAmmo() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
