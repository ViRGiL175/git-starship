/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

import rape.brutal.gitstarship.IStorageable;
import rape.brutal.gitstarship.IValuable;

/**
 * Created by haze on 22.03.2017.
 */
public abstract class Gun implements IStorageable, IValuable {

    protected int damage;
    protected String name;
    protected int size;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int fire() {
        return 0;
    }
}
