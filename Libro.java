public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;

    // Constructor vacío
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Desconocido";
        this.ISBN = "0000";
        this.disponible = true;
    }

    // Constructor con parámetros básicos
    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = true;
    }

    // Constructor sobrecargado con todos los atributos
    public Libro(String titulo, String autor, String ISBN, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getISBN() { return ISBN; }
    public boolean estaDisponible() { return disponible; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    // toString
    @Override
    public String toString() {
        String estado;
        if (disponible) {
            estado = "Sí";
        } else {
            estado = "No";
        }
        return "Libro{" +
                "Título='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Disponible=" + estado +
                '}';
    }
}