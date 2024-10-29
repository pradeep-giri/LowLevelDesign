package LLDDesign.Netflix;

import java.util.ArrayList;
import java.util.List;

public class WatchList {
    private List<Content> contentList;

    public WatchList() {
        this.contentList = new ArrayList<Content>();
    }

    public void addContent(Content content) {
        contentList.add(content);
    }

    public void removeContent(Content content) {
        contentList.remove(content);
    }

    public List<Content> getContentList() {
        return contentList;
    }
}
