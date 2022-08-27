/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music_store;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;


/**
 *
 * @author REX
 */
public class CajaRegistradora {
    //Productos----------Base de Datos---------------------
    Productos A1 = new Productos("ARTX134", "Audifonos", 1500, 1110, "Sony", 6);
    Productos A2 = new Productos("REYluz12", "Audifonos", 1000, 1100, "Sony", 9);
    Productos A3 = new Productos("lunex9A", "Audifonos", 2500, 1000, "Sony", 3);
    
    Productos D1 = new Productos("AMERICAN IDIOT", "DiscoMusica", 200, 220, "Reprise records", 10);
    Productos D2 = new Productos("DOOKIE", "DiscoMusica", 300, 200, "Reprise records", 17);
    Productos D3 = new Productos("21st CENTURY BRAKDOWN", "DiscoMusica", 245, 2000, "Reprise records", 12);
    
    Productos DV1 = new Productos("DARK HORSE", "DiscoVideo", 400, 3330, "VEVO", 10);
    Productos DV2 = new Productos("HOT N COLD", "DiscoVideo", 200, 3300, "VEVO ", 17);
    Productos DV3 = new Productos("I KISSED A GIRL", "DiscoVideo", 645, 3000, "VEVO", 12);
    
    
    Productos []ListaP = new Productos[10];
    KeyboardInput in = new KeyboardInput();
    File archivo = new File("ticket.txt");
    
    
    public Productos[] LlenarL()
    {
        ListaP[0] = A1;
        ListaP[1] = A2;
        ListaP[2] = A3;
        ListaP[3] = D1;
        ListaP[4] = D2;
        ListaP[5] = D3;
        ListaP[6] = DV1;
        ListaP[7] = DV2;
        ListaP[8] = DV3;
        
        return ListaP;
        
    }
    
    public void LlenarT()
    {
        java.util.Date fecha = new Date();
        Random r = new Random();
        int valorDado = r.nextInt(999999999)+100000000;
        int Caj = r.nextInt(2)+1;
        try {
            
            archivo.createNewFile();
        } catch (IOException ex) {}
        
        try {
            PrintWriter esc = new PrintWriter("ticket.txt", "utf-8");
            esc.println("       Music Store\n");
            esc.println("==========================\n");
            esc.println("   Resivo No. "+ valorDado + "\n" );
            esc.println("       Caja No. "+ Caj + "\n" );
            esc.println("==========================\n");
            esc.println(fecha + "\n");
            esc.println(" Recuerda Usar Cubrebocas\n");
            
            esc.close();
        } catch (Exception e) {e.printStackTrace();}
        
    }
    
    public void Caja(String Nombre)
    {
        CajaRegistradora a = new CajaRegistradora();
        Productos []listap = new Productos[10];
        Productos Aux = new Productos();
        listap = a.LlenarL();
        a.LlenarT();
        try {
            FileWriter fw = new FileWriter("ticket.txt", true);
            fw.write("Atendido por: " + Nombre + "\n");
            fw.write("==========================\n");
            fw.close();
        } catch (Exception e) {}
        
        int i = 0, cont = 0;
        while(i != 2)
        {
            System.out.print("==========================\n");
            System.out.print("Ingresa el ID del producto: \n");
            System.out.print("=>");
            int ID = in.readInteger();
            for(int x = 0; x<10; x++)
            {
                Aux = listap[x];
                try {
                    if(Aux.getCodigoBarra() == ID)
                    {
                        FileWriter fw = new FileWriter("ticket.txt", true);
                        fw.write("==========================\n");
                        fw.write(Aux.getTipo()+" "+Aux.getNombre() + "...." + "$ "+Aux.getPrecio() + "\n");
                        fw.write("==========================\n");
                        fw.close();
                        cont = cont + Aux.getPrecio();                    
                    }
                    
                } catch (Exception e) {}
            }
            System.out.print("==========================\n");
            System.out.print("Deseas Ingresar otro producto?\n");
            System.out.print("[1] SI\n");
            System.out.print("[2] NO\n");
            System.out.print("=>");
            int q = in.readInteger();
            if(q == 2)
            {
                i = 2;
                try {
                    FileWriter fw = new FileWriter("ticket.txt", true);
                    fw.write("==========================\n");
                    fw.write("Total: ...." + "$ "+ cont + "\n");
                    fw.write("==========================\n");
                    fw.write("  Gracias por su compra\n");
                    fw.write("   Regrese pronto\n");
                    fw.close();
                } catch (Exception e) {
                }
            }
            
        }
        
        
    }
    
}
