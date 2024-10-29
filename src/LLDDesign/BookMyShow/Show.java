package LLDDesign.BookMyShow;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Show {
    private int id;
    private Movie movie;
    private Theater theater;
    private Date startTime;
    private Date endTime;
    private ConcurrentHashMap<Integer, Seat> seatMap; // Key: Seat ID

    // Constructor, Getters, and Setters

    public Show(int id, Movie movie, Theater theater, Date startTime, Date endTime, Map<Integer, Seat> seatMap) {
        this.id = id;
        this.movie = movie;
        this.theater = theater;
        this.startTime = startTime;
        this.endTime = endTime;
        this.seatMap = new ConcurrentHashMap<>(seatMap);
    }

    public Seat getSeat(int seatId) {
        return seatMap.get(seatId);
    }

    public ConcurrentHashMap<Integer, Seat> getSeatMap() {
        return seatMap;
    }

    // Additional Getters
    public int getId() { return id; }
    public Movie getMovie() { return movie; }
    public Theater getTheater() { return theater; }
    public Date getStartTime() { return startTime; }
    public Date getEndTime() { return endTime; }
}
