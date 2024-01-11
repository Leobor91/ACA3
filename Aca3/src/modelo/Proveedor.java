/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leonel.borja
 */
public class Proveedor {

    private String nombreProveedor;
    private String nit;
    private String paginaWeb;
    private String correo;
    private String ciudad;
    private String direccion;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(String nombreProveedor, String nit, String paginaWeb, String correo, String ciudad, String direccion, String telefono) {
        this.nombreProveedor = nombreProveedor;
        this.nit = nit;
        this.paginaWeb = paginaWeb;
        this.correo = correo;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
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
        sb.append("Nombre Del Proveedor: ").append(nombreProveedor).append("\n");
        sb.append("Nit del Proveedor: ").append(nit).append("\n");
        sb.append("Pagina Web del Proveedor: ").append(paginaWeb).append("\n");
        sb.append("Correo del Proveedor: ").append(correo).append("\n");
        sb.append("Ciudad del Proveedor: ").append(ciudad).append("\n");
        sb.append("Direccion del Proveedor: ").append(direccion).append("\n");
        sb.append("Telefono del Proveedor: ").append(telefono).append("\n");
        sb.append("\n");
        return sb.toString();
    }

}
