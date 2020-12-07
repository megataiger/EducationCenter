package components;

import interfaces.PlaySong;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("station2")
public class RadioStationGoodFM implements PlaySong {

    private List<String> musicChart = Arrays.asList("song1", "song2");

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
