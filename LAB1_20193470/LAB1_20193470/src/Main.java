import Controller.AppController;
import beans.Equipo;
import beans.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        Jugador jugador = new Jugador();
        AppController appController = new AppController();
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        //ArrayList<Jugador> listaJugadorxSalario = new ArrayList<>();
        //ArrayList<Jugador> ListaJugadorxEquipo = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        main_str:
        while(true) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("|                Menu                 |");
            System.out.println("| 1 <- Regitrar Nuevo Equipo          |");
            System.out.println("| 2 <- Registrar Nuevo Jugador        |");
            System.out.println("| 3 <- Lista de jugadores por salario |");
            System.out.println("| 4 <- Lista de equipos               |");
            System.out.println("| 5 <- Lista de jugadores por equipo  |");
            System.out.println("| 9 <- Salir                          |");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("ingrese opcion: ");


            switch(scanner.nextLine()) {
                case "1": {
                    System.out.println("Registrar nuevo equipo");
                    System.out.println("-------------------------------------");
                    AppController.registrarNuevoEquipo(listaEquipos);
                    break;
                }
                case "2": {
                    System.out.println("Registrar nuevo jugador");
                    System.out.println("-------------------------------------");
                    AppController.registrarNuevoJugador(listaJugadores);
                    break;
                }
                case "3": {
                    System.out.println("Lista de jugadores por salario");
                    System.out.println("-------------------------------------");
                    AppController.listarJugadoresxSalario(listaEquipos, listaJugadores);
                    break;
                }
                case "4": {
                    System.out.println("Lista de equipos");
                    System.out.println("-------------------------------------");
                    AppController.listarEquipos(listaEquipos, listaJugadores);
                    break;
                }
                case "5": {
                    System.out.println("Lista de jugadores por equipo");
                    System.out.println("-------------------------------------");
                    AppController.listarJugadoresxEquipo(listaEquipos, listaJugadores);
                    break;
                }
                case "9": {
                    System.out.println("------ Cerrando programa ------");
                    break main_str;
                }
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
}