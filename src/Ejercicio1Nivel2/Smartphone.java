package Ejercicio1Nivel2;
public class Smartphone extends Telefono implements Reloj,Camara{
    public String alarma() {
        return "Está sonando la alarma";
    }
    public String fotografiar() {
        return "Se está haciendo una foto";
    }
}
