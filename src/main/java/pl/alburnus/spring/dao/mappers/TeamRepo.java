package pl.alburnus.spring.dao.mappers;

import pl.alburnus.spring.model.Team;

import java.util.List;

public interface TeamRepo {

    List<Team> getAllTeams();
}
