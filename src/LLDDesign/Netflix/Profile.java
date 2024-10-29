package LLDDesign.Netflix;

import java.util.List;

public class Profile {
    private String profileId;
    private String name;
    private List<String> watchHistory;
    private WatchList watchlist;

    public Profile(String profileId, String name, List<String> watchHistory, WatchList watchlist) {
        this.profileId = profileId;
        this.name = name;
        this.watchHistory = watchHistory;
        this.watchlist = watchlist;
    }

    public void rateContent(Content content, int rating) {
        content.addRating(this, rating);
    }

    // Getters and Setters
    public String getProfileId() {
        return profileId;
    }

    public String getName() {
        return name;
    }

    public List<String> getWatchHistory() {
        return watchHistory;
    }

    public WatchList getWatchlist() {
        return watchlist;
    }
}
