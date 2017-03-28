/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.locations;

import rape.brutal.gitstarship.ILandable;
import rape.brutal.gitstarship.ships.GitStarship;
import rape.brutal.gitstarship.stuff.Loot;
import rape.brutal.gitstarship.stuff.MetalSlug;
import rape.brutal.gitstarship.stuff.Sheep;
import rape.brutal.gitstarship.trade.Trader;

import java.util.ArrayList;
import java.util.Random;

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
    protected void generateLoot(ArrayList<Loot> lootVariantsArrayList) {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(10); i++) {
            int lootVariant = random.nextInt(lootVariantsArrayList.size());
            storage.putItem(lootVariantsArrayList.get(lootVariant));
        }
    }

    @Override
    protected ArrayList<Loot> getLootVariants() {
        ArrayList<Loot> lootArrayList = new ArrayList<>();
        lootArrayList.add(new MetalSlug());
        lootArrayList.add(new Sheep());
        return lootArrayList;
    }

    @Override
    public void land(GitStarship gitStarship) {
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
