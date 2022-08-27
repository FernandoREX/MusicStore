package music_store;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


/**
 *
 * @author REX
 */
public class Catalogo {
    
    public void Catalogo() throws URISyntaxException {
        if (Desktop.isDesktopSupported())
        {
            Desktop desktop = Desktop.getDesktop();
            try {
                URI uri = new URI("http://flipsnack.com/FerREX/catalogomusicstore.html");
                desktop.browse(uri);
            } catch (IOException e){}
    
 
        }
        System.out.print("Codigo de acceso a la bodega:\n");
        System.out.print("-------143424523-------\n");
    }
}
