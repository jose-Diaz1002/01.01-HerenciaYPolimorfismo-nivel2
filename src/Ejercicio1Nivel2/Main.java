package Ejercicio1Nivel2;
public class Main {
    public static void main(String[] args) {
        Phone call1 = new Phone();
        System.out.println(call1.call("\n6349593002"));
        Smartphone smartphone1 = new Smartphone();
        System.out.println(smartphone1.alarm());
        System.out.println(smartphone1.takePhoto());
    }
}
