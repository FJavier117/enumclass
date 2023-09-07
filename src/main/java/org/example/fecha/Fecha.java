package org.example.fecha;

import org.example.enumtest.Month;

import java.util.Objects;

public class Fecha {
    private String dia;
    private Month mes;
    private String year;

    public Fecha(String dia, Month mes, String year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public String getDia() {
        return dia;
    }

    public Month getMes() {
        return mes;
    }

    public String getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return Objects.equals(dia, fecha.dia) && mes == fecha.mes && Objects.equals(year, fecha.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, year);
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "dia='" + dia + '\'' +
                ", mes=" + mes +
                ", year='" + year + '\'' +
                '}';
    }
}
