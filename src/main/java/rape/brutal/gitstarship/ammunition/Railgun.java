/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

import rape.brutal.gitstarship.IMagnetable;
import rape.brutal.gitstarship.IStorageable;

/**
 * Created by haze on 22.03.2017.
 */
public class Railgun extends Gun {

    public Railgun() {
        super(1000, "Railgun", 10, 60);
    }

    public int fire(IStorageable iStorageable) {
        if (iStorageable instanceof IMagnetable) {
            System.out.println("Раилган пальнул!");
            return iStorageable.getSize() * 10;
        } else System.out.println("Не магнитная штука!");
        return 0;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int fire() {
        return 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
