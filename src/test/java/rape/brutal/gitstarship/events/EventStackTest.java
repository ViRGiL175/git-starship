/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.events;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by ViRGiL7 on 25.03.2017.
 * Project: java-git-starship
 */
public class EventStackTest {

    private EventStack eventStack;
    private Event testGetEventResultEvent;

    @BeforeMethod
    public void setUp() throws Exception {
        eventStack = new EventStack();
    }

    @Test
    public void testGetEvent() throws Exception {
        Event event = eventStack.getEvent();
        assert (event != null);
        this.testGetEventResultEvent = event;
    }

    @Test(dependsOnMethods = "testGetEvent")
    public void testStartEvent() throws Exception {
        testGetEventResultEvent.start();
    }
}