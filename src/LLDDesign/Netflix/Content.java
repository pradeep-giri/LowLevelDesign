package LLDDesign.Netflix;

import java.util.List;
import java.util.Map;

public class Content {
    private String contentId;
    private String title;
    private Genre genre;
    private List<String> actors;
    private int duration;
    private String url;
    private Map<Profile, Integer> ratings;

    public Content(String contentId, String title, Genre genre, List<String> actors, int duration, String url) {
        this.contentId = contentId;
        this.title = title;
        this.genre = genre;
        this.actors = actors;
        this.duration = duration;
        this.url = url;
    }

    public void addRating(Profile profile, int rating) {
        ratings.put(profile, rating);
    }

    public double getAvgRating() {
        return ratings.values().stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    // Getters and Setters
    public String getContentId() {
        return contentId;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public List<String> getActors() {
        return actors;
    }

    public int getDuration() {
        return duration;
    }

    public String getUrl() {
        return url;
    }
}
