package org.example.agenda;

import org.example.enumtest.DiaSemana;
import java.util.ArrayList;
import java.util.LinkedList;

public class OperacionesAgenda {
    private final ArrayList<Agenda> listElementos;

    {
        listElementos = new ArrayList<>();
    }
    public void culsultarEvento(DiaSemana diaSemana){
        switch (diaSemana){
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO -> {
                mostrar(buscarElementos(diaSemana));
            }
        }
    }

    private void mostrar(LinkedList<Agenda> list){
        for (Agenda agenda: list){
            System.out.println(agenda.toString());
        }
    }

    private LinkedList<Agenda> buscarElementos(DiaSemana diaSemana){
        LinkedList<Agenda> list = new LinkedList<>();
        for (Agenda agenda: listElementos) {
            if (agenda.getDiaSemana().equals(diaSemana)){
                list.add(agenda);
            }
        }
        return list;
    }

    public void crearEvento(Agenda agenda){
        listElementos.add(agenda);
    }

}
