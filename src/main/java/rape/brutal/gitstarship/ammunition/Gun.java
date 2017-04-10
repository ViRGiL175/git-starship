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

    protected String name;
    protected int size;
    protected int cost;

    public Gun(String name, int size, int cost) {
        this.name = name + hashCode();
        this.size = size;
        this.cost = cost;
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
