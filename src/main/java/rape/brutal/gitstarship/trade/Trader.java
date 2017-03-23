/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.trade;

import rape.brutal.gitstarship.Storage;

/**
 * Created by haze on 22.03.2017.
 */
public abstract class Trader {

    protected int cash;
    protected Storage storage;

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
