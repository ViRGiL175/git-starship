/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by ViRGiL7 on 26.03.2017.
 * Project: java-git-starship
 */
public abstract class StarshipTest {

    protected Starship testingStarship;

    @DataProvider
    public static Object[][] getDamageData() {
        return new Object[][]{
                {5},
                {0},
                {-1},
                {Integer.MAX_VALUE},
                {Integer.MIN_VALUE},
        };
    }

    @Test(dataProvider = "getDamageData")
    public void testSetDamage(int damage) throws Exception {
        testingStarship.setDamage(damage);
    }
}