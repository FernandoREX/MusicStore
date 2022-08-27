
package music_store;

/**
 *
 * @author REX
 */
public class Productos {
    String Nombre;
    String tipo;
    int Precio;
    int CodigoBarra;
    String marca;
    int cantidad;

    public Productos() {
    }

    public Productos(String Nombre, String tipo, int Precio, int CodigoBarra, String marca, int cantidad) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.Precio = Precio;
        this.CodigoBarra = CodigoBarra;
        this.marca = marca;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCodigoBarra() {
        return CodigoBarra;
    }

    public void setCodigoBarra(int CodigoBarra) {
        this.CodigoBarra = CodigoBarra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    
}
