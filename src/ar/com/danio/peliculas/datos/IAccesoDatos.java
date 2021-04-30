
package ar.com.danio.peliculas.datos;

import ar.com.danio.peliculas.domain.Pelicula;
import ar.com.danio.peliculas.excepciones.AccesoDatosEx;
import ar.com.danio.peliculas.excepciones.EscrituraDatosEx;
import ar.com.danio.peliculas.excepciones.LecturaDatosEx;
import java.util.List;

public interface IAccesoDatos {
    
    public boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;
    
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
    
    public void crear(String nombreArchivo) throws AccesoDatosEx;
    
    public void borrar(String nombreArchivo) throws AccesoDatosEx;
}
