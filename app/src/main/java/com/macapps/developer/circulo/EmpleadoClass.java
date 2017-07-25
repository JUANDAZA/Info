package com.macapps.developer.circulo;

import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Developer on 6/4/2017.
 */

public class EmpleadoClass {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {

            EmpleadoClass empleadoClass = new EmpleadoClass();
            empleadoClass.run(args);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void run(String[] args) throws Exception {
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opc;
        int index;
        do {
            System.out.println("1:Agregar \n 2:Salario \n  3:Eliminar \n 0:Para Salir");
            opc = scanner.nextInt();

                switch (opc) {
                    case 1:
                        empleados.add(addEmpleado());
                        break;
                    case 2:
                        System.out.println("De que empleado?");
                        index = scanner.nextInt();
                        Double aDouble=Sueldo(empleados.get(index));
                        aDouble=aDouble+aDouble*empleados.get(index).getSubsidio()*2.5d;
                        System.out.println("Sueldo="+aDouble+"Millones");

                        break;
                    case 3:

                        System.out.println("De que empleado?");
                        index = scanner.nextInt();
                        empleados.remove(index);
                        break;
                    default:
                        break;

                }



        } while (opc != 0);

    }

    public Empleado addEmpleado() {

        String nombre, sexo, estadoCivil, cargo, direccion;
        double cedula, telefono;
        int subsidio, dNacimiento, mNacimiento, aNacimiento, dVinculacion, mVinculacion, aVinculacion;
        Empleado empleado;
        System.out.println("Ingresa: Nombre,Sexo,Estado civil, Cargo, Direccion, Cedula, Telefono, Subsidio,Dia de nacimiento, Mes de Nacimiento, Año de Nacimiento, Dia de " +
                "Vinculacion, mes de Vinculacion, Año de Vinculacion");
        try {


            nombre = scanner.nextLine();
            sexo = scanner.nextLine();
            estadoCivil = scanner.nextLine();
            cargo = scanner.nextLine();
            direccion = scanner.nextLine();
            cedula = scanner.nextDouble();
            telefono = scanner.nextDouble();
            subsidio = scanner.nextInt();
            dNacimiento = scanner.nextInt();
            mNacimiento = scanner.nextInt();
            aNacimiento = scanner.nextInt();
            dVinculacion = scanner.nextInt();
            mVinculacion = scanner.nextInt();
            aVinculacion = scanner.nextInt();
            empleado = new Empleado(nombre, sexo, estadoCivil, cargo, direccion, cedula, telefono, subsidio, dNacimiento, mNacimiento, aNacimiento, dVinculacion, mVinculacion, aVinculacion);
        }catch (InputMismatchException e){
            empleado=new Empleado();
        }catch (IllegalFormatException e){
            empleado=new Empleado();
        }



        return empleado;
    }
    public double Sueldo(Empleado empleado){
        int año,mes,dia;
        año =17-empleado.getaVinculacion();
        mes=4-empleado.getmVinculacion();
        dia=6-empleado.getdVinculacion();
        String cargo=empleado.getCargo();

        if(año<6&&mes<0&&dia<0){//Menor a 6 años

            switch (cargo){
                case "gerente":
                    return 7;
                case "director":
                    return 4;
                case "administrativo":
                    return 2;
                case "operario":
                    return 1;
                default:
                    return 0;

            }

        }
        if (año>6&&año<12&&mes<0&&dia<0){
            switch (cargo){
                case "gerente":
                    return 10;
                case "director":
                    return 5;
                case "administrativo":
                    return 3;
                case "operario":
                    return 1.5;
                default:
                    return 0;

            }


        }
        if(año>12&&año<18&&mes>0){
            switch (cargo){
                case "gerente":
                    return 12;
                case "director":
                    return 6;
                case "administrativo":
                    return 4;
                case "operario":
                    return 2;
                default:
                    return 0;

            }
        }
        if (año>18&&mes<0&&dia<0){
            switch (cargo){
                case "gerente":
                    return 15;
                case "director":
                    return 7;
                case "administrativo":
                    return 5;
                case "operario":
                    return 2.5;
                default:
                    return 0;

            }
        }
        return 0;
    }

}
