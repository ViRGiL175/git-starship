/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.events;


import rape.brutal.gitstarship.ships.GitStarShip;
import rape.brutal.gitstarship.ships.StarShip;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ViRGiL7 on 29.03.2017.
 * Project: java-git-starship
 */
public class Battle {

    public static final int MAX_BATTLE_TURNS = 150;
    private GitStarShip gitStarShip;
    private ArrayList<StarShip> enemyStarShipArrayList;

    public Battle(GitStarShip gitStarShip, ArrayList<StarShip> enemyStarShipArrayList) {
        this.gitStarShip = gitStarShip;
        this.enemyStarShipArrayList = enemyStarShipArrayList;
    }

    public void start() {
        boolean end = false;
        int battleTurn = 0;
        while ((!end) && (battleTurn < MAX_BATTLE_TURNS)) {
            if (enemyStarShipArrayList.size() != 0) {
                for (StarShip starShip : enemyStarShipArrayList) {
                    starShip.attack(gitStarShip);
                }
                gitStarShip.attack(enemyStarShipArrayList.get(new Random().nextInt(enemyStarShipArrayList.size())));
            } else {
                System.out.println("There are no one left...");
                end = true;
            }
            battleTurn++;
            if (battleTurn == MAX_BATTLE_TURNS) {
                System.out.println("All villains was harmed from boring and they flied away.");
            }
        }
    }
}
