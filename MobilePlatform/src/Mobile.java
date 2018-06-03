
import java.util.List;

public class Mobile {
    private String id;
    private String name;
    private double price;
    private String OS;
    private double screenSize;
    private double discount;
    private List<String> color;
    private String brand;
    private int RAM;
    private int storage;
    private int battery;
    private Camera camera;
    private int weight;
    private boolean dualSim;
    private Dimension dimension;

    public Mobile(String id, String name, double price, String OS, double screenSize, double discount, List<String> color,
                  String brand, int RAM, int storage, int battery, Camera camera, int weight, boolean dualSim, Dimension dimension) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.OS = OS;
        this.screenSize = screenSize;
        this.discount = discount;
        this.color = color;
        this.brand = brand;
        this.RAM = RAM;
        this.storage = storage;
        this.battery = battery;
        this.camera = camera;
        this.weight = weight;
        this.dualSim = dualSim;
        this.dimension = dimension;
    }

    public String getBrand() {
        return brand;
    }

    public Camera getCamera() {
        return camera;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public double getPrice() {

        return price;
    }

    public String getOS() {

        return OS;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", OS='" + OS + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
