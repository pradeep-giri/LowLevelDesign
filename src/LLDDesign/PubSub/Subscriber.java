package LLDDesign.PubSub;

// The Subscriber interface defines the contract for subscribers. It declares the onMessage method that is invoked when a subscriber receives a message.
public interface Subscriber {
    void onMessage(Message message);
}
