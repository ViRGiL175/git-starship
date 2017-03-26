/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.trade;

import rape.brutal.gitstarship.IValuable;

/**
 * Created by haze on 22.03.2017.
 */
public class AverageTrader extends Trader {

    public boolean sell(int cash, String itemName) {
        return false;
    }

    public IValuable buy(int cash, String itemName) {
        return null;
    }
}
