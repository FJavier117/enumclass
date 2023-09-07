package org.example.agenda;

import org.example.enumtest.DiaSemana;
import org.example.enumtest.Evento;
import org.example.fecha.Fecha;


public class Agenda {
    private String descripcion;
    private Evento evento;
    private DiaSemana diaSemana;
    private Fecha fecha;

    public Agenda(String descripcion, Evento evento, DiaSemana diaSemana, Fecha fecha) {
        this.descripcion = descripcion;
        this.evento = evento;
        this.diaSemana = diaSemana;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Evento getEvento() {
        return evento;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public Fecha getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "descripcion='" + descripcion + '\'' +
                ", evento=" + evento +
                ", diaSemana=" + diaSemana +
                ", fecha=" + fecha +
                '}';
    }
}
