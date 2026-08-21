/**
 * Representa a un camarero dentro del sistema del restaurante.
 * Esta clase almacena y gestiona la información personal y laboral del
 * empleado.
 * 
 * @author Mario
 * @version 1.0
 */
public class Camarero {

    private String nombre;
    private String codigoEmpleado;

    /**
     * Constructor de la clase Camarero.
     * Crea un nuevo camarero con su nombre y código identificativo.
     * 
     * @param nombre         El nombre completo del camarero.
     * @param codigoEmpleado El código único asignado al empleado.
     */
    public Camarero(String nombre, String codigoEmpleado) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Obtiene el nombre del camarero.
     * 
     * @return El nombre actual del camarero.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece o modifica el nombre del camarero.
     * 
     * @param nombre El nuevo nombre que se asignará al camarero.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el código identificativo del empleado.
     * 
     * @return El código alfanumérico asignado al camarero.
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Establece o modifica el código identificativo del empleado.
     * 
     * @param codigoEmpleado El nuevo código único que se asignará al camarero.
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Devuelve una   cadena de texto de los datos del camarero.
     * 
     */
     @Override
    public String toString() {
        return "Camarero nombre: " + nombre + " - Código: " + codigoEmpleado;
    }
}