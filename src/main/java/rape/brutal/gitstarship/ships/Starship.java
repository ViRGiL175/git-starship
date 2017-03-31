/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ships;

import rape.brutal.gitstarship.IAttackable;
import rape.brutal.gitstarship.IStorageable;
import rape.brutal.gitstarship.Storage;
import rape.brutal.gitstarship.ammunition.Gun;
import rape.brutal.gitstarship.parts.Hull;
import rape.brutal.gitstarship.parts.engine.Engine;
import rape.brutal.gitstarship.stuff.Loot;
import rape.brutal.gitstarship.trade.AverageTrader;
import rape.brutal.gitstarship.trade.Mechanic;
import rape.brutal.gitstarship.trade.Trader;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


/**
 * Created by haze on 22.03.2017.
 */
abstract public class Starship implements IAttackable {

    protected Engine engine;
    protected Hull hull;
    protected Storage storage;
    private int hitPoints;
    private int money = 0;

    public Starship(Engine engine, Hull hull, Storage storage, int hitPoints) {
        this.engine = engine;
        this.hull = hull;
        this.storage = storage;
        this.hitPoints = hitPoints;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Hull getHull() {
        return hull;
    }

    public void setHull(Hull hull) {
        this.hull = hull;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean putInStorage(IStorageable iStorageable) {
        return storage.putItem(iStorageable);
    }

    public IStorageable getFromStorage(String iStoragableName) {
        return storage.getItem(iStoragableName);
    }

    public void trade(Trader trader) {
        boolean exit = false;
        while (!exit) {
            // todo: replace with trader method, not via storage!
            System.out.println("Trading:");
            showMoney();
            System.out.println("Want to buy something or sell all useless goods? (b/s/n)");
            String inputString = new Scanner(System.in).nextLine();
            switch (inputString) {
                case "b":
                    buy(trader);
                    break;
                case "s":
                    sell(trader);
                    break;
                case "n":
                    exit = true;
                    break;
                default:
                    break;
            }
        }
    }

    private void sell(Trader trader) {
        if (trader instanceof AverageTrader) {
            sellToAverageTrader((AverageTrader) trader);
        } else if (trader instanceof Mechanic) {
            sellToMechanicTrader((Mechanic) trader);
        }
    }

    private void sellToMechanicTrader(Mechanic mechanic) {
        // todo: mechanic selling
    }

    private void sellToAverageTrader(AverageTrader averageTrader) {
        boolean exit = false;
        System.out.println("Sell all useless Loot to Trader? (y/n)");
        while (!exit) {
            String inputString = new Scanner(System.in).nextLine();
            if (Objects.equals(inputString, "y")) {
                exit = true;
                System.out.println("OK. Let's see...");
                Set<String> allItemNames = storage.getAllItemNames();
                for (String currentName : allItemNames) {
                    IStorageable item = storage.getItem(currentName);
                    if (item instanceof Loot) {
                        System.out.println(item.getName() + " sold for " + ((Loot) item).getCost() +
                                " space credits");
                        averageTrader.sell(((Loot) item).getCost(), item.getName());
                    }
                }
            } else if (Objects.equals(inputString, "n")) {
                exit = true;
                System.out.println("OK, bye!");
            }
        }
    }

    private void buy(Trader trader) {
        if (trader instanceof AverageTrader) {
            buyFromAverageTrader((AverageTrader) trader);
        } else if (trader instanceof Mechanic) {
            buyFromMechanicTrader((Mechanic) trader);
        }

    }

    private void buyFromMechanicTrader(Mechanic mechanic) {
        // todo: mechanic buying
    }

    private void buyFromAverageTrader(AverageTrader averageTrader) {
        boolean exit = false;
        while (!exit) {
            showMoney();
            System.out.println("Trader's items:");
            // todo: replace with averageTrader method, not via storage!
            Storage traderStorage = averageTrader.getStorage();
            ArrayList<String> itemNamesArrayList = new ArrayList<>(traderStorage.getAllItemNames());
            for (int i = 0; i < itemNamesArrayList.size(); i++) {
                System.out.println(i + ") " + itemNamesArrayList.get(i) + " : " /*averageTrader.getItemCost(itemName)*/);
            }
            System.out.println("Want to buy something? (n for exit)");
            String inputString = new Scanner(System.in).nextLine();
            if (inputString.matches("-?\\d+(\\.\\d+)?")) {
                // todo: buy() method
                // averageTrader.buy(itemNamesArrayList.get(Integer.parseInt(inputString)));
            } else if (Objects.equals(inputString, "n")) {
                exit = true;
            }
        }
    }

    private void showMoney() {
        System.out.println("You have " + money + " space credits.");
    }

    public void attack(IAttackable iAttackable) {
        iAttackable.setDamage(generateDamage());
    }

    private int generateDamage() {
        Gun[] guns = hull.getGuns();
        int damage = 0;
        for (Gun gun : guns) {
            damage += gun.fire();
        }
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        if (getHitPoints() <= damage) {
            onDestroy();
        } else {
            setHitPoints(getHitPoints() - damage);
        }
    }

    protected abstract void onDestroy();

    public void loot(Storage storage) {
        System.out.println("You found:");
        Set<String> allItemNamesSet = storage.getAllItemNames();
        for (String itemName : allItemNamesSet) {
            System.out.println(itemName);
        }
        boolean exit = false;
        while (!exit) {
            System.out.println("Take it? (y/n)");
            String inputString = new Scanner(System.in).nextLine();
            switch (inputString) {
                case "y":
                    this.storage.putItems(storage);
                    exit = true;
                    break;
                case "n":
                    exit = true;
                    break;
                default:
                    break;
            }
        }
    }
}
