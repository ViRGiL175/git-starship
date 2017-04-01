/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship;

import rape.brutal.gitstarship.ships.GitStarship;

/**
 * Created by haze on 22.03.2017.
 */
public class Universe {

    private int kills;
    private int moneySpends;

    public void journeyState(GitStarship gitStarship) {

    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getMoneySpends() {
        return moneySpends;
    }

    public void setMoneySpends(int moneySpends) {
        this.moneySpends = moneySpends;
    }

    public void winState(GitStarship gitStarship) {
        // todo: win content
        statisticState(gitStarship);
    }

    public void loseState(GitStarship gitStarship) {
        // todo: lose content
        statisticState(gitStarship);
    }

    public void statisticState(GitStarship gitStarship) {
        clearScreen();
        if (gitStarship.getHitPoints() <= 0) {
            System.out.println("Brave Git Starhip lost in endless space...");
        } else {
            System.out.println("Brave Git Starhip win endless space!");
        }
        System.out.println("\n\n");
        System.out.println("Kills: " + kills);
        System.out.println("Money spend: " + moneySpends);
    }

    private void clearScreen() {
        for (int i = 0; i < 40; i++) {
            System.out.println("\n");
        }
    }

    public void getStats() {

    }
}
