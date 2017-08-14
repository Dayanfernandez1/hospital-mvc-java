package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.modCitaMedica;
import vista.visCitaMedica;
// Implementar ActionListener para poder escuchar las acciones del frame
public class conCitaMedica implements ActionListener {
   // Crear un objeto de la vista y modelo
   visCitaMedica vistaCitaMedica = new visCitaMedica();
   modCitaMedica modeloCitaMedica = new modCitaMedica();
   // Crear constructor para inicializar los objetos
   public conCitaMedica(visCitaMedica vistaCitaMedica, modCitaMedica modeloCitaMedica){
      // Inicializar los objetos
      this.vistaCitaMedica = vistaCitaMedica;
      // Añadir el actionListener a los botones
      this.vistaCitaMedica.btnLimpiar.addActionListener(this);
      this.vistaCitaMedica.btnNuevo.addActionListener(this);
      this.vistaCitaMedica.btnGuardar.addActionListener(this);
      this.vistaCitaMedica.btnEliminar.addActionListener(this);
      this.vistaCitaMedica.btnAtras.addActionListener(this);
      this.vistaCitaMedica.btnSalir.addActionListener(this);
   }
    // Crear la función para poder ejecutar eventos
   public void actionPerformed(ActionEvent e){
      // Función para el botón Limpiar
      if(e.getSource()==vistaCitaMedica.btnLimpiar){
          vistaCitaMedica.txtCodigo.setText("");
          vistaCitaMedica.txtMotivo.setText("");
          vistaCitaMedica.txtDiagnostico.setText("");
          vistaCitaMedica.txtConcepto.setText("");
          vistaCitaMedica.txtMedicina.setText("");
          vistaCitaMedica.txtFecha.setText("");
          vistaCitaMedica.txtPaciente.setText("");
          vistaCitaMedica.txtDoctor.setText("");
      }
      // Función para el botón Registrar
      if(e.getSource()==vistaCitaMedica.btnGuardar){
         // Capturar valores
         int codigo = Integer.parseInt(vistaCitaMedica.txtCodigo.getText());
         String motivo = vistaCitaMedica.txtMotivo.getText();
         String diagnostico = vistaCitaMedica.txtDiagnostico.getText();
         String concepto = vistaCitaMedica.txtConcepto.getText();
         String medicina = vistaCitaMedica.txtMedicina.getText();
         String fecha = vistaCitaMedica.txtFecha.getText();
         Double paciente = Double.parseDouble(vistaCitaMedica.txtPaciente.getText());
         Double doctor = Double.parseDouble(vistaCitaMedica.txtDoctor.getText());
         // Ejecutar la función INSERT
         String respuesta = modeloCitaMedica.insertCitaMedica(codigo, motivo, diagnostico, concepto, medicina, fecha, paciente, doctor);
         // Mostrar resultado
         JOptionPane.showMessageDialog(null,respuesta);
      }
   }
}
