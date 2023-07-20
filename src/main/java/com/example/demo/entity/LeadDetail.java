package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;


@Entity
@Table(name="lead_detail")
@Data
public class LeadDetail  {
    @Column(name="Id")
    @Id
    private long id;

    @Column(name="First_name")
    private String firstName;

    @Column(name="Last_name")
    private String lastName;

    @Column(name="Email_address")
    private String emailAddress;

    @Column(name="phone_number")
    private String phoneNumber;
}