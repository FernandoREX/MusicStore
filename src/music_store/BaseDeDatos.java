package music_store;

import java.net.URISyntaxException;

/**
 *
 * @author REX
 */
public class BaseDeDatos {
    
    //-----------Gerente----------------------------
    Trabajador Ger = new Trabajador(true, true, true, true, "z", "z", 9000, "Fernando Rosas Gomez", 20, true);
    //-----------Vendedor---------------------------
    Trabajador Ven1 = new Trabajador(true, false, true, true, "123con", "Aven198", 7000, "Pocoyo Rodriguez Perez", 18, true);
    Trabajador Ven2 = new Trabajador(true, false, true, true, "123vos", "Aven198", 7000, "Jose Peralta Roa", 19, true);
    //-----------Acomodador-------------------------
    Trabajador Aco = new Trabajador(true, false, false, true, "123ger", "Bac1o89", 4000, "Solovino Rodriguez Peralta", 15, true);    
    //-----------Base de Datos----------------------
    
    String []ListasID = new String[5];
    String []ListasContraseña = new String[5];
    String []ListasNombre = new String[5];
    
    public String[] BaseDatosId()
    {
        ListasID[0] = Ger.ID;
        ListasID[1] = Ven1.ID;
        ListasID[2] = Ven2.ID;
        ListasID[3] = Aco.ID;
        
        return ListasID;
    }
    
    public String[] BaseDatosNombre()
    {
        ListasNombre[0] = Ger.Nombre;
        ListasNombre[1] = Ven1.Nombre;
        ListasNombre[2] = Ven2.Nombre;
        ListasNombre[3] = Aco.Nombre;
        
        return ListasNombre;
    }
    
    public String[] BaseDatosContraseña()
    {
        ListasContraseña[0] = Ger.Contraseña;
        ListasContraseña[1] = Ven1.Contraseña;
        ListasContraseña[2] = Ven2.Contraseña;
        ListasContraseña[3] = Aco.Contraseña;
        
        
        return ListasContraseña;
    }
    //-----------Inicio de Secion----------------------
    public void InicioSecion(String ID, String Contra) throws URISyntaxException
    {
        int BoM = 0;
        String Contr = null, id = null, ir = null, Nombre = null;
        System.out.print("==========================\n");
        System.out.print("Analizando datos...\n");
        
        BaseDeDatos a = new BaseDeDatos();
        Menu P = new Menu();
        ListasContraseña = a.BaseDatosContraseña();
        ListasID = a.BaseDatosId();
        ListasNombre= a.BaseDatosNombre();
        
        for(int i = 0; i < 5; i++)
        {
            id = ListasID[i];
            Contr = ListasContraseña[i];
            
            if(ID.equals(id))
            {
                if(Contra.equals(Contr))
                {
                    Nombre = ListasNombre[i];
                    ir = ListasID[i];
                    
                    System.out.print("==========================\n");
                    System.out.print("Datos Correctos\n");
                    System.out.print("Iniciando...\n");
                    P.MENU(ir, Nombre);
                    break;
                }
            }
        }
       
    }
}
