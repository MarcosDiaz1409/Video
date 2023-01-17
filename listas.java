    /**
    * @Autor: Diego Soto
      @Date: 11-11-2022
    * Clase que describe a una lista de canciones
    */

import java.util.ArrayList;

public class listas {
    private String nombre;
    private ArrayList<cancion> canciones;

    /**
     * Parametros de la clase lista
     * @param nombre almacena el nombre de la lista
     * @param canciones almacena las canciones en una lista
     */

    public listas() {
        nombre = "";
        canciones = new ArrayList<cancion>();
    }


    public listas(String nombre, ArrayList<cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    /**
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * @return ArrayList<String>
     */
    public ArrayList<cancion> getCanciones() {
        return this.canciones;
    }

    /**
     * @param canciones
     */
    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return
            "Nombre de la lista: " + getNombre();
    }

}
