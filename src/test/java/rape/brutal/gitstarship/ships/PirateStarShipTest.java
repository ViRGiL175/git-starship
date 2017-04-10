/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import org.testng.annotations.BeforeMethod;
import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.ammunition.Magazine;
import rape.brutal.gitstarship.ammunition.Turret;
import rape.brutal.gitstarship.parts.engine.MediumEngine;
import rape.brutal.gitstarship.parts.hull.MediumHull;

import java.util.ArrayList;

/**
 * Created by ViRGiL7 on 26.03.2017.
 * Project: java-git-starship
 */
public class PirateStarShipTest extends StarShipTest {

    @BeforeMethod
    public void setUp() throws Exception {
        ArrayList<StarShip> shipsFleetArrayList = new ArrayList<>();
        testingStarShip = new PirateStarShip(new MediumEngine(), new MediumHull(),
                new Storage(5000), 560, shipsFleetArrayList);
        testingStarShip.getHull().addGun(new Turret(new Magazine(500)));
    }

}