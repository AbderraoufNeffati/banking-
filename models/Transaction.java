package com.abderraoufneffati.banking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.math.BigDecimal;


@Entity(name = "\"Transaction\"")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Transaction extends AbstractEntity {

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private String destinationIban;



    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

}
