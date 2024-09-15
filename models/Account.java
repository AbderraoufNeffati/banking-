package com.abderraoufneffati.banking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class Account extends AbstractEntity {

    private String iban ;

    @OneToOne
    @JoinColumn(name="id_user")
    private User user;
}
