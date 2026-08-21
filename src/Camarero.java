public class Camarero {
private String nombre;
private String codigoEmpleado;
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getCodigoEmpleado() {
    return codigoEmpleado;
}
public void setCodigoEmpleado(String codigoEmpleado) {
    this.codigoEmpleado = codigoEmpleado;
}
public Camarero(String nombre, String codigoEmpleado) {
    this.nombre = nombre;
    this.codigoEmpleado = codigoEmpleado;
}

// Modificar el orden de este metodo para que pueda imprimir acorde al ticket
@Override
public String toString() {
    return "Camarero [nombre=" + nombre + ", codigoEmpleado=" + codigoEmpleado + "]";
}


}
