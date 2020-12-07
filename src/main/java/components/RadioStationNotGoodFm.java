package components;

import interfaces.PlaySong;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("station1")
public class RadioStationNotGoodFm implements PlaySong {
    private List<String> musicChart = Arrays.asList("song1", "song2");

    private String name = "notGoodFM";

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
