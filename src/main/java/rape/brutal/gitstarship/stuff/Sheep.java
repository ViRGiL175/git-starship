/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.stuff;

import rape.brutal.gitstarship.IStorageable;
import rape.brutal.gitstarship.IValuable;

/**
 * Created by haze on 24.03.2017.
 */
public class Sheep implements IValuable, IStorageable {

    private int cost;
    private String name;
    private int size;

    @Override
    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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
