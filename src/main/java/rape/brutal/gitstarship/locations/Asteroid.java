/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.locations;

import rape.brutal.gitstarship.ILandable;
import rape.brutal.gitstarship.IValuable;
import rape.brutal.gitstarship.ships.GitStarShip;
import rape.brutal.gitstarship.stuff.MetalSlug;
import rape.brutal.gitstarship.stuff.Sheep;
import rape.brutal.gitstarship.trade.Trader;

import java.util.ArrayList;

/**
 * Created by haze on 22.03.2017.
 */
public class Asteroid extends Location implements ILandable {

    private Trader trader;

    public Asteroid(Trader trader) {
        this.trader = trader;
        generateLoot(getLootVariants());
    }

    @Override
    protected ArrayList<IValuable> getLootVariants() {
        // todo: add loot variants
        ArrayList<IValuable> lootArrayList = new ArrayList<>();
        lootArrayList.add(new MetalSlug());
        lootArrayList.add(new Sheep());
        return lootArrayList;
    }

    @Override
    public void land(GitStarShip gitStarship) {
        System.out.println("You land on average desert cold asteroid.");
        if (!storage.getAllItemNames().isEmpty()) {
            System.out.println("Hurray! You find some loot!");
            gitStarship.loot(storage);
        }
        if (trader != null) {
            System.out.println("Hurray! Trader here!");
            gitStarship.trade(trader);
        }
        System.out.println("You fly away.");
    }
}
