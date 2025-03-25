package Ejercicio1Nivel2.clases;

import Ejercicio1Nivel2.interficies.Camera;
import Ejercicio1Nivel2.interficies.Clock;

public class Smartphone extends Phone implements Clock, Camera {

    public Smartphone(String brand, String model ) {
        super(brand, model);
    }

    public String alarm() {
        return "The alarm is ringing";
    }

    public String takePhoto() {
        return "A photo is being taken";
    }

    @Override
    public String toString() {
        return "\nSmartphone" +" de marca: "+ getBrand() + ", modelo: " + getModel();
    }
}
