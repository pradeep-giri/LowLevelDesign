package DesignPatterns.CreationalPatterns.Singleton;

public class BillPugh {
    private BillPugh() {}

    private static class BillPughHolder {
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance() {
        return BillPughHolder.INSTANCE;
    }
}
