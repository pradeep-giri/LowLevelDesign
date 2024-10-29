package LLDDesign.PubSub;

public class SubscriberImpl implements Subscriber {
    private final String name;

    SubscriberImpl(String name) {
        this.name = name;
    }

    @Override
    public void onMessage(Message message) {
        System.out.println(this.name + ": " + message.getContent());
    }
}
