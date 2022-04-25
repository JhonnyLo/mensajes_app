/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensaje_app;

import java.sql.Connection;

/**
 *
 * @author IP Total
 */
public class Inicio
{
    
    public static void main(String[] args)
    {
        Connector conexion = new Connector();
        
        try(Connection cnx = conexion.get_Connection())
        {
            
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
