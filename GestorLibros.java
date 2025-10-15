import java.util.*;
public class GestorLibros {
    
    ArrayList<Libro> libros= new ArrayList<Libro>(); 
    ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
    
    public Libro buscarLibro(String ISBN){
        for (Libro l:libros){
            if (l.getISBN().equals(ISBN))
                return l; 
        }
        return null;
    }
    
    public void agregarLibro(String titulo, String autor, String ISBN){
        if (buscarLibro(ISBN)==null){
            libros.add(new Libro(titulo,autor,ISBN,true));
        }
        else 
            System.out.println("El libro ya esta agregado");
    }
    
    public Usuario buscarUsuario(String codigo){
        for (Usuario a:usuarios){
            if (a.getCodigo().equals(codigo))
                return a; 
        }
        return null;
    }
    
    public void agregarUsuario(String nombre, String codigo){
        if (buscarUsuario(codigo)==null){
            usuarios.add(new Usuario(nombre,codigo));
        }
        else 
            System.out.println("El usuario ya esta registrado");
    }
    
}