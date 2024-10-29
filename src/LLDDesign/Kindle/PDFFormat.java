package LLDDesign.Kindle;

public class PDFFormat implements BookFormat {

    @Override
    public void render() {
        System.out.println("Rendering PDF format");
    }
}
