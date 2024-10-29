package LLDDesign.Netflix.Adapter;

public interface StreamingService {
    void play(String contentId);
    void pause(String contentId);
    void resume(String contentId);
}
