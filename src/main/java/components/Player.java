package components;

import interfaces.PlaySong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("player")
public class Player {

    private List<PlaySong> playSongList;

    private int stationNumber = 0;

    @Autowired
    public Player(List<PlaySong> playSongList) {
        this.playSongList = playSongList;
    }

    public void playMusic() {
        playSongList.get(stationNumber).play();
    }

    public void switchStation() {
        if (stationNumber < playSongList.size()-1) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
        playMusic();
    }
}
