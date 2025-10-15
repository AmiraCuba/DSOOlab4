import java.util.*;
public class Usuario {
    /*Creamos las atributos de "Usuario"*/
    private String nombre, codigo;
    private ArrayList <Libro> libros;

    /*Creamos un constructor*/
    public Usuario(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.libros = new ArrayList<>();
    }

    /*Creamos los getters y setters*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /*Creamos el método para prestar libro*/
    public void prestarLibro(Libro libro){
        if (libro.estaDisponible()){
            libros = new ArrayList<Libro>();
            libro.setDisponible(false);
            libros.add(libro);
        }
    }

    /*Creamos el método para devolver libro*/
    public void devolverLibro(Libro libro){
        if (libros.contains(libro)){
            libro.setDisponible(true);
            libros.remove(libro);
        }
    }

    /*Creamos el método para verificar disponibilidad*/
    public boolean disponibilidadLibro(Libro libro){
        if (libros.contains(libro)){
            return false;
        }
        else
            return true;
    }

    /*Creamos el método ToString*/
    public String toString(){
        return "Usuario: " + nombre + "\nCodigo: " + codigo +
        "\nLibros prestados: " + libros;
    }
}
