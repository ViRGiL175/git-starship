/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.events;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.Universe;
import rape.brutal.gitstarship.parts.engine.SuperEngine;
import rape.brutal.gitstarship.parts.hull.SuperHull;
import rape.brutal.gitstarship.ships.GitStarShip;
import rape.brutal.gitstarship.ships.PirateStarShip;
import rape.brutal.gitstarship.ships.StarShip;

import java.util.ArrayList;

/**
 * Created by ViRGiL7 on 29.03.2017.
 * Project: java-git-starship
 */
public class BattleTest {

    private Battle battle;
    private Universe universe;
    private GitStarShip gitStarship;
    private ArrayList<StarShip> enemyStarshipArrayList;

    @BeforeMethod
    public void setUp() throws Exception {
        universe = new Universe();
        gitStarship = new GitStarShip(new SuperEngine(),
                new SuperHull(), new Storage(400), 300, universe);
        enemyStarshipArrayList = new ArrayList<>();
        enemyStarshipArrayList.add(new PirateStarShip(enemyStarshipArrayList));
        enemyStarshipArrayList.add(new PirateStarShip(enemyStarshipArrayList));
        enemyStarshipArrayList.add(new PirateStarShip(enemyStarshipArrayList));
        battle = new Battle(gitStarship, enemyStarshipArrayList);
    }

    @Test
    public void testStart() throws Exception {
        battle.start();
    }

}