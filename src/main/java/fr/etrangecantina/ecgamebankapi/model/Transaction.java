package fr.etrangecantina.ecgamebankapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "playerSource", referencedColumnName = "steamID", nullable = false)
    private Player playersource;


    @ManyToOne
    @JoinColumn(name = "playerrecipient", referencedColumnName = "steamID", nullable = false)
    private Player playerrecipient;

    @Column(nullable = false)
    private int amount;

    @Column(nullable = false)
    private String description;
}
