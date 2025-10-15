import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear lista de libros
        ArrayList<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(new Libro("Tradiciones Peruanas", "Ricardo Palma", "010"));
        biblioteca.add(new Libro("La ciudad y los perros", "Mario Vargas LLosa", "011"));
        biblioteca.add(new Libro("El caballero carmelo", "Abraham Valderlomar", "012"));

        // Crear usuarios
        Usuario u1 = new Usuario("Jose", "U001");
        Usuario u2 = new Usuario("Daniela", "U002");

        // Mostrar libros iniciales
        System.out.println("\nLista de Libros inicial:");
        for (Libro l : biblioteca) {
            System.out.println(l);
        }

        // Prestamos
        System.out.println("\n-------------------- Prestamos --------------------");
        u1.prestarLibro(biblioteca.get(0)); // Jose toma el libro del tradiciones peruanas
        u2.prestarLibro(biblioteca.get(1)); // Daniela toma el lirbo la ciudad y los perros

        // Intento de Daniela de tomar el mismo libro que Jose
        u2.prestarLibro(biblioteca.get(0)); // No se puede prestar porque ya no esta disponible

        // Mostrar usuarios
        System.out.println("\nUsuarios:");
        System.out.println(u1);
        System.out.println(u2);

        // Devolucion de libros
        System.out.println("\n---------------- Devoluciones ---------------");
        u1.devolverLibro(biblioteca.get(0)); // Jose es el que devuelve el libro tradiciones

        // Mostrar libros despues de la devolucion de Jose
        System.out.println("\nLista de Libros despues de devoluciones:");
        for (Libro l : biblioteca) {
            System.out.println(l);
        }

        // Mostrar usuarios de nuevo
        System.out.println("\nUsuarios despues de devoluciones:");
        System.out.println(u1);
        System.out.println(u2);
    }
}
