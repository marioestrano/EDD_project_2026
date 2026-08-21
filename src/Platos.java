public class Bebidas extends Producto implements Descontable {

    private String tipoBebida;

    public Bebidas(String nombre, Float precio, String categoria, String tipoBebida) {
        super(nombre, precio, categoria);
        this.tipoBebida = tipoBebida;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        double cantidadDescontada = (getPrecio() * porcentaje) / 100;

        return getPrecio() - cantidadDescontada;
    }

    @Override
    public String toString() {
        return getCategoria() + " " + getNombre() + " " + tipoBebida + " " + getPrecio() + "€ ";
    }

}
