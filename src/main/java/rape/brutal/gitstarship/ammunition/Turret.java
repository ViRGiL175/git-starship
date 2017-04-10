/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

/**
 * Created by haze on 22.03.2017.
 */
public class Turret extends Gun {

    private Magazine loadedMagazine;

    public Turret(Magazine magazine) {
        super("Turret", 7, 45);
        this.loadedMagazine = magazine;
    }

    public Magazine getLoadedMagazine() {
        return loadedMagazine;
    }

    public void setLoadedMagazine(Magazine loadedMagazine) {
        this.loadedMagazine = loadedMagazine;
    }

    public void reload(Magazine magazine) {
        this.loadedMagazine = magazine;
    }

    public int fire() {
        return this.loadedMagazine.shootAmmo();
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
