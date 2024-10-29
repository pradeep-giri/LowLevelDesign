package LLDDesign.Netflix.Strategy;

import LLDDesign.Netflix.Content;
import LLDDesign.Netflix.Profile;

import java.util.List;

public interface RecommendationStrategy {
    List<Content> recommend(Profile profile);
}
