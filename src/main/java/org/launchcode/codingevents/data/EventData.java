package org.launchcode.codingevents.data;
//import java.util.Objects;

import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    // need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>();


    // get all events
    public static Collection<Event> getAll(){
        return events.values();
    }


    // get a single event
    public static Event getById(int id){
        return events.get(id);
    }


    // add event
    public static void add(Event event){
        events.put(event.getId(), event);
    }


    // remove event
    public static void remove(int id){
//        if (events.containsKey(id)) {
        events.remove(id);
//        }
    }

}
