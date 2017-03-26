/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

/**
 * Created by ViRGiL7 on 26.03.2017.
 * Project: java-git-starship
 */
public class PirateStarshipTest extends StarshipTest {

    @BeforeMethod
    public void setUp() throws Exception {
        ArrayList<Starship> shipsFleetArrayList = new ArrayList<>();
        testingStarship = new PirateStarship(null, null, null, 0, shipsFleetArrayList);
    }

}