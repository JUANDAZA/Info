package com.macapps.developer.circulo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Developer on 16/3/2017.
 */

public class Circulo extends Figura {
    private int radio;
    public  Circulo(int radio){
        this.radio=radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }
    public double perimetro(){
        return  Math.PI*radio*radio;
    }
    public void array(){
        List<String> strings;
        strings=new ArrayList<>();
        strings.add("hola");

    }
}
