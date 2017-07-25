package com.macapps.developer.circulo;

/**
 * Created by Developer on 6/4/2017.
 */

public class Maquina {
    private String serial;
    private String clasificacion;//Monedas,Billetes,Monedas y billetes;
    private Double ingreso,salida;
    private Juego juego;

    public Maquina(){

    }

    public Maquina(String serial, String clasificacion, Double ingreso, Double salida, Juego juego) {
        this.serial = serial;
        this.clasificacion = clasificacion;
        this.ingreso = ingreso;
        this.salida = salida;
        this.juego = juego;
    }
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Double getIngreso() {
        return ingreso;
    }

    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public Double getSalida() {
        return salida;
    }

    public void setSalida(Double salida) {
        this.salida = salida;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }


}
