package LLDDesign.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private int id;
    private String name;
    private String location;
    private List<Show> shows;

    public Theater(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.shows = new ArrayList<>();
    }

    public void addShow(Show show) { shows.add(show); }
    public void removeShow(Show show) { shows.remove(show); }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }
    public List<Show> getShows() { return shows; }
}
