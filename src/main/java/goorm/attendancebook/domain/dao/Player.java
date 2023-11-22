package goorm.attendancebook.domain.dao;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int playerId;

    @Column(name = "player_pw", length = 255, nullable = false)
    private String playerPw;

    @Column(name = "player_name", length = 20, nullable = false)
    private String playerName;

    @Column(name = "player_email", length = 100)
    private String playerEmail = "youremail@groom.io";

    @Column(name = "player_course", length = 20, nullable = false)
    private String playerCourse;

    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY)
    private List<Attendance> attendances;

    public Player() {
    }

    public Player(int playerId, String playerPw, String playerName, String playerEmail, String playerCourse) {
        this.playerId = playerId;
        this.playerPw = playerPw;
        this.playerName = playerName;
        this.playerEmail = (playerEmail != null) ? playerEmail : "youremail@groom.io";
        this.playerCourse = playerCourse;
    }

}
