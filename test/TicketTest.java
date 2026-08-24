import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {

    private Ticket ticket;

    @BeforeEach
    void setUp() {
        // Preparamos el ticket
        Camarero camarero = new Camarero("Juan", "C01");
        Cliente cliente = new Cliente("Ana", "Perez", "600123456");
        ticket = new Ticket(camarero, cliente);
    }

    @AfterEach
    void tearDown() {
        ticket = null;
    }

    @Test
    void testCalcularTotalConDescuentos() {
        // 1. Creamos un plato de 10.0€ (No tiene descuento)
        Platos plato = new Platos("Macarrones", 10.0f, "Principal", "Entera");
        // 2. Creamos una bebida de 5.0€ (El ticket le aplicará un 10% -> 4.5€)
        Bebidas bebida = new Bebidas("Agua", 5.0f, "Bebida", "Botella");

        // 3. Los añadimos al ticket
        ticket.agregarProducto(plato);
        ticket.agregarProducto(bebida);

        // 4. El total esperado es 10.0 + 4.5 = 14.5€
        double totalReal = ticket.calcularTotal();
        assertEquals(14.5, totalReal, 0.01, "El sumatorio del ticket falló al aplicar el descuento");
    }

    @Test
    void testCalcularTotalTicketVacio() {
        // Caso negativo/límite: No añadimos productos. El total debe ser 0.0.
        double totalReal = ticket.calcularTotal();
        assertEquals(0.0, totalReal, 0.01, "Un ticket vacío debería sumar 0.0");
    }
}