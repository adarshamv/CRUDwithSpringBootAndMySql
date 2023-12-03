package com.ivoyant.DemoCRUD.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Student {
    @Id
    private int rollNo;
    private String name;
    private String Address;

}
