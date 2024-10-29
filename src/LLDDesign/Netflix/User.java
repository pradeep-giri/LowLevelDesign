package LLDDesign.Netflix;

import java.util.List;

public class User {
    private String userId;
    private String email;
    private List<Profile> profiles;

    public User(String userId, String email, List<Profile> profiles) {
        this.userId = userId;
        this.email = email;
        this.profiles = profiles;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }
}
