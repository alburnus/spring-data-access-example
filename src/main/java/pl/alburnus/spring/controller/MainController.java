package pl.alburnus.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class MainController {

    @RequestMapping("/team")
    public String loadTeamView() {
        return "team-view";
    }
}
