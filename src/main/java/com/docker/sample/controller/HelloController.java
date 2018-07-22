package com.docker.sample.controller;

import com.docker.sample.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adnenehamdouni on 22/07/2018.
 */

@Controller
public class HelloController {

    @RequestMapping({"/", "index"})
    public String getIndex(Model model){

        User user = new User("DockerMaster");

        model.addAttribute("user", user);

        return "index";
    }
}
