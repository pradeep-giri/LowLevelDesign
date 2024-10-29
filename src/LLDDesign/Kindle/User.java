//package LLDDesign.Kindle;
//
//public class User {
//    private String userId;
//    private String email;
//    private Library library;
//    private SyncService syncService;
//
//    User(String userId, String email) {
//        this.userId = userId;
//        this.email = email;
//        this.library = new Library();
//        this.syncService = new SyncService();
//    }
//
//    public Library getLibrary() {
//        return library;
//    }
//
//    public void syncReadingProgress(Book book, int page) {
//        syncService.syncProgress(book, page);
//    }
//}
