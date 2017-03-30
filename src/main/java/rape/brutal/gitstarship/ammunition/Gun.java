/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

import rape.brutal.gitstarship.IValuable;

/**
 * Created by haze on 22.03.2017.
 */
public abstract class Gun implements IValuable {

    protected int damage;
    protected String name;
    protected int size;
    protected int cost;

    public Gun(int damage, String name, int size, int cost) {
        this.damage = damage;
        this.name = name;
        this.size = size;
        this.cost = cost;
    }

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

    public abstract int fire();
}
