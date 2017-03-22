/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.ammunition;

import rape.brutal.gitstarship.IStorageable;

/**
* Created by haze on 22.03.2017.
*/
public abstract class Gun implements IStorageable {
protected int damage;
protected String name;
protected int size;

    public int fire() {
        return 0;
    }
}
