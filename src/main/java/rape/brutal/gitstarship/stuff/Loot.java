/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.stuff;

import rape.brutal.gitstarship.IValuable;

/**
 * Created by ViRGiL7 on 28.03.2017.
 * Project: java-git-starship
 */
public abstract class Loot implements IValuable {

    protected int cost;
    protected int size;
    protected String name;

    public Loot(int cost, int size, String name) {
        this.cost = cost;
        this.size = size;
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
