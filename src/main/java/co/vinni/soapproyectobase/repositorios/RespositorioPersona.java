package co.vinni.soapproyectobase.repositorios;

import co.vinni.soapproyectobase.entidades.Persona;

public interface RespositorioPersona {
    void registrarEquipo(Persona persona);
    Persona obtenerPersona();
}
