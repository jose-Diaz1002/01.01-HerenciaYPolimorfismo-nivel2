package Ejercicio1Nivel2;
public class Phone {
    private String brand;
    private String model;

    public String call(String number) {
        String phoneNumber = number;
        return "Currently calling the number " + phoneNumber;
    }
}
