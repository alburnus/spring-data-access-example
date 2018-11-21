package pl.alburnus.spring.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Builder
@ToString
@EqualsAndHashCode
public class Teammate extends BaseEntity {

    @Getter
    private String name;

    protected Teammate() {
    }

    protected Teammate(String name) {
        this.name = name;
    }
}
