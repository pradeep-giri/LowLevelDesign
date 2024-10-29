package LLDDesign.Netflix.Adapter;

public class NetflixStreamingService implements StreamingService {

    @Override
    public void play(String contentId) {
        System.out.println("Playing content with ID: " + contentId);
        // Logic for video streaming
    }

    @Override
    public void pause(String contentId) {
        System.out.println("Pausing content with ID: " + contentId);
        // Logic for pausing the video
    }

    @Override
    public void resume(String contentId) {
        System.out.println("Resuming content with ID: " + contentId);
        // Logic for resuming the video
    }
}
