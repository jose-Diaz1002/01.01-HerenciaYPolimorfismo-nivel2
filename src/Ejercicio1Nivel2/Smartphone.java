package Ejercicio1Nivel2;
public class Smartphone extends Phone implements Clock, Camera {
    public String alarm() {
        return "The alarm is ringing";
    }

    public String takePhoto() {
        return "A photo is being taken";
    }
}
