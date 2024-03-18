package co.vinni.soapproyectobase.servicios;

import co.vinni.soapproyectobase.entidades.Persona;
import co.vinni.soapproyectobase.utilidades.UtilidadArchivos;

import java.util.List;

public class ServicioPersonas {


    private static final String ARCHIVO_EQUIPOS = "equipos.dat";

    public void registrarPersona(Persona persona) {
        UtilidadArchivos.guardarPersona(ARCHIVO_EQUIPOS, persona);
    }

    public List<Persona> obtenerPersonas() {
        return UtilidadArchivos.obtenerPersonas(ARCHIVO_EQUIPOS);
    }

    public boolean existePersonaConSerial(long serial) {
        List<Persona> personas = UtilidadArchivos.obtenerPersonas(ARCHIVO_EQUIPOS);
        for (Persona persona : personas) {
            if (persona.getNumeroDocuemnto() == serial) {
                return true;
            }
        }
        return false;
    }

    public void modificarPersona(Persona persona) {
        List<Persona> personas = UtilidadArchivos.obtenerPersonas(ARCHIVO_EQUIPOS);
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNumeroDocuemnto() == persona.getNumeroDocuemnto()) {
                personas.set(i, persona);
                UtilidadArchivos.guardarPersonas(ARCHIVO_EQUIPOS, personas);
                return;
            }
        }
        System.out.println("No se encontró un equipo con ese serial.");
    }
}
