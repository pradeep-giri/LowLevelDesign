package DesignPatterns.CreationalPatterns.Singleton;

public class StaticBlock {

    private static StaticBlock instance;

    private StaticBlock(){}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlock getInstance() {
        return instance;
    }
}
