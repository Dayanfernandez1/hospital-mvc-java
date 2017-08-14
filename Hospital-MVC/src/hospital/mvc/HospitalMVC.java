package hospital.mvc;

import modelo.*;
import vista.*;
import controlador.*;

public class HospitalMVC {
    
    public static void main(String[] args) {
        // Crear un objeto para modelo vista y controlador
        modCitaMedica ModeloCitaMedica = new modCitaMedica();
        visCitaMedica VistaCitaMedica = new visCitaMedica();
        conCitaMedica ControladorCitaMedica = new conCitaMedica(VistaCitaMedica,ModeloCitaMedica);
        // Hacer visible la vista
        VistaCitaMedica.setVisible(true);
    }
}