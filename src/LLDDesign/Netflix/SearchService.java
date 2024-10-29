package LLDDesign.Netflix;

import java.util.List;
import java.util.stream.Collectors;

public class SearchService {

    private SearchService() {}

    private static class SearchServiceHolder {
        private static final SearchService INSTANCE = new SearchService();
    }

    public static SearchService getInstance() {
        return SearchServiceHolder.INSTANCE;
    }

    // Search by title
    public List<Content> searchByTitle(String title, List<Content> allContents) {
        return allContents.stream()
                .filter(content -> content.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Search by genre
    public List<Content> searchByGenre(Genre genre, List<Content> allContents) {
        return allContents.stream()
                .filter(content -> content.getGenre().equals(genre))
                .collect(Collectors.toList());
    }
}
