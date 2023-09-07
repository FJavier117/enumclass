package org.example.enumtest;

public enum Tacos {
    SUADERO("Res","Maiz"),
    BARBACOA("Borrego","Harina"),
    PASTOR("Cerdo","Maiz"),
    ASADA("Res","Maiz");

    //public static final CARNITAS = new Tacos();
    Tacos(String tipoDeCArne, String tipoDeTorilla) {
        this.tipoDeCArne = tipoDeCArne;
        this.tipoDeTorilla = tipoDeTorilla;
    }

    private final String tipoDeCArne;
    private final String tipoDeTorilla;


    @Override
    public String toString() {
        return "Tacos{" +
                "tipoDeCArne='" + tipoDeCArne + '\'' +
                ", tipoDeTorilla='" + tipoDeTorilla + '\'' +
                '}';
    }
}
