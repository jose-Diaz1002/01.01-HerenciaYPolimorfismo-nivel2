package Ejercicio1Nivel2.clases;
public class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String call(String number) {
        String phoneNumber = number;
        return "Currently calling the number " + phoneNumber;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
