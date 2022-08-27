package music_store;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author REX
 */
public class MaquinaVideo {
    
    File archivo = new File("Videos.txt");
    File archivoN = new File("VideosNombre.txt");
    KeyboardInput in = new KeyboardInput();
    String []links = new String[100];
    String []Nombres = new String[100];
    
    public void CrearBD()
    {
        try {
            archivo.createNewFile();
            archivoN.createNewFile();
        } catch (IOException ex) {}
      
    }
    
    public void LLenarBD()
    {
        int r = 0;
        MaquinaVideo a = new MaquinaVideo();
        a.CrearBD();
        while(r != 100)
        {
            System.out.print("==========================\n");
            System.out.print("Ingresa el LINK del video musical: \n");
            System.out.print("=>");
            String link = in.readString();
            System.out.print("==========================\n");
            System.out.print("Ingresa el NOMBRE del video musical: \n");
            System.out.print("=>");
            String Nombre = in.readString();
        
            try{
                FileWriter fw = new FileWriter("Videos.txt", true);
                PrintWriter esc = new PrintWriter(fw);
                FileWriter fwN = new FileWriter("VideosNombre.txt", true);
                PrintWriter escN = new PrintWriter(fwN);
                
                escN.println(Nombre);
                esc.println(link );
                System.out.print("Video ingresado de forma correcta \n");
                esc.close();
                fw.close();
                escN.close();
                fwN.close();
            
            }catch(Exception e) {}
            
            System.out.print("==========================\n");
            System.out.print("Ingresar nueva cancion? \n");
            System.out.print("[1] SI\n");
            System.out.print("[2] NO\n");
            System.out.print("=>");
            int res = in.readInteger();
            if(res == 2)
            {
                r = 100;
            }
        } 
    }
    
    public void Leer()
    {
        String direccion1 = "C:\\Users\\DIANA\\OneDrive\\Documentos\\NetBeansProjects\\Music_Store\\Videos.txt";
        String direccion2 = "C:\\Users\\DIANA\\OneDrive\\Documentos\\NetBeansProjects\\Music_Store\\VideosNombre.txt";
        
        int i = 0;
        try
        {
            BufferedReader bf = new BufferedReader(new FileReader(direccion1));
            BufferedReader bfn = new BufferedReader(new FileReader(direccion2));
            String temp = "", tempr = "";
            String BFread , bfred;
            
            while((BFread = bf.readLine()) != null )
            {
                temp = BFread;
                links[i] = temp;
                i++;
            }
            i = 0;
            while((bfred = bfn.readLine()) != null )
            {
                tempr = bfred;
                Nombres[i] = tempr;
                i++;
            }
            
        }catch(Exception e){}
        
        
        if(links[0] == null && Nombres[0] == null)
        {
            System.out.print("Lista de videos vacias\n");
        }
        
    }
    
    public void REPRODUCIR_MUSICA() throws URISyntaxException
    {
        int y;
        MaquinaVideo a = new MaquinaVideo();
        a.Leer();
        System.out.print("========================================\n");
        System.out.print("          Lista de canciones\n");
        System.out.print("========================================\n");
        
        for(y = 0; y<51; y++)
        {
            System.out.print("Numero de ID " + y + ": " + Nombres[y]+"\n");
        }
        System.out.print("========================================\n");
        System.out.print("Seleccionde el ID para Reproducir\n");
        System.out.print("=>");
        int res = in.readInteger();
        
        if (Desktop.isDesktopSupported())
        {
            Desktop desktop = Desktop.getDesktop();
            try {
                URI uri = new URI(links[res]);
                desktop.browse(uri);
            } catch (IOException e){}
        }
        System.out.print("El video " + Nombres[res] + " se esta reproduciendo en la pantalla principal\n");
        
        System.out.print("==========================================================\n");
        System.out.print("Seleccionde el ID para Reproducir en pantallas secundarias\n");
        System.out.print("=>");
        int resf = in.readInteger();
        System.out.print("El video " + Nombres[resf] + " se esta reproduciendo en una pantalla secundaria\n");
        System.out.print("==========================================================\n");
        System.out.print("Seleccionde el ID para Reproducir en pantallas secundarias\n");
        System.out.print("=>");
        int resfd = in.readInteger();
        System.out.print("El video " + Nombres[resfd] + " se esta reproduciendo en una pantalla secundaria\n");
    }
    
}
