
package ar.com.danio.peliculas.datos;

import ar.com.danio.peliculas.domain.Pelicula;
import ar.com.danio.peliculas.excepciones.AccesoDatosEx;
import ar.com.danio.peliculas.excepciones.EscrituraDatosEx;
import ar.com.danio.peliculas.excepciones.LecturaDatosEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImp implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while(linea != null){
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al listar películas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al listar películas: " + ex.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
    }

}
