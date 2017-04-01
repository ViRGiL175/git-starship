/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rape.brutal.gitstarship.parts.Hull;
import rape.brutal.gitstarship.parts.engine.SuperEngine;
import rape.brutal.gitstarship.ships.GitStarship;

import java.util.Random;

/**
 * Created by ViRGiL7 on 01.04.2017.
 * Project: java-git-starship
 */
public class UniverseTest {

    private Universe universe;
    private GitStarship gitStarship;

    @BeforeMethod
    public void setUp() throws Exception {
        universe = new Universe();
        gitStarship = new GitStarship(new SuperEngine(), new Hull(5, 3, "Hull"),
                new Storage(500), 599, universe);
    }

    @Test
    public void testStatisticState() throws Exception {
        Random random = new Random();
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());
        universe.statisticState(gitStarship);
    }

}