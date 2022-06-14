package Exercise_006;

public class Vehicle {
    private final String type;
    private final String model;
    private final String color;
    private final int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" + "Model: %s\n" + "Color: %s\n" + "Horsepower: %d\n" + "",
                             type, model, color, horsepower);
    }

}
