package org.example;

import org.example.agenda.Agenda;
import org.example.agenda.OperacionesAgenda;
import org.example.enumtest.DiaSemana;
import org.example.enumtest.Evento;
import org.example.enumtest.Month;
import org.example.enumtest.Tacos;
import org.example.fecha.Fecha;
import org.example.persona.Persona;

public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha("04", Month.SEPTIEMBRE, "2023");
        Fecha fecha2 = new Fecha("07", Month.SEPTIEMBRE, "2023");
        Fecha fecha3 = new Fecha("09", Month.SEPTIEMBRE, "2023");


        Agenda agenda1 = new Agenda("Reunion zoom reagendada", Evento.REUNION, DiaSemana.JUEVES, fecha1);
        Agenda agenda2 = new Agenda("Reunion zoom", Evento.RECORDATORIO, DiaSemana.SABADO, fecha2);
        Agenda agenda3 = new Agenda("Reunion zoom", Evento.REUNION, DiaSemana.LUNES, fecha3);
        Agenda agenda4 = new Agenda("Ver pelicula Transformers", Evento.CINE, DiaSemana.LUNES, fecha3);
        Agenda agenda5 = new Agenda("Pagar el gas", Evento.RECORDATORIO, DiaSemana.LUNES, fecha3);

        OperacionesAgenda operacionesAgenda = new OperacionesAgenda();
        operacionesAgenda.crearEvento(agenda1);
        operacionesAgenda.crearEvento(agenda2);
        operacionesAgenda.crearEvento(agenda3);
        operacionesAgenda.crearEvento(agenda4);
        operacionesAgenda.crearEvento(agenda5);
        operacionesAgenda.culsultarEvento(DiaSemana.JUEVES);

        Persona persona = new Persona("Antonio", "Lopez", "Martínez", fecha1);
        System.out.println(persona);


        //Métodos de enum class
        DiaSemana dia = DiaSemana.LUNES;
        System.out.println(dia.name());
        System.out.println("Posición: " + dia.ordinal());

        Tacos tacos = Enum.valueOf(Tacos.class, "barbacoa".toUpperCase());
        System.out.println(tacos);


    }
}