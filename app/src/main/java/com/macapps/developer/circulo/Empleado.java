package com.macapps.developer.circulo;

/**
 * Created by Developer on 6/4/2017.
 */

public class Empleado {
    private String nombre,sexo,estadoCivil,cargo,direccion;
    private double cedula,telefono;
    private int subsidio,dNacimiento,mNacimiento,aNacimiento,dVinculacion,mVinculacion,aVinculacion;

    public Empleado(String nombre, String sexo, String estadoCivil, String cargo, String direccion, double cedula, double telefono, int subsidio, int dNacimiento, int mNacimiento, int aNacimiento, int dVinculacion, int mVinculacion, int aVinculacion) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.cargo = cargo;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.subsidio = subsidio;
        this.dNacimiento = dNacimiento;
        this.mNacimiento = mNacimiento;
        this.aNacimiento = aNacimiento;
        this.dVinculacion = dVinculacion;
        this.mVinculacion = mVinculacion;
        this.aVinculacion = aVinculacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCedula() {
        return cedula;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public int getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(int subsidio) {
        this.subsidio = subsidio;
    }

    public int getdNacimiento() {
        return dNacimiento;
    }

    public void setdNacimiento(int dNacimiento) {
        this.dNacimiento = dNacimiento;
    }

    public int getmNacimiento() {
        return mNacimiento;
    }

    public void setmNacimiento(int mNacimiento) {
        this.mNacimiento = mNacimiento;
    }

    public int getaNacimiento() {
        return aNacimiento;
    }

    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }

    public int getdVinculacion() {
        return dVinculacion;
    }

    public void setdVinculacion(int dVinculacion) {
        this.dVinculacion = dVinculacion;
    }

    public int getmVinculacion() {
        return mVinculacion;
    }

    public void setmVinculacion(int mVinculacion) {
        this.mVinculacion = mVinculacion;
    }

    public int getaVinculacion() {
        return aVinculacion;
    }

    public void setaVinculacion(int aVinculacion) {
        this.aVinculacion = aVinculacion;
    }

    public Empleado() {
    }

}
