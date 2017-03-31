/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

/**
 * Created by haze on 22.03.2017.
 */
public class Ammo {

    protected int damageIncreasing = 0;
    protected int damage;

    public Ammo(int damage, int damageIncreasing) {
        this.damage = damage;
        this.damageIncreasing = damageIncreasing;
    }

    public int getDamage() {
        return damage + damageIncreasing;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamageIncreasing() {
        return damageIncreasing;
    }

    public void setDamageIncreasing(int damageIncreasing) {
        this.damageIncreasing = damageIncreasing;
    }
}
