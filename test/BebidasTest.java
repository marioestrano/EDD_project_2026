import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BebidasTest {

    private Bebidas bebida;

    @BeforeEach
    void setUp() {
        //agregamos una bebida
        bebida = new Bebidas("Gaseosa", 10.0f, "Bebida", "fria");
    }

    @AfterEach
    void tearDown() {

        bebida = null;
    }

    @Test
    void testAplicarDescuentoPositivo() {
        // Caso positivo: Aplicamos un 20% de descuento a 10€. Debería dar 8.0€.
        double resultado = bebida.aplicarDescuento(20.0);

        // Comprobamos: (Esperado, Real, Margen de error)
        assertEquals(8.0, resultado, 0.01);
    }

    @Test
    void testAplicarDescuentoCero() {
        // Caso cero: Aplicamos un 0% de descuento. El precio debe quedarse en 10.0€.
        double resultado = bebida.aplicarDescuento(0.0);
        assertEquals(10.0, resultado, 0.01);
    }
    @Test
    void testAplicarDescuentoNegativo() {
        // Caso negativo: Aplicamos un -20% de descuento. El precio debe quedarse en 10.0€.
        // Al pasar un negativo, la clase debería aplicar el condicional y devolver el precio original incluso si en el caso practico esto no llega a darse ya que para el 
        // programa indicado el descuento es fijo y no hay manera de cambiarlo de la manera en como se ha hecho el programa
        double resultado = bebida.aplicarDescuento(-20.0);
        assertEquals(10.0, resultado, 0.01);
    }

}
