/**
 * Representa un plato de comida dentro del menú del restaurante.
 * Esta clase hereda de la clase {@link Producto} y añade características 
 * específicas relacionadas con la cantidad o tamaño de la ración.
 * 
 * @author Mario
 * @version 1.0
 */
public class Platos extends Producto {

    private String porcion;

    /**
     * Constructor de la clase Platos.
     * Crea un nuevo plato inicializando los atributos heredados de Producto y su porción específica.
     * 
     * @param nombre El nombre del plato 
     * @param precio El precio de venta del plato.
     * @param categoria La categoría a la que pertenece 
     * @param porcion El tamaño de la ración 
     */
    public Platos(String nombre, Float precio, String categoria, String porcion) {
        super(nombre, precio, categoria);
        this.porcion = porcion;
    }

    /**
     * Obtiene el tamaño de la ración del plato.
     * 
     * @return El tamaño de la porción actual.
     */
    public String getPorcion() {
        return porcion;
    }

    /**
     * Establece o modifica el tamaño de la ración del plato.
     * 
     * @param porcion El nuevo tamaño de porción que se asignará al plato.
     */
    public void setPorcion(String porcion) {
        this.porcion = porcion;
    }

    /**
     * Devuelve una cadena de texto del plato para su impresión o visualización.
     * 
     * @return Una cadena formateada que incluye la categoría, el nombre, la porción y el precio en euros (ej. "Entrantes Patatas Bravas Tapa 4.5€ ").
     */
    @Override
    public String toString() {
        return getCategoria() + " " + getNombre() + " " + porcion + " " + getPrecio() + "€ ";
    }
}