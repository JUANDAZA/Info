package com.macapps.developer.circulo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Developer on 6/4/2017.
 */

public class Apostemos {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Maquina> maquinas = new ArrayList<>();
    ArrayList<Juego> juegos = new ArrayList<>();

    public static void main(String[] args) {
        try {
            Apostemos apostemos = new Apostemos();
            apostemos.run(args);

        } catch (Exception e) {
            e.printStackTrace();

        }


    }

    public void run(String[] args) throws Exception {
        int opc;

        //Bienvenida
        do {


            try {
                System.out.println("Ingresa una opcion: \n 1:Para Añadir una maquina\n 2:Para añadir un juego \n 3:Consultar Todos los jeugos y las maquinas en el sistema ");

                opc = scanner.nextInt();
                scanner.nextLine();
                switch (opc) {
                    case 1:
                        int opc2;
                        System.out.println("1:Añadir un juego nuevo\n 2:juego existente");

                        try {
                            opc2 = scanner.nextInt();
                            scanner.nextLine();
                            switch (opc2) {
                                case 1:
                                    maquinas.add(addMaquina(addJuego()));
                                    break;
                                case 2:
                                    if (juegos != null) {
                                        int numero;
                                        for (int i = 0; i <= juegos.size() - 1; i++) {
                                            System.out.println("Numero: " + i + "Nombre:" + juegos.get(i).getNombre() + " Adq:" + juegos.get(i).getFechaAdq() + "Act:" + juegos.get(i).getFechaAct());
                                        }
                                        System.out.println("Selecione el numero");
                                        numero = scanner.nextInt();
                                        scanner.nextLine();
                                        maquinas.add(addMaquina(juegos.get(numero)));
                                        break;

                                    } else {
                                        break;
                                    }


                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error Ingresa opcion Valida");
                            break;
                        }
                        break;
                    case 2:
                        addJuego();
                        break;
                    case 3:

                        for (int i = 0; i <= juegos.size() - 1; i++) {
                            System.out.println("Numero: " + i + "Nombre:" + juegos.get(i).getNombre() + " Adq:" + juegos.get(i).getFechaAdq() + "Act:" + juegos.get(i).getFechaAct());
                        }


                        for (int i = 0; i <= maquinas.size() - 1; i++) {
                            System.out.println("Numero: " + i + "Serial: " + maquinas.get(i).getSerial() + "Clasificacion: " + maquinas.get(i).getClasificacion() + "Ingresos: " + maquinas.get(i).getIngreso() + "Salidas: " + maquinas.get(i).getSalida() + "Juego" + maquinas.get(i).getJuego().getNombre());
                        }


                        break;
                    case 4:
                        String tmp;
                        int Index = 0;
                        System.out.println("Ingresa El serial");
                        tmp = scanner.nextLine();


                        for (Maquina maquina : maquinas) {

                            if (maquina.getSerial().matches(tmp)) {
                                System.out.println("Numero: " + Index + "Serial: " + maquina.getSerial() + "Clasificacion: " + maquina.getClasificacion() + "Ingresos: " + maquina.getIngreso() + "Salidas: " + maquina.getSalida() + "Juego" + maquina.getJuego().getNombre());
                                break;
                            }
                        }
                        System.out.println("Maquina No encontrada");


                    default:
                        System.out.println("Default");

                        break;
                    case 5:
                        int opc4;
                        System.out.println("1:Añadir Dinero a una maquina\n 2: Salida de dinero de una Maquina \n3: Dinero Recaudado por Maquina y Total 4:dinero Entregado Por maquina y total 5:Maquina con mayor recuado 6:Con mayor dinero entregado");
                        opc4 = scanner.nextInt();
                        scanner.nextLine();
                        switch (opc4) {
                            case 1:
                                int index;
                                double valor;
                                System.out.println("Numero de MAquina: ");
                                index = scanner.nextInt();
                                System.out.println("Valor: ");
                                valor = scanner.nextDouble();
                                scanner.nextLine();
                                maquinas.get(index).setIngreso(valor);
                                break;
                            case 2:
                                int index1;
                                double valor1;
                                System.out.println("Numero de MAquina: ");
                                index = scanner.nextInt();
                                System.out.println("Valor: ");
                                valor = scanner.nextDouble();
                                scanner.nextLine();
                                maquinas.get(index).setIngreso(valor);
                                break;

                            case 3:
                                double recaudo = 0;
                                for (int i = 0; i <= maquinas.size() - 1; i++) {
                                    System.out.println("Maquina " + i + "Recaudo:" + maquinas.get(i).getIngreso());
                                    recaudo = recaudo + maquinas.get(i).getIngreso();
                                }
                                System.out.println("Recaudo Total" + recaudo);
                                break;
                            case 4:
                                double salida = 0;
                                for (int i = 0; i <= maquinas.size() - 1; i++) {
                                    System.out.println("Maquina " + i + "Salida:" + maquinas.get(i).getIngreso());
                                    salida = salida + maquinas.get(i).getIngreso();
                                }
                                System.out.println("Salida Total" + salida);
                                break;
                            case 5:
                                double max = Double.MIN_VALUE;
                                int index3 = 0;
                                for (int i = 0; i <= maquinas.size() - 1; i++) {
                                    if (maquinas.get(i).getIngreso() >= max) {
                                        max = maquinas.get(i).getIngreso();
                                        i = index3;
                                    }
                                }
                                System.out.println("Maquina numero:" + index3 + "fue la que mas recaudo con:" + max);
                                break;

                            case 6:
                                double min = Double.MAX_VALUE;
                                int index6 = 0;
                                for (int i = 0; i <= maquinas.size() - 1; i++) {
                                    if (maquinas.get(i).getIngreso() <= min) {
                                        min = maquinas.get(i).getIngreso();
                                        i = index6;
                                    }
                                }
                                System.out.println("Maquina numero:" + index6 + "fue la que mas Entrego con:" + min);
                                break;

                        }
                    case 6:
                        for (int i = 0; i <= maquinas.size() - 1; i++) {
                            maquinas.get(i).setIngreso(0d);
                            maquinas.get(i).setSalida(0d);
                        }
                        break;
                }


            } catch (InputMismatchException e) {
                //Opcion No valida
                opc = 0;
                System.out.println("Formato no Valido");

            }
        } while (opc != 0);


    }

    public Maquina addMaquina(Juego juego) {
        String serial;
        String clasificacion;//Monedas,Billetes,Monedas y billetes;
        Double ingreso = 0d, salida = 0d;
        int opc3;

        System.out.println("Ingrese Serial de la Maquina");
        serial = scanner.nextLine();

        System.out.println("1:Billetes\n 2:Monedas y Billetes\n 3:Monedas ");
        opc3 = scanner.nextInt();
        scanner.nextLine();
        int aux = 1;
        do {
            switch (opc3) {
                case 1:
                    clasificacion = "Billetes";
                    break;
                case 2:
                    clasificacion = "Monedas y Billetes";
                    break;
                case 3:
                    clasificacion = "Monedas";
                    break;

                default:
                    System.out.println("ingrese Opcion valida");
                    clasificacion = "fail";
                    aux = 0;
            }
        } while (aux == 0);
        Maquina maquina = new Maquina(serial, clasificacion, ingreso, salida, juego);
        return maquina;


    }

    public Juego addJuego() {
        int opc3, aux;
        String nombre, adq, act;

        System.out.println("1:Ruleta\n 2:Poker\n 3:BlackJack \n 4:Bingo");
        opc3 = scanner.nextInt();
        scanner.nextLine();
        aux = 1;
        do {
            switch (opc3) {
                case 1:
                    nombre = "Ruleta";
                    break;
                case 2:
                    nombre = "Poker";
                    break;
                case 3:
                    nombre = "BlackJack";
                    break;
                case 4:
                    nombre = "Bingo";
                    break;
                default:
                    System.out.println("ingrese Opcion valida");
                    nombre = "fail";
                    aux = 0;
            }
        } while (aux == 0);
        System.out.println("Ingrese Fecha De Aquisicion");
        adq = scanner.nextLine();

        System.out.println("Ingrese Fecha De Actualizacion");
        act = scanner.nextLine();
        Juego juego = new Juego(nombre, adq, act);
        juegos.add(juego);
        return juego;


    }
}
