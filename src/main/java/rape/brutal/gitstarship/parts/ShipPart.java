/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.parts;

import rape.brutal.gitstarship.IValuable;

/**
 * Created by haze on 22.03.2017.
 */
abstract public class ShipPart implements IValuable {

    protected int cost;
    protected int size;
    protected String name;

    public ShipPart(int cost, int size, String name) {
        this.cost = cost;
        this.size = size;
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
