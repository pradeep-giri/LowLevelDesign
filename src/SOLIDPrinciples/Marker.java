package SOLIDPrinciples;

class Marker {
    private final String name;
    private final String color;
    private final int year;
    private final int price;

    Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
