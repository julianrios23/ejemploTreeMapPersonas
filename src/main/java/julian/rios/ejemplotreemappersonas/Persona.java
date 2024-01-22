

package julian.rios.ejemplotreemappersonas;


public class Persona  implements Comparable<Persona>{
     private String dni;
    private String nombre;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return this.dni.compareTo(otraPersona.getDni());
    }

}
