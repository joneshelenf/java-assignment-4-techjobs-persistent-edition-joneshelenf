package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message = "Enter a description.")
    @Size(min = 20, max = 500, message = "Enter a description between 20 and 500 characters long.")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //no arg constructor?!?!?!????????!?
    public Skill() { }
}