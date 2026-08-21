/**
 * Producto
 * Representa a un producto dentro del sistema de restaurante.
 * esta clase permite la creacion de objetos de producto y a su vez actuará como
 * padre para las clases hijas vinculadas con ellas
 * 
 * @author Mario
 * @version 1.0
 */

public class Producto {
    private String nombre;
    private Float precio;
    private String categoria;

    /**
     * El metodo es utilizado para obtener el nombre del producto
     * 
     * @return El nombre del producto actual
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * El metodo es utilizado para establecer o modificar el nombre del producto
     * 
     * @param nombre el nombre que se asignará al producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El metodo es utilizado para obtener el precio del porducto
     * 
     * @return el precio del producto actual
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * El metodo es utilizado para establecer o modificar el precio del producto
     * 
     * @param precio el precio que se asignará al producto
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * El metodo es utilziado para obtener la categoria del producto
     * 
     * @return la categoria del producto
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * El metodo es utilizado para establecer o modificar la categoria del producto
     * 
     * @param categoria la categoria que se asignará al producto
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Constructor de la clase Producto sirve para crear un porducto con nombre,
     * preccio y categoria
     * 
     * @param nombre    el nombre del producto
     * @param precio    el precio del producto
     * @param categoria la categoria del producto
     */
    public Producto(String nombre, Float precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Devuelve una cadena de texto con los datos del producto
     */
    @Override
    public String toString() {
        return categoria + " " + nombre + " " + " " + precio + "€ ";

    }
}
