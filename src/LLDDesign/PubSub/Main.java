package LLDDesign.PubSub;

public class Main {
    public static void main(String[] args) {
        // Create topics
        Topic topic1 = new Topic("Topic1");
        Topic topic2 = new Topic("Topic2");

        // Create publishers
        Publisher publisher1 = new Publisher();
        Publisher publisher2 = new Publisher();

        // Create subscribers
        Subscriber subscriber1 = new SubscriberImpl("Subscriber1");
        Subscriber subscriber2 = new SubscriberImpl("Subscriber2");
        Subscriber subscriber3 = new SubscriberImpl("Subscriber3");

        publisher1.addTopic(topic1);
        publisher2.addTopic(topic2);

        // Subscribe to topics
        topic1.addSubscriber(subscriber1);
        topic1.addSubscriber(subscriber2);
        topic2.addSubscriber(subscriber2);
        topic2.addSubscriber(subscriber3);

        // Publish messages
        publisher1.publish(topic1, new Message("Message1 for Topic1"));
        publisher1.publish(topic1, new Message("Message2 for Topic1"));
        publisher2.publish(topic2, new Message("Message1 for Topic2"));
    }
}
