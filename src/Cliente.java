/**
 * Representa a un cliente del restaurante.
 * Esta clase almacena la información personal y los datos de contacto del
 * cliente.
 * 
 * @author Mario
 * @version 1.0
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String telefono;

    /**
     * Constructor de la clase Cliente.
     * Crea un nuevo cliente con su nombre, apellido y número de contacto.
     * 
     * @param nombre   El nombre del cliente.
     * @param apellido El apellido o apellidos del cliente.
     * @param telefono El número de teléfono de contacto del cliente.
     */
    public Cliente(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre actual del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece o modifica el nombre del cliente.
     * 
     * @param nombre El nuevo nombre que se asignará al cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del cliente.
     * 
     * @return El apellido actual del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece o modifica el apellido del cliente.
     * 
     * @param apellido El nuevo apellido que se asignará al cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     * 
     * @return El teléfono de contacto del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece o modifica el número de teléfono del cliente.
     * 
     * @param telefono El nuevo número de teléfono que se asignará al cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve una  cadena de texto de los datos del cliente.
     */
     @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellido + ", Telefono: " + telefono;
    }

}