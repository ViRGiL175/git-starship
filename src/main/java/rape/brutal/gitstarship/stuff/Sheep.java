/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.stuff;

/**
 * Created by haze on 24.03.2017.
 */
public class Sheep extends Loot {

    public Sheep() {
        super(10, 20, "Sheep");
    }

    @Override
    protected void randomizeFields() {
        cost += random.nextInt(50);
        size += random.nextInt(150);
    }
}
