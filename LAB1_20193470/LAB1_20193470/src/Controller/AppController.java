package Controller;

import beans.Equipo;
import beans.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class AppController {
    ArrayList<Equipo> listaEquipos = new ArrayList<>();
    ArrayList<Jugador> listaJugadores = new ArrayList<>();
    //ArrayList<Jugador> listaJugadorxSalario = new ArrayList<>();
    //ArrayList<Jugador> ListaJugadorxEquipo = new ArrayList<>();

    int l;
    public void registrarNuevoEquipo(Equipo) {
        Equipo equipo = new Equipo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre: ");
        equipo.setNombre(scanner.nextLine());
        System.out.println("Pais: ");
        equipo.setPais(scanner.nextLine());
        System.out.println("Iniciales: ");
        String iniciales = scanner.nextLine();
        l = iniciales.length()
        if (l > 3) {
            System.out.println("Error, el inicial no puede tener mas de 3 caracteres");
        }
        else {
            equipo.setIniciales(iniciales);
        }
        System.out.println("Estadio: ");
        equipo.setEstadio(scanner.nextLine());
        System.out.println("Tecnico: ");
        equipo.setTecnico((scanner.nextLine()));
        System.out.println("Presupuesto: ");
        equipo.setPresupuesto(Float.parseFloat(scanner.nextLine()));
    }
    public void registrarNuevoJugador(Jugador, Equipo) {
        Equipo equipo = new Equipo();
        Jugador jugador = new Jugador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Lista de equipos--------");
        System.out.println("elija un nombre de equipo: ");
        jugador.setTeam(scanner.nextLine());
        System.out.println("Nombre: ");
        jugador.setNombre(scanner.nextLine());
        System.out.println("Posicion: ");
        jugador.setPosicion(scanner.nextLine());
        System.out.println("Numero de camiseta: ");
        jugador.setNum_camiseta(scanner.nextLine());
        System.out.println("Edad: ");
        jugador.setEdad(scanner.nextLine());
        System.out.println("DNI: ");
        jugador.setDni(scanner.nextLine());
        System.out.println("Salario: ");
        jugador.setSalario(scanner.nextLine());
    }

    public void listarEquipos(Equipo, Jugador) {

    }

    public void listarJugadoresxSalario(Equipo, Jugador) {

    }

    public void listarJugadoresxEquipo(Equipo, Jugador) {

    }
}
