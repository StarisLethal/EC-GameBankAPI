package fr.etrangecantina.ecgamebankapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="account")
public class Account {

    @Id
    private String steamID;

    @OneToOne
    @JoinColumn(name = "steamID", referencedColumnName = "steamID")
    private Player player;

    @Column(nullable = false)
    private Integer balance;
}
