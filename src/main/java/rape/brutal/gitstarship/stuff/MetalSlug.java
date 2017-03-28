/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.stuff;

import rape.brutal.gitstarship.IMagnetable;

/**
 * Created by haze on 24.03.2017.
 */
public class MetalSlug extends Loot implements IMagnetable {

    public MetalSlug() {
        super(300, 50, "Metal Slug");
    }

    @Override
    protected void randomizeFields() {
        cost += random.nextInt(50);
        size += random.nextInt(150);
    }
}
