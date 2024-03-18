package co.vinni.soapproyectobase.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

//@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona implements Serializable {
    private long numeroDocuemnto;
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    private TipoDocumento tipoDocumento;
    private LocalDate fechaNacimineto; // Nueva fecha de juego
    private int edadPersona;

    public long getNumeroDocuemnto() {
        return numeroDocuemnto;
    }

    public void setNumeroDocuemnto(long numeroDocuemnto) {
        this.numeroDocuemnto = numeroDocuemnto;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public LocalDate getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(LocalDate fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "numeroDocuemnto=" + numeroDocuemnto +
                ", primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", tipoDocumento=" + tipoDocumento +
                ", edadPersona=" + edadPersona +
                ", fechaNacimineto=" + fechaNacimineto +
                '}';
    }
}