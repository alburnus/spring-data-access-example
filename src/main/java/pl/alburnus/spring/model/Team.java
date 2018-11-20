package pl.alburnus.spring.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Builder
@ToString
@EqualsAndHashCode
public class Team extends BaseEntity {

    @Getter
    private String name;

    @OneToMany
    @JoinColumn(name = "team_id")
    private List<User> userList;

    protected Team() {
    }

    protected Team(String name, List<User> userList) {
        this.name = name;
        this.userList = userList;
    }
}
