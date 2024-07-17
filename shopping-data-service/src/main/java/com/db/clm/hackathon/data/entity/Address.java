package com.db.clm.hackathon.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ADDRESS")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstLineOfAddress;
    private String secondLineOfAddress;
    private String postcode;
    private String city;
    private String country;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
