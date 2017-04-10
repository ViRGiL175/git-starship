/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.parts.engine;

import rape.brutal.gitstarship.parts.ShipPart;

/**
 * Created by haze on 22.03.2017.
 */
public abstract class Engine extends ShipPart {

    private int power;

    public Engine(int cost, int size, String name, int power) {
        super(cost, size, name);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
