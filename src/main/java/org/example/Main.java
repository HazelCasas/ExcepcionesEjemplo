package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        LeerArchivo lectura = new LeerArchivo();
        try
        {
            lectura.metodoUno("Datos.txt");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}