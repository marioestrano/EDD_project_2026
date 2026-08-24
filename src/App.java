import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que representa el punto de entrada de la aplicación de la Cafetería Java.
 * Se encarga de inicializar el menú (carta), interactuar con el usuario a través de la consola
 * para registrar al cliente, asignar un camarero y gestionar el proceso de pedido interactivo 
 * hasta la generación del ticket final.
 * 
 * @author Mario
 * @version 1.0
 */
public class App {

    /**
     * Método principal que ejecuta el flujo de la aplicación.
     * Orquesta la creación de la carta, la entrada de datos del {@link Cliente} mediante consola,
     * la selección del {@link Camarero} y el bucle de compra para añadir productos al {@link Ticket}.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en esta aplicación).
     * @throws Exception Si ocurre algún error de entrada/salida o de ejecución.
     */
    public static void main(String[] args) throws Exception {

        // Definimos un menu para que el usuario pueda elegir
        ArrayList<Producto> carta = new ArrayList<>();

        carta.add(new Bebidas("Café Solo", 1.50f, "Bebidas", "Caliente"));
        carta.add(new Bebidas("Café con Leche", 1.80f, "Bebidas", "Caliente"));
        carta.add(new Bebidas("Capuchino", 2.20f, "Bebidas", "Caliente"));
        carta.add(new Bebidas("Té Verde", 1.60f, "Bebidas", "Caliente"));
        carta.add(new Bebidas("Zumo de Naranja Natural", 2.50f, "Bebidas", "Frío"));
        carta.add(new Bebidas("Batido de Fresa", 3.00f, "Bebidas", "Frío"));
        carta.add(new Bebidas("Agua Mineral 500ml", 1.20f, "Bebidas", "Frío"));
        carta.add(new Bebidas("Refresco de Cola", 2.00f, "Bebidas", "Frío"));

        carta.add(new Platos("Tostada con Aceite y Tomate", 2.50f, "Platos", "Individual"));
        carta.add(new Platos("Tostada con Jamón Serrano", 3.50f, "Platos", "Individual"));
        carta.add(new Platos("Croissant a la plancha", 2.00f, "Platos", "Individual"));
        carta.add(new Platos("Tortitas con sirope (3 uds)", 4.50f, "Platos", "Para compartir"));
        carta.add(new Platos("Bocadillo de Pollo Asado", 4.80f, "Platos", "Individual"));
        carta.add(new Platos("Sándwich Mixto con huevo", 3.80f, "Platos", "Individual"));
        carta.add(new Platos("Ración de Patatas Bravas", 5.50f, "Platos", "Para compartir"));
        carta.add(new Platos("Porción de Tarta de Queso", 4.00f, "Platos", "Individual"));

        // en el siguiente flujo el usuario tiene que introducir sus datos y quien lo ha atendido

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.println("Introduzca el apellido del cliente");
        String apellido = sc.nextLine();

        System.out.println("introduzca el numero de telefono del cliente");
        String telefono = sc.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, telefono);

        Camarero camarero01 = new Camarero("Luis Magno", "WT-301");
        Camarero camarero02 = new Camarero("Homero De gea", "WT-302");
        Camarero camarero03 = new Camarero("Sinceron Austral", "WT-303");

        Camarero camareroAsignado = null;
        boolean SeleccionValida = false;

        while (!SeleccionValida) {
            System.out.println("\nSeleccione por quién fue atendido: ");
            System.out.println("1. " + camarero01);
            System.out.println("2. " + camarero02);
            System.out.println("3. " + camarero03);
            System.out.print("Opción (1-3): ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    camareroAsignado = camarero01;
                    SeleccionValida = true;
                    break;
                case 2:
                    camareroAsignado = camarero02;
                    SeleccionValida = true;
                    break;
                case 3:
                    camareroAsignado = camarero03;
                    SeleccionValida = true;
                    break;
                default:
                    System.out.println("Selecciona una opcion valida");
                    break;
            }
        }

        // en el siguiente flujo se crea el ticket de compra y se pide al usuario agregar los productos y sus validaciones corrspondientes 
        // se implementa el metodo descuento en la clase bebida porque la idea es que en verano exista el 10% de d3escuento en las bebidas 

        Ticket ticketCompra = new Ticket(camareroAsignado, cliente);

        Boolean pidiendo = true;

        while (pidiendo) {
            System.out.println("\n--- CARTA DE LA CAFETERÍA ---");
            System.out.println("Bebidas a 10% de descuento por verano ");

            for (int i = 0; i < carta.size(); i++) {
                Producto p = carta.get(i);
                System.out.println((i + 1) + ". " + p.getNombre() + " - " + p.getPrecio() + "€");
            }

            System.out.println("0. Terminar pedido y ver ticket");
            System.out.print("Seleccione qué desea añadir (0-" + carta.size() + "): ");

            int opcionProd = sc.nextInt();
            sc.nextLine();

            if (opcionProd == 0) {
                pidiendo = false;

            } else if (opcionProd > 0 && opcionProd <= carta.size()) {
                Producto seleccionado = carta.get(opcionProd - 1);

                ticketCompra.agregarProducto(seleccionado);
                System.out.println("-> Añadido: " + seleccionado.getNombre());

            } else {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }

        // finalmente se muestra el ticket y se cierra el scanner

        ticketCompra.mostrarTicket();

        sc.close();

        // Nota aclaratoria: se que en el enunciado no indicaba que el usuario tenia que introducir los datos sin embargo hacerlo de esta manera
        // me parecio mas comodo para definir la informacion de acuerdo a como se puediera dar el caso en la vida real =D
    }
}