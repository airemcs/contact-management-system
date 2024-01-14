package com.airelle.management.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter

//@Data
//@Table(name = "Contact")

public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    private String fullName;
    private String mobileNumber;
    private String address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
