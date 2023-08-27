package LapTop;
//1. Код для реализации класса Ноутбук в Java:
public class laptop {
    private String brand;
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;
    private double price;

    public laptop(String string, String string2, int i, int j, String string3, String string4, double d) {
    }

    public void Laptop(String brand, String model, int ram, int storage, String os, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }



// Здесь мы создаем класс Laptop со следующими полями: brand, model, ram, storage, os, color, price. 
// Также мы создаем конструктор и методы-геттеры для каждого поля, а также переопределяем метод `toString()`.




}