package LLDDesign.BookMyShow;

public class Movie {
    private int id;
    private String title;
    private String description;
    private int durationInMinutes;

    public Movie(int id, String title, String description, int durationInMinutes) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.durationInMinutes = durationInMinutes;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getDurationInMinutes() { return durationInMinutes; }
}
