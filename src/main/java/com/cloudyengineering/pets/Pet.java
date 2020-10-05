package com.cloudyengineering.pets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pet {
    
    @JsonProperty("pet_id")
    private Integer petId;

    @JsonProperty("pet_type")
    private String petType;

    @JsonProperty("pet_name")
    private String petName;

    @JsonProperty("pet_age")
    private Integer petAge;

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Integer getPetAge() {
        return petAge;
    }

    public void setPetAge(Integer petAge) {
        this.petAge = petAge;
    }

}
