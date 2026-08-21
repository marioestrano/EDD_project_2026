public class Producto {
private String nombre;
private Float precio;
private String categoria;
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Float getPrecio() {
    return precio;
}
public void setPrecio(Float precio) {
    this.precio = precio;
}
public String getCategoria() {
    return categoria;
}
public void setCategoria(String categoria) {
    this.categoria = categoria;
}

public Producto(String nombre, Float precio, String categoria) {
    this.nombre = nombre;
    this.precio = precio;
    this.categoria = categoria;
}

// Modificar el orden de este metodo para que pueda imprimir acorde al ticket
@Override
public String toString() {
    return "Producto [nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + "]";
}



}
