package com.abderraoufneffati.banking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name="_user")
public class User extends AbstractEntity {


    private String firstname ;

    private String lastname ;

    private String email ;

    private String password ;

    private boolean active ;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Transaction>transactions;

    @OneToMany(mappedBy = "user")
    private List<Contact>contacts;

    @OneToOne
    private Account account;

    @OneToOne
    private Role role ;







}
