public class Cliente {
private Strign nombre;
private String apellido;
private String telefono;
public Strign getNombre() {
    return nombre;
}
public void setNombre(Strign nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public String getTelefono() {
    return telefono;
}
public void setTelefono(String telefono) {
    this.telefono = telefono;
}
public Cliente(Strign nombre, String apellido, String telefono) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
}

// Modificar el orden de este metodo para que pueda imprimir acorde al ticket
@Override
public String toString() {
    return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
}



}
