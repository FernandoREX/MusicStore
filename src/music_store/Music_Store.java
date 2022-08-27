
package music_store;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author REX
 */
public class Music_Store {

    /**
     * 
     * @param args
     * @throws URISyntaxException
     */
    public static void main(String[] args) throws URISyntaxException 
    {
        
        KeyboardInput in = new KeyboardInput();
        BaseDeDatos d = new BaseDeDatos();
        System.out.print("==========================\n");
        System.out.print(" Bienvenido a Music Store \n");
        System.out.print("==========================\n");
        System.out.print("Ingresa tu ID:\n ");
        System.out.print("=>");
        String ID = in.readString();
        System.out.print("==========================\n");
        System.out.print("Ingresa tu Contraseña:\n ");
        System.out.print("=>");
        String Contraseña = in.readString();   
        
        d.InicioSecion(ID, Contraseña);
        
        
        
    }   
    
}
