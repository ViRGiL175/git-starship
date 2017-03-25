/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import org.testng.annotations.BeforeMethod;
import rape.brutal.gitstarship.Universe;

/**
 * Created by ViRGiL7 on 26.03.2017.
 * Project: java-git-starship
 */
public class GitStarshipTest extends StarshipTest {

    @BeforeMethod
    public void setUp() throws Exception {
        Universe universe = new Universe();
        testingStarship = new GitStarship(null, null, null, 0, universe);
    }
}