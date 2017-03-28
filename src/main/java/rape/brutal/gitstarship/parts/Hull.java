/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.parts;

import rape.brutal.gitstarship.ammunition.Gun;

/**
 * Created by haze on 22.03.2017.
 */
public class Hull extends ShipPart {

    private int cost;
    private String name;
    private int size;

    private Gun[] guns = new Gun[8];

    public Gun[] getGuns() {
        return guns;
    }

    public void setGuns(Gun[] guns) {
        this.guns = guns;
    }

    public void addGun() {

    }

    public void removeGun() {

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
