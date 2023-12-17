/*
 * @Silvia martinez
 */
public class Persona {

    private String Nombre ;
    private int Edad;

    public Persona (String nombre, int edad){
        this.Nombre = Nombre;
        this.Edad = Edad;

    }
    public String getNombre(){
        return this.Nombre;
    }
    public int getEdad() {
        return Edad;

    }
    public void mostrarDatos(){
        System.out.println("Nombre:"+ Nombre);
    }
}
