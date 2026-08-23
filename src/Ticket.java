import java.util.ArrayList;

/**
 * Representa el ticket o cuenta de un pedido en el restaurante.
 * Esta clase gestiona la asociación entre un cliente, el camarero que lo atiende
 * y la lista de productos consumidos, calculando automáticamente los totales y descuentos.
 * 
 * @author Mario
 * @version 1.0
 */
public class Ticket {
    
    private Camarero camarero;
    private Cliente cliente;
    private ArrayList<Producto> productos;

    /**
     * Constructor de la clase Ticket.
     * Inicializa un nuevo ticket asociando al cliente y al camarero,
     * y preparando una lista vacía para añadir productos posteriormente.
     * 
     * @param camarero El empleado responsable de atender el pedido.
     * @param cliente El cliente que realiza el pedido y al que se le facturará.
     */
    public Ticket(Camarero camarero, Cliente cliente) {
        this.camarero = camarero;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    /**
     * Añade un nuevo producto a la lista de consumiciones del ticket.
     * 
     * @param producto El producto a añadir (bebida, comida, etc.).
     */
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Producto añadido al ticket");
    }

    /**
     * Calcula el precio total del ticket sumando el importe de todos los productos.
     * Si un producto implementa la interfaz {@link Descontable} (como las Bebidas),
     * se le aplica automáticamente un 10% de descuento antes de sumarlo al total.
     * 
     * @return El importe total a cobrar al cliente.
     */
    public double calcularTotal() {
        double precioTotal = 0;
        
        for (Producto producto : this.productos) {
            if (producto instanceof Descontable) {
                Descontable prodDescontable = (Descontable) producto;
                precioTotal += prodDescontable.aplicarDescuento(10);
            } else {
                precioTotal += producto.getPrecio();
            }
        }
        return precioTotal;
    }

    /**
     * Imprime por consola el ticket formateado con el diseño de la cafetería.
     * Muestra los datos del cliente, el camarero, el listado de productos enumerados
     * y el desglose de los descuentos aplicados si corresponde, finalizando con el importe total.
     */
    public void mostrarTicket() {
        System.out.println("\n===========================");
        System.out.println("      CAFETERÍA JAVA       ");
        System.out.println("===========================");
        System.out.println(this.cliente);
        System.out.println(this.camarero);

        System.out.println("productos: ");
        int contador = 1;
        for (Producto producto : this.productos) {
            System.out.println(contador + ". " + producto);
            
            if (producto instanceof Descontable) {
                Descontable prodDescontable = (Descontable) producto;
                double precioFinal = prodDescontable.aplicarDescuento(10);

                System.out.println("    -> Descuento aplicado al " + producto.getNombre() + ": 10%");
                System.out.println("    -> Precio final del " + producto.getNombre() + ": " + String.format("%.2f", precioFinal) + " €");
            }
            contador++;
        }

        System.out.println("---------------------------");
        System.out.println("TOTAL: " + calcularTotal() + " €");
        System.out.println("===========================");
    }
}