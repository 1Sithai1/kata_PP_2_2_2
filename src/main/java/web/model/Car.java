package web.model;

public class Car {

    private String model;
    private String color;
    private int serial;

    public Car() {
    }

    public Car(String model, String color, int serial) {
        this.model = model;
        this.color = color;
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return model +
                ", color: " + color +
                ", serial: " + serial;
    }
}
