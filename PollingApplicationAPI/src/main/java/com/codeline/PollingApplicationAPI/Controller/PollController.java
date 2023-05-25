package com.codeline.PollingApplicationAPI.Controller;

import com.codeline.PollingApplicationAPI.Models.Poll;
import com.codeline.PollingApplicationAPI.Service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class PollController {
    @Autowired
    PollService pollService;
    //===================================================================

    @RequestMapping("poll/create")
    public void savePoll () {
        createPoll();
    }
    //====================================================================
    @RequestMapping("poll/get")
    public List<Poll> getPoll () {
        return pollService.getPll();
    }


    public void createPoll() {

        Poll poll = new Poll();
        poll.setQuestion("What is your favorite color?");
        poll.setCreatedDate(new Date());
        poll.setIsActive(true);
        pollService.savePoll(poll);
    }
}
