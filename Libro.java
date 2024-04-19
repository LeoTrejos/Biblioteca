public class Libro {
    private String titulo;
    private String autor;
    private String codigoLibro; 
    private String editorial;
    private int añoPublicacion;
    private double precio;

    public Libro(String titulo, String autor, String codigoLibro, String editorial, int añoPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoLibro = codigoLibro;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigoIdentificacion() {
        return codigoLibro;
    }

    public void setCodigoIdentificacion(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
