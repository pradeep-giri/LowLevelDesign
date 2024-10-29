package LLDDesign.Netflix.Strategy;

import LLDDesign.Netflix.Content;
import LLDDesign.Netflix.Profile;

import java.util.ArrayList;
import java.util.List;

public class RatingBasedRecommendationStrategy implements RecommendationStrategy {
    @Override
    public List<Content> recommend(Profile profile) {
        return new ArrayList<>();
    }
}
