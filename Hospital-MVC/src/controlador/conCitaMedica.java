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
      /* Inicializar los objetos
      this.modeloTienda = modeloTienda;
      this.vistaTienda = vistaTienda;
      /*this.vistaTienda.btnRegistrar.addActionListener(this);
      this.vistaTienda.btnEliminar.addActionListener(this);
      this.vistaTienda.btnLimpiar.addActionListener(this);
      this.vistaTienda.btnActualizar.addActionListener(this);
      this.vistaTienda.btnCerrar.addActionListener(this);*/
          
   }
    // Crear la función para poder ejecutar eventos
   public void actionPerformed(ActionEvent e){
       
   }
}
