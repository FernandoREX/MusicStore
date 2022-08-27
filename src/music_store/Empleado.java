
package music_store;

/**
 *
 * @author REX
 */
public class Empleado {
    String Contraseña;
    String ID;
    private int Sueldo;
    
    String Nombre;
    int Edad;
    boolean Documentacion;

    public Empleado() {
    }

    public Empleado(String Contraseña, String ID, int Sueldo, String Nombre, int Edad, boolean Documentacion) {
        this.Contraseña = Contraseña;
        this.ID = ID;
        this.Sueldo = Sueldo;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Documentacion = Documentacion;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean isDocumentacion() {
        return Documentacion;
    }

    public void setDocumentacion(boolean Documentacion) {
        this.Documentacion = Documentacion;
    }

    
    
    
}
