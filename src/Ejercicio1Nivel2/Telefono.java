package Ejercicio1Nivel2;
public class Telefono {
    private String marca;
    private String modelo;

    public String llamar(String numero){
        String numeroTelefono = numero;
        return "En estos momentos se esta llamado al numero " + numeroTelefono;
    }
}
