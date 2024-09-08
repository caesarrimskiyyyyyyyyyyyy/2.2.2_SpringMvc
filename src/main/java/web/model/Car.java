package web.model;

public class Car {
    private String name;
    private String numbersOfCylinders;
    private int horsePower;

    public Car() {
    }

    public Car(String name, String numbersOfCylinders, int horsePower) {
        this.name = name;
        this.numbersOfCylinders = numbersOfCylinders;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return numbersOfCylinders;
    }

    public void setEngine(String engine) {
        this.numbersOfCylinders = engine;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
