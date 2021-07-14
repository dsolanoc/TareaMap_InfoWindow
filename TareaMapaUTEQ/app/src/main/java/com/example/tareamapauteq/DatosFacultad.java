package com.example.tareamapauteq;

public class DatosFacultad {
    private String facultad;
    private String decano;
    private String correo;
    private String logo;
    private double latitud;
    private double longitud;

    public DatosFacultad(String facultad, String decano, String correo, String logo, double latitud, double longitud) {
        this.facultad = facultad;
        this.decano = decano;
        this.correo = correo;
        this.logo = logo;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getDecano() {
        return decano;
    }

    public void setDecano(String decano) {
        this.decano = decano;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
