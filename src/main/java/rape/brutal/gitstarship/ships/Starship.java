/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import rape.brutal.gitstarship.IAttackable;
import rape.brutal.gitstarship.IStorageable;
import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.parts.Engine;
import rape.brutal.gitstarship.parts.Hull;
import rape.brutal.gitstarship.trade.Trader;

/**
 * Created by haze on 22.03.2017.
 */
abstract public class Starship implements IAttackable {

    protected Engine engine;
    protected Hull hull;
    protected Storage storage;
    private int hitPoints;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Hull getHull() {
        return hull;
    }

    public void setHull(Hull hull) {
        this.hull = hull;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void Starship(Engine engine, Hull hull, Storage storage, int hitPoints) {

    }

    public boolean putInStorage(IStorageable iStorageable) {
        return false;
    }

    public IStorageable getFromStorage(String iStoragableName) {
        return null;
    }

    public void trade(Trader trader) {

    }

    public void attack(IAttackable iAttackable) {

    }
}
