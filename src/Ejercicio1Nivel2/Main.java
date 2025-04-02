package Ejercicio1Nivel2;

import Ejercicio1Nivel2.clases.Smartphone;

public class Main {
    public static void main(String[] args) {
        // Phone call1 = new Phone();
        //System.out.println(call1.call("\n6349593002"));
        Smartphone smartphone1 = new Smartphone("Samsung", "a55");
        System.out.println(smartphone1.toString());
        System.out.println(smartphone1.call("123456"));
        System.out.println(smartphone1.alarm());
        System.out.println(smartphone1.takePhoto());
    }
}
