package pl.alburnus.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.alburnus.spring.dao.mappers.TeamRepo;
import pl.alburnus.spring.dao.mappers.TeammateRepo;
import pl.alburnus.spring.dto.TeammateVo;
import pl.alburnus.spring.model.Team;
import pl.alburnus.spring.model.Teammate;

import java.util.List;

@Controller
@RequestMapping("/view")
public class MainController {

    private final TeammateRepo teammateRepo;

    private final TeamRepo teamRepo;

    public MainController(TeammateRepo teammateRepo, TeamRepo teamRepo) {
        this.teammateRepo = teammateRepo;
        this.teamRepo = teamRepo;
    }

    @RequestMapping("/team")
    public String loadTeamView(Model model) {
        List<Team> teams = teamRepo.getAllTeams();
        System.out.println(teams.toString());

        model.addAttribute("teams", teams);
        return "team-view";
    }

    @RequestMapping("/teammate")
    public String loadTeammateView(Model model) {
        List<Teammate> allTeammates = teammateRepo.getAllUsers();
        Teammate byId = teammateRepo.findById(1L);
        Teammate byName = teammateRepo.finByName("Krzysztof");
        System.out.println("loadTeammateView:" + allTeammates.toString());
        System.out.println("loadTeammateView byId: " + byId.toString());
        System.out.println("loadTeammateView byName: " + byName.toString());

        model.addAttribute("teammates", allTeammates);
        return "teammate-view";
    }

    @RequestMapping("/teammate/new")
    public String loadTeammateFormView() {
        return "add-teammate-view";
    }

    @RequestMapping(value = "/teammate", method = RequestMethod.POST)
    public String createTeammate(TeammateVo teammate, Model model) {
        teammateRepo.create(Teammate.builder().name(teammate.getName()).build());
        model.addAttribute("teammates", teammateRepo.getAllUsers());

        List<Teammate> allTeammates = teammateRepo.getAllUsers();
        Teammate byId = teammateRepo.findById(1L);
        Teammate byName = teammateRepo.finByName("Krzysztof");
        System.out.println("loadTeammateView:" + allTeammates.toString());
        System.out.println("loadTeammateView byId: " + byId.toString());
        System.out.println("loadTeammateView byName: " + byName.toString());

        return "teammate-view";
    }
}
