/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import rape.brutal.gitstarship.IValuable;
import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.ammunition.Magazine;
import rape.brutal.gitstarship.ammunition.Turret;
import rape.brutal.gitstarship.parts.engine.MediumEngine;
import rape.brutal.gitstarship.parts.hull.MediumHull;
import rape.brutal.gitstarship.stuff.MetalSlug;
import rape.brutal.gitstarship.stuff.Sheep;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by haze on 22.03.2017.
 */
public class PirateStarShip extends StarShip {

    private ArrayList<StarShip> shipsFleetArrayList;

    public PirateStarShip(ArrayList<StarShip> shipsFleetArrayList) {
        super(new MediumEngine(), new MediumHull(), new Storage(100), 20);
        setUpShip();
        shipsFleetArrayList.add(this);
        this.shipsFleetArrayList = shipsFleetArrayList;
    }

    private void setUpShip() {
        hull.addGun(new Turret(new Magazine(500)));
        hull.addGun(new Turret(new Magazine(250)));
        for (int i = 0; i < new Random().nextInt(8); i++) {
            storage.putItem(new Magazine(500));
        }
        generateLoot(getLootVariants());
    }

    @Override
    protected void onDestroy() {
        shipsFleetArrayList.remove(this);
    }

    @Override
    protected ArrayList<IValuable> getLootVariants() {
        ArrayList<IValuable> lootArrayList = new ArrayList<>();
        lootArrayList.add(new MetalSlug());
        lootArrayList.add(new Sheep());
        lootArrayList.add(new Magazine(250));
        return lootArrayList;
    }
}
