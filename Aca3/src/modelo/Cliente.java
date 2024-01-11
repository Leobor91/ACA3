/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leonel.borja
 */
public class Cliente {

    private String nombre;
    private String identificacion;
    private String correo;
    private String ciudad;
    private String direccion;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String identificacion, String correo, String ciudad, String direccion, String telefono) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre Del Cliente: ").append(nombre).append("\n");
        sb.append("Identificacion Del Cliente: ").append(identificacion).append("\n");
        sb.append("Correo Del Cliente: ").append(correo).append("\n");
        sb.append("Ciudad Del Cliente: ").append(ciudad).append("\n");
        sb.append("Direccion Del Cliente: ").append(direccion).append("\n");
        sb.append("Telefono Del Cliente: ").append(telefono).append("\n");
        sb.append("\n");
        return sb.toString();
    }

}
