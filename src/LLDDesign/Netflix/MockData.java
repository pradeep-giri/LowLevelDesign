package LLDDesign.Netflix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockData {
    public static List<Content> getAllContents() {
        List<Content> contents = new ArrayList<>();

        contents.add(new Content("1", "Inception", Genre.SCI_FI, Arrays.asList("Leonardo DiCaprio"), 148, "inception.com"));
        contents.add(new Content("2", "The Matrix", Genre.SCI_FI, Arrays.asList("Keanu Reeves"), 136, "matrix.com"));
        contents.add(new Content("3", "The Godfather", Genre.DRAMA, Arrays.asList("Al Pacino"), 175, "godfather.com"));
        contents.add(new Content("4", "The Dark Knight", Genre.ACTION, Arrays.asList("Christian Bale"), 152, "darkknight.com"));
        contents.add(new Content("5", "The Big Lebowski", Genre.COMEDY, Arrays.asList("Jeff Bridges"), 117, "biglebowski.com"));

        return contents;
    }
}
