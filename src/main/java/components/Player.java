package components;

import interfaces.PlaySong;
import org.springframework.stereotype.Component;

@Component("player")
public class Player {
    public void playMusic(PlaySong playSong) {
        playSong.play();
    }
}
