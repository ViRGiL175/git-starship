/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

import rape.brutal.gitstarship.IValuable;
import rape.brutal.gitstarship.ammunition.bullet.AverageBullet;


/**
 * Created by haze on 22.03.2017.
 */
public class Magazine implements IValuable {

    protected int capacity;
    protected Ammo[] ammo;
    protected String name;
    protected int size;
    protected int cost;

    public Magazine(int capacity) {
        this.capacity = capacity;
        this.name = "Magazine " + hashCode();
        this.size = 3;
        this.cost = 12;
        this.ammo = new Ammo[capacity];
        for (int i = 0; i < ammo.length; i++) {
            ammo[i] = new AverageBullet();
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Ammo[] getAmmo() {
        return ammo;
    }

    public void setAmmo(int numberOfBullet, Ammo bullet) {
        this.ammo[numberOfBullet] = bullet;
    }

    /**
     * Shoot one ammo and returns damage.
     */
    public int shootAmmo() {
        int i;
        int damage = 0;
        if (this.ammo[capacity - 1] == null) {
            System.out.println("Патроны в магазине закончились!");
        }
        for (i = 0; i < capacity; i++) {
            if (this.ammo[i] != null) {
                damage = ammo[i].getDamage();
                this.ammo[i] = null;
                System.out.println("Выстрел совершён!");
                break;
            }

        }
        return damage;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
