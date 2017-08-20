

package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.modCitaMedica;
import modelo.modDoctor;
import vista.visCitaMedica;
import vista.visDoctor;

/**
 *
 * @author Tankayan
 */
// Implementar ActionListener para poder escuchar las acciones del frame
public class conDoctor implements ActionListener{ 
    // Crear un objeto de la vista y modelo
    visDoctor VistaDoctor = new visDoctor();
    modDoctor modeloDoctor = new modDoctor();
    
    // Crear constructor para inicializar los objetos
    public conDoctor(visCitaMedica vistaDoctor, modDoctor modeloDoctor) {
        // Inicializar los objetos
        this.VistaDoctor = VistaDoctor;
        // Añadir el actionListener a los botones
        this.VistaDoctor.btnLimpiar.addActionListener(this);
        this.VistaDoctor.btnActualizar.addActionListener(this);
        this.VistaDoctor.btnGuardar.addActionListener(this);
        this.VistaDoctor.btnEliminar.addActionListener(this);
        this.VistaDoctor.btnAtras.addActionListener(this);
        this.VistaDoctor.btnSalir.addActionListener(this);
    }

    // Crear la función para poder ejecutar eventos
    
    public void actionPerformed(ActionEvent e) {
        // Función para el botón Limpiar
        if (e.getSource() == VistaDoctor.btnLimpiar) {
            VistaDoctor.txtIdentificacion.setText("");
            VistaDoctor.txtNombre.setText("");
            VistaDoctor.txtApellido.setText("");
            VistaDoctor.txtDireccion.setText("");
            VistaDoctor.txtTelefono.setText("");
            VistaDoctor.txtEspecialidad.setText("");
            VistaDoctor.txtEmail.setText("");
            VistaDoctor.txtVinculacion.setText("");
            VistaDoctor.txtRetiro.setText("");
        }
        // Función para el botón Guardar
        if (e.getSource() == VistaDoctor.btnGuardar) {
            // Capturar valores
            int Identificacion = Integer.parseInt(VistaDoctor.txtIdentificacion.getText());
            String Nombre = VistaDoctor.txtNombre.getText();
            String Apellido = VistaDoctor.txtApellido.getText();
            String Direccion = VistaDoctor.txtDireccion.getText();
            String  Telefono = VistaDoctor.txtTelefono.getText();
            String Especialidad = VistaDoctor.txtEspecialidad.getText();
            Double Email = Double.parseDouble(VistaDoctor.txtEmail.getText());
            Double Vinculacion = Double.parseDouble(VistaDoctor.txtVinculacion.getText());
            // Ejecutar la función INSERT
            String respuesta = modeloDoctor.insertDoctor(Identificacion,Nombre ,Apellido ,Direccion , Telefono , Especialidad, Email ,Vinculacion  );
            // Mostrar resultado
            JOptionPane.showMessageDialog(null, respuesta);
        }
    }
}
