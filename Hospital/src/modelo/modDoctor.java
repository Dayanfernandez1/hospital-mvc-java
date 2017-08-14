/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Tankayan
 */
public class modDoctor {
    // Crear variable de tipo conexion (osea la clase que esta creada dentro de este paquete)

    conexion conx;

    // Crear constructor para ejecutar automaticamente el código
    public modDoctor() {
        // llamamos a la conexión
        conx = new conexion();
    }
// Crear el INSERT

    public String insertDoctor(Double Identificacion, String Nombre, String Apellido, 
            String Direccion, String Telefono, String Especialidad, String Email, String Vinculacion) {
        // Crear variable que mostrará un resultado
        String resultado = null;
        // Intentar conectar a MySQL con try catch
        try {
            // Crear variable de tipo connection y obtener la conexión por el metodo getConexion
            Connection accesoDB = conx.getConexion();
            // Crear una variable de tipo PreparedStatement que permite ejecutar un insert
            PreparedStatement ps = accesoDB.prepareStatement("insert into Doctor values (?,?,?,?,?,?,?,?)");
            // Asignar la posición de la variable a cada ?
            ps.setInt(1, Identificacion);
            ps.setString(2, Nombre);
            ps.setString(3, Apellido);
            ps.setString(4, Direccion);
            ps.setString(5, Telefono);
            ps.setString(6, Especialidad);
            ps.setDouble(7, Email);
            ps.setDouble(8, Vinculacion);
            // Verificar si se insertaron registros
            int cantRegistros = ps.executeUpdate();
            if (cantRegistros > 0) {
                resultado = "Se han insertado los datos.";
            } else {
                resultado = "No se han insertado los datos.";
            }
        } // Si hay un error guardarlo en la variable e
        catch (Exception e) {
            // Mostrar un mensaje con la variable e
            JOptionPane.showMessageDialog(null, "Se produjo un error:\n" + e);
        }
        return resultado;
    }

    }
