/**
 * Representa una bebida dentro del catálogo de productos del restaurante.
 * Esta clase hereda de la clase {@link Producto} y permite aplicar descuentos
 * al implementar la interfaz {@link Descontable}.
 * 
 * @author Mario
 * @version 1.0
 */
public class Bebidas extends Producto implements Descontable {

    private String tipoBebida;

    /**
     * Constructor de la clase Bebidas.
     * Crea una nueva bebida inicializando los atributos heredados de Producto y su tipo específico.
     * 
     * @param nombre El nombre de la bebida .
     * @param precio El precio base de la bebida.
     * @param categoria La categoría a la que pertenece dentro del menú.
     * @param tipoBebida El formato, tamaño o característica específica de la bebida 
     */
    public Bebidas(String nombre, Float precio, String categoria, String tipoBebida) {
        super(nombre, precio, categoria);
        this.tipoBebida = tipoBebida;
    }

    /**
     * Obtiene el tipo o formato específico de la bebida.
     * 
     * @return El tipo de bebida actual.
     */
    public String getTipoBebida() {
        return tipoBebida;
    }

    /**
     * Establece o modifica el tipo o formato específico de la bebida.
     * 
     * @param tipoBebida El nuevo tipo de bebida que se asignará.
     */
    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    /**
     * Calcula y aplica un porcentaje de descuento sobre el precio base de la bebida.
     * Esta es la implementación específica del método definido en la interfaz Descontable.
     * 
     * @param porcentaje El porcentaje de descuento a aplicar (por ejemplo, 10.0 para un 10%).
     * @return El precio final de la bebida tras haber restado la cantidad descontada.
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        // Si el porcentaje es negativo, lo ignoramos y devolvemos el precio normal
        if (porcentaje < 0) {
            return getPrecio();
        }
        
        double cantidadDescontada = (getPrecio() * porcentaje) / 100;
        return getPrecio() - cantidadDescontada;
    }

    /**
     * Devuelve una  cadena de texto de la bebida preparada para imprimir o mostrar en consola.
     * 
     * @return Una cadena formateada que incluye la categoría, el nombre, el tipo de bebida y el precio en euros (ej. "Refresco Coca-Cola Lata 2.5€ ").
     */
    @Override
    public String toString() {
        return getCategoria() + " " + getNombre() + " " + tipoBebida + " " + getPrecio() + "€ ";
    }

}