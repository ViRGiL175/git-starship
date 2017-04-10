/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import org.testng.annotations.BeforeMethod;
import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.Universe;
import rape.brutal.gitstarship.ammunition.Magazine;
import rape.brutal.gitstarship.ammunition.Turret;
import rape.brutal.gitstarship.parts.engine.SuperEngine;
import rape.brutal.gitstarship.parts.hull.SuperHull;

/**
 * Created by ViRGiL7 on 26.03.2017.
 * Project: java-git-starship
 */
public class GitStarShipTest extends StarShipTest {

    @BeforeMethod
    public void setUp() throws Exception {
        Universe universe = new Universe();
        testingStarShip = new GitStarShip(new SuperEngine(), new SuperHull(),
                new Storage(1500), 500, universe);
        testingStarShip.getHull().addGun(new Turret(new Magazine(500)));
    }
}