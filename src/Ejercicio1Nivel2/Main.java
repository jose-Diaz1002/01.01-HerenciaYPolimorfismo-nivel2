package Ejercicio1Nivel2;
public class Main {
    public static void main(String[] args) {
        Telefono llamada1 = new Telefono();
        System.out.println(llamada1.llamar("6349593002"));
        Smartphone smartphone1 = new Smartphone();
        System.out.println(smartphone1.alarma());
        System.out.println(smartphone1.fotografiar());
    }
}
