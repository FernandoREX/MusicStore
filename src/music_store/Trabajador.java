/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music_store;

/**
 *
 * @author REX
 */
public class Trabajador extends Empleado{
    
    //------------Privilegios---------------
    boolean Entretenimiento, contratar, cajaRegistradora, catalogo;

    public Trabajador() {
    }

    public Trabajador(boolean Entretenimiento, boolean contratar, boolean cajaRegistradora, boolean catalogo) {
        this.Entretenimiento = Entretenimiento;
        this.contratar = contratar;
        this.cajaRegistradora = cajaRegistradora;
        this.catalogo = catalogo;
    }

    public Trabajador(boolean Entretenimiento, boolean contratar, boolean cajaRegistradora, boolean catalogo, String Contraseña, String ID, int Sueldo, String Nombre, int Edad, boolean Documentacion) {
        super(Contraseña, ID, Sueldo, Nombre, Edad, Documentacion);
        this.Entretenimiento = Entretenimiento;
        this.contratar = contratar;
        this.cajaRegistradora = cajaRegistradora;
        this.catalogo = catalogo;
    }

    public boolean isEntretenimiento() {
        return Entretenimiento;
    }

    public void setEntretenimiento(boolean Entretenimiento) {
        this.Entretenimiento = Entretenimiento;
    }

    public boolean isContratar() {
        return contratar;
    }

    public void setContratar(boolean contratar) {
        this.contratar = contratar;
    }

    public boolean isCajaRegistradora() {
        return cajaRegistradora;
    }

    public void setCajaRegistradora(boolean cajaRegistradora) {
        this.cajaRegistradora = cajaRegistradora;
    }

    public boolean isCatalogo() {
        return catalogo;
    }

    public void setCatalogo(boolean catalogo) {
        this.catalogo = catalogo;
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
