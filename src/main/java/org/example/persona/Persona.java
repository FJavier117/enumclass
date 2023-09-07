package org.example.persona;

import org.example.fecha.Fecha;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private Fecha birthdate;
    public Persona(String nombre, String apellidoP, String apellidoM, Fecha birthdate) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.birthdate = birthdate;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public Fecha getBirthdate() {
        return birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellidoP, persona.apellidoP) && Objects.equals(apellidoM, persona.apellidoM) && Objects.equals(birthdate, persona.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidoP, apellidoM, birthdate);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidoP='" + apellidoP + '\'' +
                ", apellidoM='" + apellidoM + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
