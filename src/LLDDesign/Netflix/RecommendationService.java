package LLDDesign.Netflix;

import LLDDesign.Netflix.Strategy.RecommendationStrategy;

import java.util.List;

public class RecommendationService {
    private RecommendationStrategy recommendationStrategy;

    // Setter Injection
    public void setRecommendationStrategy(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    public List<Content> getRecommendations(Profile profile) {
        return recommendationStrategy.recommend(profile);
    }
}
