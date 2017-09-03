package com.binyomincode.quarters;

import com.binyomincode.quarters.QuarterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by seanc on 03/09/17.
 */

@RestController
public class QuartersController {

    @Autowired
    QuarterEventRepository quarterEventRepository;

    @RequestMapping("/event1")
    public QuarterEvent getSample(){
        QuarterEvent quarterEvent = new QuarterEvent(2.25, "just Because");
        return quarterEvent;
    }

    @RequestMapping("/makeEvents")
    public ApiStatus makeEvents(){
        double[] diffs = {1.25, 3.5, 2, 99};
        String[] causes = {"becuase", "just because", "no good reason", "not sure"};
        for(int i = 0; i < diffs.length; i++){
            quarterEventRepository.save(new QuarterEvent(diffs[i], causes[i]));
        }
        return new ApiStatus("success");
    }
    @RequestMapping("getAll")
    public List<QuarterEvent> getAll(){
        List<QuarterEvent> allEvents = quarterEventRepository.findAll();
        return allEvents;
    }
}
