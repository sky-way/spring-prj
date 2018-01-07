package com.example.demo;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexControler {

    final VisitsRepository visitsRepository;

    public IndexControler(final VisitsRepository visitsRepository) {
        this.visitsRepository = visitsRepository;
    }

    @GetMapping("/")
    public ModelAndView index(){
        Map<String,String> model = new HashMap<>();
        model.put("name", "Andrei");

        Visit visit = new Visit();
        visit.descripton = String.format("Visited at %s", LocalTime.now());

        return new ModelAndView("index", model);
    }


}
