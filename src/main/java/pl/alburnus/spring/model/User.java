package pl.alburnus.spring.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@Builder
@ToString
@EqualsAndHashCode
public class User extends BaseEntity {

    @Getter
    private String name;

    protected User() {
    }

    protected User(String name) {
        this.name = name;
    }
}
