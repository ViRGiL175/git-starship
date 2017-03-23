/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.stuff;

import rape.brutal.gitstarship.IMagnetable;
import rape.brutal.gitstarship.IStorageable;
import rape.brutal.gitstarship.IValuable;

/**
 * Created by haze on 24.03.2017.
 */
public class Shrapnel implements IMagnetable, IValuable, IStorageable {

    private int damage;
    private int cost;
    private String name;
    private int size;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
