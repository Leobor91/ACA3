/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Sucursal;

/**
 *
 * @author leonel.borja
 */
public class Vista {

    // se crea para mostrar el menu original o principal
    public int mostrarMenu() {
        String[] opciones = {
            "Ver información de sede o sucursal",
            "Consultar productos disponibles",
            "Consultar proveedores disponibles",
            "Consultar clientes disponibles",
            "Registrar Venta",
            "Salir del Menú"
        };

        return JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Menú",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    }

    // y se ghacen metodos que muetren la informacion partiendo de cada objeto 
    public int mostrarMenuSucursales(List<String> sucursales) {

        String[] opciones = sucursales.toArray(String[]::new);

        return JOptionPane.showOptionDialog(
                null,
                "Seleccione una Sucursal:",
                "Ver información de sede o sucursal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    }

    public void mostrarInformacionSucursal(Sucursal sucursal) {
        String mensaje = sucursal.toString();

        JOptionPane.showMessageDialog(null, mensaje, "Información de la Sucursal", JOptionPane.INFORMATION_MESSAGE);
    }

    public int mostrarMenuProductos(List<String> productos) {
        String[] opciones = productos.toArray(String[]::new);

        return JOptionPane.showOptionDialog(
                null,
                "Seleccione un Producto: ",
                "Ver información de los Productos disponibles",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    }

    public void mostrarInformacionProducto(Producto producto) {
        String mensaje = producto.toString();

        JOptionPane.showMessageDialog(null, mensaje, "Informacion del Producto", JOptionPane.INFORMATION_MESSAGE);
    }

    public int mostrarMenuProveedores(List<String> proveedores) {
        String[] opciones = proveedores.toArray(String[]::new);

        return JOptionPane.showOptionDialog(
                null,
                "Seleccione un Proveedor: ",
                "Ver información de los  Proveedores disponibles",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    }

    public void mostrarInformacionProveedor(Proveedor proveedor) {
        String mensaje = proveedor.toString();

        JOptionPane.showMessageDialog(null, mensaje, "Informacion del Proveedor", JOptionPane.INFORMATION_MESSAGE);
    }

    public int mostrarMenuClientes(List<String> clientes) {
        String[] opciones = clientes.toArray(String[]::new);

        return JOptionPane.showOptionDialog(
                null,
                "Seleccione un Cliente: ",
                "Ver información de los  Clientes disponibles",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );
    }

    public void mostrarInformacionCliente(Cliente cliente) {
        String mensaje = cliente.toString();

        JOptionPane.showMessageDialog(null, mensaje, "Informacion del Proveedor", JOptionPane.INFORMATION_MESSAGE);
    }

    // se crean estos metodos para mostrar informacion ordenada con base al requerimiento 
    public void mostrarInformacionCompra(Cliente cliente, String texto, double subTotalCompra, double totalIVA, double totalcompra, double aumento, double valorAumentado, double totalAumentado) {
        String mensaje = cliente.toString()
                + "*********************************************************************************************"
                + "\n" + texto + "\n"
                + "*********************************************************************************************"
                + "\n" + "El subtotal de la compra es: " + subTotalCompra
                + "\n" + "El total del IVA es: " + totalIVA
                + "\n" + "El total de la compra es: " + totalcompra
                + "\n" + "El valor aumentado segun la ciudad es: " + aumento * 100 + "%"
                + "\n" + "El costo del aumento segun la ciudad es: " + valorAumentado
                + "\n" + "El total mas el aumentado segun la ciudad es: " + totalAumentado;

        JOptionPane.showMessageDialog(null, mensaje, "Informacion de la Compra", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarInformacionSalida(String sucursalMostarda, String farmaciaMostarda) {
        String mensaje = "*********************************************************************************************"
                + "\n" + "La Informacion de facturacion discriminada por sucursal es: " + "\n"
                + sucursalMostarda + "\n"
                + "*********************************************************************************************"
                + "\n" + "La Informacion de facturacion de la farmacia es: " + "\n"
                + farmaciaMostarda + "\n"
                + "*********************************************************************************************"
                + "\n";

        JOptionPane.showMessageDialog(null, mensaje, "Informacion de la de salida", JOptionPane.INFORMATION_MESSAGE);
    }
}
