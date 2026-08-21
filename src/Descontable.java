/**
 * Define el comportamiento para los elementos del sistema a los que se les puede aplicar un descuento.
 * Cualquier clase que implemente esta interfaz (como un producto, un pedido o una factura)
 * debe proporcionar la lógica para calcular y aplicar dicho descuento.
 * 
 * @author Mario
 * @version 1.0
 */
public interface Descontable {
    
    /**
     * Aplica un porcentaje de descuento al valor del elemento.
     * 
     * @param porcentaje El valor porcentual del descuento a aplicar (por ejemplo, 15.0 para un 15%).
     */
    double aplicarDescuento(double porcentaje);
}