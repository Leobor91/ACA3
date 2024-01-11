/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leonel.borja
 */
public class Sucursal extends Farmacia {

    private String ciudad;
    private String nombreSucursal;
    private String direccion;
    private String telefono;
    private int cantidadProductoVendidoSucursal;
    private int cantidadClientesAtendidosSucursal;
    private double totalVentasSucursal;
    private double aumentoPrecio;

    public Sucursal() {
    }

    public Sucursal(String nombreFarmacia, String nit,
            String paginaWeb, String correo, int cantidadProductoVendidoNacional, int cantidadClientesAtendidosNacional,
            double totalVentasNacional, String ciudad, String nombreSucursal, String direccion, String telefono, int cantidadProductoVendidoSucursal,
            int cantidadClientesAtendidosSucursal, double totalVentasSucursal, double aumentoPrecio) {
        super(nombreFarmacia, nit, paginaWeb, correo, cantidadProductoVendidoNacional, cantidadClientesAtendidosNacional, totalVentasNacional);
        this.ciudad = ciudad;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidadProductoVendidoSucursal = cantidadProductoVendidoSucursal;
        this.cantidadClientesAtendidosSucursal = cantidadClientesAtendidosSucursal;
        this.totalVentasSucursal = totalVentasSucursal;
        this.aumentoPrecio = aumentoPrecio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadProductoVendidoSucursal() {
        return cantidadProductoVendidoSucursal;
    }

    public void setCantidadProductoVendidoSucursal(int cantidadProductoVendidoSucursal) {
        this.cantidadProductoVendidoSucursal = cantidadProductoVendidoSucursal;
    }

    public int getCantidadClientesAtendidosSucursal() {
        return cantidadClientesAtendidosSucursal;
    }

    public void setCantidadClientesAtendidosSucursal(int cantidadClientesAtendidosSucursal) {
        this.cantidadClientesAtendidosSucursal = cantidadClientesAtendidosSucursal;
    }

    public double getTotalVentasSucursal() {
        return totalVentasSucursal;
    }

    public void setTotalVentasSucursal(double totalVentasSucursal) {
        this.totalVentasSucursal = totalVentasSucursal;
    }

    public double getAumentoPrecio() {
        return aumentoPrecio;
    }

    public void setAumentoPrecio(double aumentoPrecio) {
        this.aumentoPrecio = aumentoPrecio;
    }

    @Override
    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    @Override
    public void setNombreFarmacia(String nombreFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
    }

    @Override
    public String getNit() {
        return nit;
    }

    @Override
    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String getPaginaWeb() {
        return paginaWeb;
    }

    @Override
    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int getCantidadProductoVendidoNacional() {
        return cantidadProductoVendidoNacional;
    }

    @Override
    public void setCantidadProductoVendidoNacional(int cantidadProductoVendidoNacional) {
        this.cantidadProductoVendidoNacional = cantidadProductoVendidoNacional;
    }

    /**
     *
     * @return
     */
    @Override
    public int getCantidadClientesAtendidosNacional() {
        return cantidadClientesAtendidosNacional;
    }

    @Override
    public void setCantidadClientesAtendidosNacional(int cantidadClientesAtendidosNacional) {
        this.cantidadClientesAtendidosNacional = cantidadClientesAtendidosNacional;
    }

    @Override
    public double getTotalVentasNacional() {
        return totalVentasNacional;
    }

    @Override
    public void setTotalVentasNacional(double totalVentasNacional) {
        this.totalVentasNacional = totalVentasNacional;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Ciudad: ").append(ciudad).append("\n");
        sb.append("Nombre Sucursal: ").append(nombreSucursal).append("\n");
        sb.append("Direccion: ").append(direccion).append("\n");
        sb.append("Telefono: ").append(telefono).append("\n");
        sb.append("\n");
        return sb.toString();
    }

}
