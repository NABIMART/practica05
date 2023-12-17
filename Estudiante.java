/*
 * @Silvia martinez
 */
public class Estudiante extends Persona {
    
    private int creditos;
    public Estudiante (String Nombre, int Edad){
        super(Nombre, Edad);
        this.creditos = 60;

    }
    public int getCreditos(){
        return this.creditos;

    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println( "Estrudiante  Matriculado" + creditos + "Creditos");
    }
}
