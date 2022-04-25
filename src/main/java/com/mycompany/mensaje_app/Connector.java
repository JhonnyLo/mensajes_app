/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensaje_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author IP Total
 */
public class Connector
{
    public Connection get_Connection()
    {
        Connection conection = null;
        try
        {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","toor");
            
            if(conection != null)
            {
                System.out.println("Conexion exitosa");
            }
        }
        catch(SQLException e)
        {
                 System.out.println(e);
        }
        return conection;
    }
}
