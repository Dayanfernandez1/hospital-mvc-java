package modelo;
// importar librería sql y JOptionPane

import java.sql.*;
import javax.swing.JOptionPane;

public class modCitaMedica {

    // Crear variable de tipo conexion (osea la clase que esta creada dentro de este paquete)
    conexion conx;

    // Crear constructor para ejecutar automaticamente el código
    public modCitaMedica() {
        // llamamos a la conexión
        conx = new conexion();
    }

    // Crear el INSERT
    public String insertCitaMedica(int codigo, String motivo, String diagnostico, String concepto, String medicina, String fecha, Double pacIdentificacion, Double docIdentificacion) {
        // Crear variable que mostrará un resultado
        String resultado = null;
        // Intentar conectar a MySQL con try catch
        try {
            // Crear variable de tipo connection y obtener la conexión por el metodo getConexion
            Connection accesoDB = conx.getConexion();
            // Crear una variable de tipo PreparedStatement que permite ejecutar un insert
            PreparedStatement ps = accesoDB.prepareStatement("insert into citamedica values (?,?,?,?,?,?,?,?)");
            // Asignar la posición de la variable a cada ?
            ps.setInt(1, codigo);
            ps.setString(2, motivo);
            ps.setString(3, diagnostico);
            ps.setString(4, concepto);
            ps.setString(5, medicina);
            ps.setString(6, fecha);
            ps.setDouble(7, pacIdentificacion);
            ps.setDouble(8, docIdentificacion);
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
    // Crear el UPDATE
    public String updateCitaMedica(int codigo, String motivo, String diagnostico, String concepto, String medicina, String fecha, Double pacIdentificacion, Double docIdentificacion) {
        // Crear variable que mostrará un resultado
        String resultado = null;
        // Intentar conectar a MySQL con try catch
        try {
            // Crear variable de tipo connection y obtener la conexión por el metodo getConexion
            Connection accesoDB = conx.getConexion();
            // Crear una variable de tipo PreparedStatement que permite ejecutar un insert
            PreparedStatement ps = accesoDB.prepareStatement("update citamedica set cit_motivo=?,cit_diagnostico=?,cit_concepto=?,cit_medicina=?,cit_fecha=?,pac_identificacion=?,doc_identificacion=? where cit_codigo=?");
            // Asignar la posición de la variable a cada ?
            ps.setString(1, motivo);
            ps.setString(2, diagnostico);
            ps.setString(3, concepto);
            ps.setString(4, medicina);
            ps.setString(5, fecha);
            ps.setDouble(6, pacIdentificacion);
            ps.setDouble(7, docIdentificacion);
            ps.setInt(8, codigo);
            // Verificar si se insertaron registros
            int cantRegistros = ps.executeUpdate();
            if (cantRegistros > 0) {
                resultado = "Se han actualizado los datos.";
            } else {
                resultado = "No se han actualizado los datos.";
            }
        } // Si hay un error guardarlo en la variable e
        catch (Exception e) {
            // Mostrar un mensaje con la variable e
            JOptionPane.showMessageDialog(null, "Se produjo un error:\n" + e);
        }
        return resultado;
    }
    
    // Crear el DELETE
    public String deleteCitaMedica(int codigo) {
        // Crear variable que mostrará un resultado
        String resultado = null;
        // Intentar conectar a MySQL con try catch
        try {
            // Crear variable de tipo connection y obtener la conexión por el metodo getConexion
            Connection accesoDB = conx.getConexion();
            // Crear una variable de tipo PreparedStatement que permite ejecutar un insert
            PreparedStatement ps = accesoDB.prepareStatement("delete from citamedica where cit_codigo=?");
            // Asignar la posición de la variable a cada ?
            ps.setInt(1, codigo);
            // Verificar si se insertaron registros
            int cantRegistros = ps.executeUpdate();
            if (cantRegistros > 0) {
                resultado = "Se han actualizado los datos.";
            } else {
                resultado = "No se han actualizado los datos.";
            }
        } // Si hay un error guardarlo en la variable e
        catch (Exception e) {
            // Mostrar un mensaje con la variable e
            JOptionPane.showMessageDialog(null, "Se produjo un error:\n" + e);
        }
        return resultado;
    }
}
