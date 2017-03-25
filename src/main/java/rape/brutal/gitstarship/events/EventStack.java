/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.events;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ViRGiL7 on 25.03.2017.
 * Project: java-git-starship
 */
public class EventStack {

    // Change EVENTS_COUNT to actual value
    public static final int EVENTS_COUNT = 1;

    private ArrayList<Event> eventArrayList = new ArrayList<>();

    public EventStack() {
        for (int i = 0; i < 5; i++) {
            eventArrayList.add(generateNewEvent());
        }
    }

    public Event getEvent() {
        return getEvent(0);
    }

    public Event getEvent(int index) {
        Event event = eventArrayList.get(index);
        eventArrayList.remove(index);
        eventArrayList.add(generateNewEvent());
        return event;
    }

    private Event generateNewEvent() {
        int eventVariant = new Random().nextInt(EVENTS_COUNT);
        return getEventByVariant(eventVariant);
    }

    private Event getEventByVariant(int eventVariant) {
        switch (eventVariant) {
            case 0:
                return new Event() {
                    @Override
                    public void start() {
                        super.start();
                        System.out.println("Test event started");
                    }
                };
            // Add existing events in this condition structure.
            // For example:
            // case 0:
            //     return new GannibalFlyingCatsEvent();
            // case 1:
            //     return new FrontierPlanetEvent();
            // case 2:
            //     return new GravityAnomalyEvent();
            // case 3:
            //     return new AliensMeetingEvent();
            default:
                return null;
        }
    }
}
