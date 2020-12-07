package components;

import interfaces.PlaySong;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@ConditionalOnProperty(prefix = "application", name = "ageControl", havingValue = "+18")
public class RadioStationNothingFM implements PlaySong {
    private List<String> musicChart = Arrays.asList("Slipknot - Devil in I", "Slayer - track 1");

    private String name = "goodFM";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMusicChart() {
        return musicChart;
    }

    public void setMusicChart(List<String> musicChart) {
        this.musicChart = musicChart;
    }

    public void play() {
        System.out.println("Station " +  name + ": "  + musicChart.get(0));
    }
}
