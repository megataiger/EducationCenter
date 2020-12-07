import components.Player;
import interfaces.PlaySong;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Player player = (Player)  context.getBean("player");
        PlaySong playSong = (PlaySong) context.getBean("station2");

        player.playMusic(playSong);
    }
}
