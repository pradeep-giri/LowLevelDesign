package LLDDesign.Netflix.Strategy;

import LLDDesign.Netflix.Content;
import LLDDesign.Netflix.MockData;
import LLDDesign.Netflix.Profile;

import java.util.List;
import java.util.stream.Collectors;

public class WatchHistoryBasedRecommendationStrategy implements RecommendationStrategy {
    @Override
    public List<Content> recommend(Profile profile) {
        // Here we return recommendations based on watch history
        List<String> watchHistory = profile.getWatchHistory();

        // Mock logic to recommend content based on previous history
        return MockData.getAllContents().stream()
                .filter(content -> !watchHistory.contains(content.getTitle()))
                .collect(Collectors.toList());
    }
}
