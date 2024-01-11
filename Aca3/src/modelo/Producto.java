/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leonel.borja
 */
public class Producto {

    private String codigo;
    private String nombre;
    private String descripcion;
    private String componentesBase;
    private double precio;
    private int cantidadProducto;

    public Producto() {
    }

    public Producto(String codigo, String nombre, String descripcion, String componentesBase, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.componentesBase = componentesBase;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComponentesBase() {
        return componentesBase;
    }

    public void setComponentesBase(String componentesBase) {
        this.componentesBase = componentesBase;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codigo Del Producto: ").append(codigo).append("\n");
        sb.append("Nombre Del Producto: ").append(nombre).append("\n");
        sb.append("Descripcion Del Producto: ").append(descripcion).append("\n");
        sb.append("Componentes Base Del Producto: ").append(componentesBase).append("\n");
        sb.append("Precio Del Producto: ").append(precio).append("\n");
        sb.append("\n");
        return sb.toString();
    }

}
