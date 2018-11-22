package pl.alburnus.spring.repository.mybatis;

import pl.alburnus.spring.model.Team;

import java.util.List;

public interface TeamRepo {

    List<Team> getAllTeams();
}
