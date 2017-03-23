/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

/**
 * Created by haze on 22.03.2017.
 */
public class Turret extends Gun {

    private int cost;
    private String name;
    private int size;

    private Magazine loadedMagazine;

    public Magazine getLoadedMagazine() {
        return loadedMagazine;
    }

    public void setLoadedMagazine(Magazine loadedMagazine) {
        this.loadedMagazine = loadedMagazine;
    }

    public void reload(Magazine magazine) {

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
