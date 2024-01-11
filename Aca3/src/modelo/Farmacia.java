/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leonel.borja
 */
// se crea la clase farmacia
public class Farmacia {

    // se declaran los atributos 
    protected String nombreFarmacia;
    protected String nit;
    protected String paginaWeb;
    protected String correo;
    protected int cantidadProductoVendidoNacional;
    protected int cantidadClientesAtendidosNacional;
    protected double totalVentasNacional;

    // se crean colos contructores se crean dos dependiendo de la nesecidad
    public Farmacia() {
    }

    public Farmacia(String nombreFarmacia, String nit, String paginaWeb, String correo, int cantidadProductoVendidoNacional, int cantidadClientesAtendidosNacional, double totalVentasNacional) {
        this.nombreFarmacia = nombreFarmacia;
        this.nit = nit;
        this.paginaWeb = paginaWeb;
        this.correo = correo;
        this.cantidadProductoVendidoNacional = cantidadProductoVendidoNacional;
        this.cantidadClientesAtendidosNacional = cantidadClientesAtendidosNacional;
        this.totalVentasNacional = totalVentasNacional;
    }

    //se crean los metodos setter and getter los cuases se usan para almacenar la informacion y para expornela 
    // para su tratamiento respectivamente
    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    public void setNombreFarmacia(String nombreFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
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

    public int getCantidadProductoVendidoNacional() {
        return cantidadProductoVendidoNacional;
    }

    public void setCantidadProductoVendidoNacional(int cantidadProductoVendidoNacional) {
        this.cantidadProductoVendidoNacional = cantidadProductoVendidoNacional;
    }

    public int getCantidadClientesAtendidosNacional() {
        return cantidadClientesAtendidosNacional;
    }

    public void setCantidadClientesAtendidosNacional(int cantidadClientesAtendidosNacional) {
        this.cantidadClientesAtendidosNacional = cantidadClientesAtendidosNacional;
    }

    public double getTotalVentasNacional() {
        return totalVentasNacional;
    }

    public void setTotalVentasNacional(double totalVentasNacional) {
        this.totalVentasNacional = totalVentasNacional;
    }

    // se crea el metodo toString el cual se utuliza pata organizar la informacion quie se muestra en pantalla
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombreFarmacia).append("\n");
        sb.append("Nit: ").append(nit).append("\n");
        sb.append("Pagina Web: ").append(paginaWeb).append("\n");
        sb.append("Correo: ").append(correo).append("\n");
        return sb.toString();
    }

}
