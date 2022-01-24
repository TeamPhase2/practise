package com.techm.h2database.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.persistence.*;


@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private String location;
    @JsonProperty("salary")
    private String salary;

   public Employee() {
    }

    public Employee(Integer id, String name, String location, String salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}
