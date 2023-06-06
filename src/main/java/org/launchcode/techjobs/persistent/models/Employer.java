package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {


    @NotBlank(message = "Enter a location.")
    @Size(min = 3, max = 100, message = "Must be between 3 and 100 characters long." )
    private String location;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    //no arg constructor??????????
    public Employer() { };

}
