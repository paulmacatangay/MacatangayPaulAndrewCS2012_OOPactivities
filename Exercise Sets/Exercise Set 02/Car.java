public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }

    @Override
    public String toString() {
        String sizeDesc;
        switch (size) {
            case 'S':
                sizeDesc = "small";
                break;
            case 'M':
                sizeDesc = "medium";
                break;
            case 'L':
                sizeDesc = "large";
                break;
            default:
                sizeDesc = "";
                break;
        }
        return String.format("Car (%s) - P(%.2f) - (%s)", color, price, sizeDesc);
    }
}