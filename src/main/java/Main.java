import components.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Player player = (Player)  context.getBean("player");

        player.playMusic();
        player.switchStation();
        player.switchStation();
        player.switchStation();
    }
}
