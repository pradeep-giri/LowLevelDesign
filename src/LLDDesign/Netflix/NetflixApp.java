package LLDDesign.Netflix;

import LLDDesign.Netflix.Adapter.NetflixStreamingService;
import LLDDesign.Netflix.Adapter.StreamingService;
import LLDDesign.Netflix.Strategy.WatchHistoryBasedRecommendationStrategy;

import java.util.ArrayList;
import java.util.List;

public class NetflixApp {
    public static void main(String[] args) {
        // Step 1: Initialize content data
        List<Content> allContents = MockData.getAllContents();

        // Step 2: Create a user and a profile
        User user = new User("1001", "user1@netflix.com", new ArrayList<>());
        Profile profile = new Profile("1001-1", "User1Profile", new ArrayList<>(), new WatchList());
        user.getProfiles().add(profile);

        // Step 3: Use Search Service (Singleton)
        SearchService searchService = SearchService.getInstance();
        List<Content> searchResults = searchService.searchByTitle("Inception", allContents);

        System.out.println("Search Results for 'Inception': ");
        searchResults.forEach(content -> System.out.println(content.getTitle()));

        // Step 4: Add content to the watchlist
        profile.getWatchlist().addContent(searchResults.get(0));

        System.out.println("\nWatchlist: ");
        profile.getWatchlist().getContentList().forEach(content -> System.out.println(content.getTitle()));

        // Step 5: Play a movie using StreamingService (Adapter Pattern)
        StreamingService streamingService = new NetflixStreamingService();
        streamingService.play("1");

        // Step 6: Recommendations using Strategy Pattern
        RecommendationService recommendationService = new RecommendationService();
        recommendationService.setRecommendationStrategy(new WatchHistoryBasedRecommendationStrategy());

        List<Content> recommendations = recommendationService.getRecommendations(profile);
        System.out.println("\nRecommended Content: ");
        recommendations.forEach(content -> System.out.println(content.getTitle()));
    }
}
