package ru.moex.api.organization.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORGANIZATION_GROUP")
public class OrganizationGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
