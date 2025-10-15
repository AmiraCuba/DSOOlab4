import java.util.*;
public class GestorLibros {
    
    ArrayList<Libro> libros= new ArrayList<Libro>(); 
    ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
    
    public Libro buscarLibro(int ISBN){
        for (Libro l:libros){
            if (l.getISBN()==(ISBN))
                return l; 
        }
        return null;
    }
    
    public void agregarLibro(String titulo, String autor, int ISBN){
        if (buscarLibro(ISBN)==null){
            libros.add(new Libro(titulo,autor,ISBN,true));
        }
        else 
            System.out.println("El libro ya esta agregado");
    }
    
    public Usuario buscarUsuario(int DNI){
        for (Usuario a:usuarios){
            if (a.getDNI()==(DNI))
                return a; 
        }
        return null;
    }
    
    public void agregarUsuario(String nombre, int DNI){
        if (buscarUsuario(DNI)==null){
            usuarios.add(new Usuario(nombre,DNI));
        }
        else 
            System.out.println("El usuario ya esta registrado");
    }
    
}