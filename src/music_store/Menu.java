package music_store;

import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author REX
 */
public class Menu {
    
    public void MENU(String ID, String Nombre) throws URISyntaxException
    {
        KeyboardInput in = new KeyboardInput();
        if(ID == "z")
        {
            System.out.print("==========================\n");
            System.out.print("Bienvenido "+ Nombre + "\n");
            System.out.print("Funcion: Gerente\n");
            System.out.print("==========================\n");
            int OB = 0;
            while(OB != 4)
            {
                System.out.print("Funciones Disponibles:\n");
                System.out.print("[1] Caja Registradora\n");
                System.out.print("[2] Sistema de Entretenimiento\n");
                System.out.print("[3] Catalogo\n");
                System.out.print("[4] Salir\n");
                System.out.print("Selecciones una obcion oprimiendo la tecla que contega el numero de la obcion\n");
                System.out.print("=>");
                OB = in.readInteger();
                if(OB == 1)
                {
                    CajaRegistradora m = new CajaRegistradora();
                    m.Caja(Nombre);
                }
                if(OB == 3)
                {
                
                    Catalogo m = new Catalogo();
                    try {
                        m.Catalogo();
                    } catch (URISyntaxException ex) {
                        Logger.getLogger(Music_Store.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(OB == 2)
                {
                    MaquinaVideo a = new MaquinaVideo();
                    MaquinaMusica aa = new MaquinaMusica();
                    System.out.print("==========================\n");
                    System.out.print("Selecciona una obcion\n");
                    System.out.print("[1] MAQUINA DE MUSICA\n");
                    System.out.print("[2] MAQUINA DE VIDEO\n");
                    System.out.print("=>");
                    int mac = in.readInteger();
                    if(mac == 1)
                    {
                        System.out.print("==========================\n");
                        System.out.print("Selecciona una obcion\n");
                        System.out.print("==========================\n");
                        System.out.print("Necesita cuenta en Spotify\n");
                        System.out.print("==========================\n");
                        System.out.print("[1] Reproducir\n");
                        System.out.print("[2] Agregar video nuevo\n");
                        System.out.print("=>");
                        int res = in.readInteger();
                        if(res == 1)
                        {
                            aa.Leer();
                            aa.REPRODUCIR_MUSICA();
                        }
                        if(res == 2)
                        {
                            aa.LLenarBD();
                        }
                    }
                    if(mac == 2)
                    {
                        System.out.print("==========================\n");
                        System.out.print("Selecciona una obcion\n");
                        System.out.print("[1] Reproducir\n");
                        System.out.print("[2] Agregar video nuevo\n");
                        System.out.print("=>");
                        int res = in.readInteger();
                        if(res == 1)
                        {
                            a.Leer();
                            a.REPRODUCIR_MUSICA();
                        }
                        if(res == 2)
                        {
                            a.LLenarBD();
                        }
                    
                    }
                }
            }
            
            
        }
        if(ID == "Aven198")
        {
            System.out.print("==========================\n");
            System.out.print("Bienvenido "+ Nombre + "\n");
            System.out.print("Funcion: Vendedor\n");
            System.out.print("==========================\n");
            System.out.print("Funciones Disponibles:\n");
            System.out.print("[1] Caja Registradora\n");
            System.out.print("[2] Sistema de Entretenimiento\n");
            System.out.print("[3] Catalogo\n");
            System.out.print("Selecciones una obcion oprimiendo la tecla que contega el numero de la obcion\n");
            System.out.print("=>");
            int OB = in.readInteger();
            
            if(OB == 1)
            {
                CajaRegistradora m = new CajaRegistradora();
                m.Caja(Nombre);
            }
            if(OB == 3)
            {
                //link flipsnack.com/FerREX/catalogomusicstore.html
                Catalogo m = new Catalogo();
                try {
                    m.Catalogo();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Music_Store.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(OB == 2)
            {
                MaquinaVideo a = new MaquinaVideo();
                MaquinaMusica aa = new MaquinaMusica();
                System.out.print("==========================\n");
                System.out.print("Selecciona una obcion\n");
                System.out.print("[1] MAQUINA DE MUSICA\n");
                System.out.print("[2] MAQUINA DE VIDEO\n");
                System.out.print("=>");
                int mac = in.readInteger();
                if(mac == 1)
                {
                    System.out.print("==========================\n");
                    System.out.print("Selecciona una obcion\n");
                    System.out.print("==========================\n");
                    System.out.print("Necesita cuenta en Spotify\n");
                    System.out.print("==========================\n");
                    System.out.print("[1] Reproducir\n");
                    System.out.print("[2] Agregar video nuevo\n");
                    System.out.print("=>");
                    int res = in.readInteger();
                    if(res == 1)
                    {
                        aa.Leer();
                        aa.REPRODUCIR_MUSICA();
                    }
                    if(res == 2)
                    {
                        aa.LLenarBD();
                    }
                }
                if(mac == 2)
                {
                    System.out.print("==========================\n");
                    System.out.print("Selecciona una obcion\n");
                    System.out.print("[1] Reproducir\n");
                    System.out.print("[2] Agregar video nuevo\n");
                    System.out.print("=>");
                    int res = in.readInteger();
                    if(res == 1)
                    {
                        a.Leer();
                        a.REPRODUCIR_MUSICA();
                    }
                    if(res == 2)
                    {
                        a.LLenarBD();
                    }
                    
                }
            }
            
            
            
        }
        if(ID == "Bac1o89")
        {
            System.out.print("==========================\n");
            System.out.print("Bienvenido "+ Nombre + "\n");
            System.out.print("Funcion: Acomodador\n");
            System.out.print("==========================\n");
            System.out.print("Funciones Disponibles:\n");
            System.out.print("[1] Catalogo\n");
            System.out.print("Selecciones una obcion oprimiendo la tecla que contega el numero de la obcion\n");
            System.out.print("=>");
            int OB = in.readInteger();
            
            if(OB == 1)
            {
                //link flipsnack.com/FerREX/catalogomusicstore.html
                Catalogo m = new Catalogo();
                try {
                    m.Catalogo();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(Music_Store.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }
    
}
