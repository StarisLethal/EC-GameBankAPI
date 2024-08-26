package fr.etrangecantina.ecgamebankapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="player")
public class Player {

    @Id
    @Column(nullable = false)
    private String discordID;

    @Column(nullable = false)
    private String steamID;


}
