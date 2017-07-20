package pers.posse.tool.service.impl.domain;

import javax.persistence.Entity;

/**
 * Created by posse on 17-7-20.
 */
@Entity
public class Course {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
