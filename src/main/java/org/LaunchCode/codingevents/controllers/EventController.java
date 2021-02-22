package org.LaunchCode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model){
        model.addAttribute("events",events);
        return "events/index";
    }

    // /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName){
        events.add(eventName);
        return  "redirect:";
    }

}
