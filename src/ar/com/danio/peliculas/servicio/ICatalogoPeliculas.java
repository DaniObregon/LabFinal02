
package ar.com.danio.peliculas.servicio;

public interface ICatalogoPeliculas {
    
    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    void listarPeliculas();
    public void buscarPelicula(String buscar);
    public void iniciarCatalogoPeliculas();
    
    
    
}
