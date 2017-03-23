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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Ammo[] getAmmo() {
        return ammo;
    }

    public void setAmmo(Ammo[] ammo) {
        this.ammo = ammo;
    }

    public void removeAmmo() {

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
