package co.vinni.soapproyectobase.controladores;

import co.vinni.soapproyectobase.entidades.Persona;
import co.vinni.soapproyectobase.servicios.ServicioPersonas;

import java.util.List;

public class ControladorPersonas {


    private ServicioPersonas servicioPersonas = new ServicioPersonas();

    public void registrarPersona(Persona persona) {servicioPersonas.registrarPersona(persona);}

    public List<Persona> consultarPersonas() {
        return servicioPersonas.obtenerPersonas();
    }

    public void modificarPersona(Persona persona) {
        servicioPersonas.modificarPersona(persona);
    }

    public boolean existePersonaConSerial(long serial) {
        return servicioPersonas.existePersonaConSerial(serial);
    }

}
