package LLDDesign.PubSub;

import java.util.HashSet;
import java.util.Set;

public class Publisher {
    private final Set<Topic> topics;

    public Publisher() {
        this.topics = new HashSet<>();
    }

    public void addTopic(Topic topic) {
        this.topics.add(topic);
    }

    public void publish(Topic topic, Message message) {
        if(!topics.contains(topic)) {
            System.out.println("Not in this topic");
            return;
        }
        topic.publish(message);
    }
}
