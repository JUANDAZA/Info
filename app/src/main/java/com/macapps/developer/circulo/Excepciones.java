package com.macapps.developer.circulo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Developer on 6/4/2017.
 */

public class Excepciones {

    public static void main(String[] args){
        int num,den,res;
        Scanner leer=new Scanner(System.in);
        System.out.println("division");
        System.out.println("Ingrese 1000 como denominador para terminar");
        do{
            try {
                System.out.println("Numerador:");
                num = leer.nextInt();
                System.out.println("Denomidar:");
                den = leer.nextInt();
                try {
                    res=num/den;
                    System.out.println("Resultado ="+res);

                }catch (ArithmeticException e){
                    System.out.println("No se puede dividir entre cero");
                } finally {
                    System.out.println("Siguiente Iteracion");
                }
            }catch (InputMismatchException e){
                System.out.println("No ingrese Letras");
                den=1000;

            }



        }while (den!=1000);

    }
}
