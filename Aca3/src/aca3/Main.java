/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aca3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Farmacia;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Sucursal;
import modelo.Validacion;
import vista.Vista;

/**
 *
 * @author leonel.borja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Conexion cx = new Conexion();
        Vista vista = new Vista();
        Validacion val = new Validacion();
        double aumentoPrecio;
        double totalcompra;
        double subTotalCompra = 0;
        double totalIVA;
        double valorIVA = 0.19;
        double valorAumentado;
        double totalAumentado;

        List<Farmacia> farmacias = new ArrayList<>();
        List<Sucursal> sucursales = new ArrayList<>();
        List<Producto> productos = new ArrayList<>();
        List<Proveedor> proveedores = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        //Crear la farmacia
//        Farmacia farmacia = new Farmacia("Farmacia de Pociones Mágicas", "123456789", "www.farmaciapocionesmagicas.com", "info@farmaciapocionesmagicas.com", 0, 0, 0);
//
//        // Agregar instancias estáticas de farmacias a la lista
//        farmacias.add(farmacia);
//
//        // Agregar instancias estáticas de sucursales a la lista
//        sucursales.add(new Sucursal("Farmacia de Pociones Mágicas", "123456789", "www.farmaciapocionesmagicas.com", "info@farmaciapocionesmagicas.com", 0, 0, 0, "Bogotá", "Sucursal de Pociones en Bogotá", "Calle de las Pociones 123", "555-1234", 0, 0, 0, 0.44));
//        sucursales.add(new Sucursal("Farmacia de Pociones Mágicas", "123456789", "www.farmaciapocionesmagicas.com", "info@farmaciapocionesmagicas.com", 0, 0, 0, "Medellín", "Sucursal de Pociones en Medellín", "Calle de las Pociones 456", "555-5678", 0, 0, 0, 0.38));
//        sucursales.add(new Sucursal("Farmacia de Pociones Mágicas", "123456789", "www.farmaciapocionesmagicas.com", "info@farmaciapocionesmagicas.com", 0, 0, 0, "Cartagena", "Sucursal de Pociones en Cartagena", "Avenida de las Pociones 789", "555-6789", 0, 0, 0, 0.35));
//        sucursales.add(new Sucursal("Farmacia de Pociones Mágicas", "123456789", "www.farmaciapocionesmagicas.com", "info@farmaciapocionesmagicas.com", 0, 0, 0, "Cali", "Sucursal de Pociones en Cali", "Calle de las Pociones 101", "555-1122", 0, 0, 0, 0.35));
//        sucursales.add(new Sucursal("Farmacia de Pociones Mágicas", "123456789", "www.farmaciapocionesmagicas.com", "info@farmaciapocionesmagicas.com", 0, 0, 0, "Barranquilla", "Sucursal de Pociones en Barranquilla", "Avenida de las Pociones 222", "555-3344", 0, 0, 0, 0.30));
//
//        // Agregar instancias estáticas de productos a la lista
//        productos.add(new Producto("001", "Poción Curativa", "Restaura la salud mágica", "Ingredientes curativos", 100));
//        productos.add(new Producto("002", "Elixir de Fortaleza", "Aumenta la resistencia mágica", "Hierbas fortificantes", 150));
//        productos.add(new Producto("003", "Antídoto Venenoso", "Neutraliza venenos mágicos", "Ingredientes antitóxicos", 80));
//        productos.add(new Producto("004", "Poción de Sueño Profundo", "Induce un sueño reparador", "Hierbas somníferas", 120));
//        productos.add(new Producto("005", "Poción Revitalizante", "Revitaliza la energía mágica", "Ingredientes energizantes", 70));
//        productos.add(new Producto("006", "Elixir de Clarividencia", "Mejora la percepción mágica", "Hierbas visionarias", 140));
//        productos.add(new Producto("007", "Poción Calmante", "Calma los nervios mágicos", "Ingredientes relajantes", 90));
//        productos.add(new Producto("008", "Elixir del Tiempo", "Ajusta la percepción temporal", "Ingredientes temporales", 110));
//        productos.add(new Producto("009", "Poción Resplandeciente", "Ilumina la oscuridad mágica", "Ingredientes luminiscentes", 60));
//        productos.add(new Producto("010", "Elixir de Serenidad", "Promueve la calma interior", "Hierbas tranquilizadoras", 130));
//
//        // Agregar instancias estáticas de proveedores a la lista
//        proveedores.add(new Proveedor("Farmacia Mágica", "123456789", "www.farmaciamagica.com", "info@farmaciamagica.com", "Bogotá", "Calle Encantada 456", "555-4321"));
//        proveedores.add(new Proveedor("Hechizos Farmacéuticos", "987654321", "www.hechizosfarmaceuticos.com", "info@hechizosfarmaceuticos.com", "Medellín", "Calle Mística 678", "555-8765"));
//        proveedores.add(new Proveedor("FarmaEncanto", "456789012", "www.farmaencanto.com", "info@farmaencanto.com", "Cartagena", "Avenida Mágica 987", "555-9876"));
//        proveedores.add(new Proveedor("CaliMagia Salud", "789012345", "www.calimagiasalud.com", "info@calimagiasalud.com", "Cali", "Calle Magistral 10", "555-2211"));
//        proveedores.add(new Proveedor("PharmaMística", "012345678", "www.pharmamistica.com", "info@pharmamistica.com", "Barranquilla", "Av Encantadora Pequeña 123", "555-4433"));
//
//        // Agregar instancias estáticas de clientes a la lista
//        clientes.add(new Cliente("Harry Potter", "123456789", "harry@mail.com", "Bogotá", "Calle Mágica 22 # 14-24", "300 1234567"));
//        clientes.add(new Cliente("Hermione Granger", "987654321", "hermione@mail.com", "Medellín", "Av Hechizo 1ra # 25-5", "310 2345678"));
//        clientes.add(new Cliente("Ron Weasley", "456789012", "ron@mail.com", "Cartagena", "Cra Encantada 5 # 8-85", "320 3456789"));
//        clientes.add(new Cliente("Albus Dumbledore", "789012345", "albus@mail.com", "Cali", "Calle Magistral 30 # 12-45", "300 4567890"));
//        clientes.add(new Cliente("Luna Lovegood", "012345678", "luna@mail.com", "Barranquilla", "Av Mística Circunvalar # 40-20", "310 5678901"));
//
//        cx.guardarFarmaciasCSV(farmacias);
//        cx.guardarSucursalesCSV(sucursales);
//        cx.guardarProductosCSV(productos);
//        cx.guardarProveedoresCSV(proveedores);
//        cx.guardarClientesCSV(clientes);


        //se inicializa la variable que recibira la respuesta del usuario
        int opcion;

        // se crea el metodo do while para garantizar la ejecucion dl menu por lo menos una vez el 
        //el cual no poermitira valores errados 
        do {

            // se pide la opcion con base al menu que se muestra y dependiendo de la respuesta 
            opcion = vista.mostrarMenu();

            //se activa el switch case
            switch (opcion) {
                case 0:
                    // Lógica para ver información de sede o sucursal
                    sucursales = cx.cargarSucursalesCSV();
                    List<String> ciudades = new ArrayList<>();
                    for (Sucursal sucursal : sucursales) {
                        ciudades.add(sucursal.getCiudad());
                    }
                    int sucursal = vista.mostrarMenuSucursales(ciudades);
                    vista.mostrarInformacionSucursal(sucursales.get(sucursal));
                    break;
                case 1:
                    // Lógica para ver información de los productos 
                    productos = cx.cargarProductosCSV();
                    List<String> nombresProductos = new ArrayList<>();
                    for (Producto producto : productos) {
                        nombresProductos.add(producto.getNombre());
                    }
                    int producto = vista.mostrarMenuProductos(nombresProductos);
                    vista.mostrarInformacionProducto(productos.get(producto));
                    break;
                case 2:
                    // Lógica para consultar proveedores disponibles
                    proveedores = cx.cargarProveedoresCSV();
                    List<String> nombresProveedores = new ArrayList<>();
                    for (Proveedor proveedor : proveedores) {
                        nombresProveedores.add(proveedor.getNombreProveedor());
                    }
                    int proveedor = vista.mostrarMenuProveedores(nombresProveedores);
                    vista.mostrarInformacionProveedor(proveedores.get(proveedor));
                    break;
                case 3:
                    // Lógica para consultar clientes disponibles                    
                    clientes = cx.cargarClientesCSV();
                    List<String> nombresClientes = new ArrayList<>();
                    for (Cliente cliente : clientes) {
                        nombresClientes.add(cliente.getNombre());
                    }
                    int cliente = vista.mostrarMenuClientes(nombresClientes);
                    vista.mostrarInformacionCliente(clientes.get(cliente));
                    break;
                case 4:
                    // Lógica para registrar venta                    
                    clientes = cx.cargarClientesCSV();
                    productos = cx.cargarProductosCSV();
                    sucursales = cx.cargarSucursalesCSV();
                    farmacias = cx.cargarFarmaciasCSV();
                    Cliente clienteCompra;
                    Sucursal sucursalCompra = null;
                    List<Producto> productosComprados = new ArrayList<>();
                    List<String> nombresClientesCompra = new ArrayList<>();
                    for (Cliente clienteCompras : clientes) {
                        nombresClientesCompra.add(clienteCompras.getNombre());
                    }
                    int idClienteCompra = vista.mostrarMenuClientes(nombresClientesCompra);
                    clienteCompra = clientes.get(idClienteCompra);
                    for (Sucursal suc : sucursales) {
                        if (suc.getCiudad().equalsIgnoreCase(clienteCompra.getCiudad())) {
                            sucursalCompra = suc;
                            break;
                        }
                    }
                    int numeroInteraciones = val.validarEntero("Ingrese la cantidad de articulos a agregar, ingrese un valor numerico");
                    for (int i = 0; i < numeroInteraciones; i++) {
                        List<String> nombresProductosComprados = new ArrayList<>();
                        for (Producto productoComprados : productos) {
                            nombresProductosComprados.add(productoComprados.getNombre());
                        }
                        int idProductoComprado = vista.mostrarMenuProductos(nombresProductosComprados);
                        Producto productoComprado = productos.get(idProductoComprado);
                        productoComprado.setCantidadProducto(val.validarEntero("Ingrese la cantidad de producto que va a comprar, ingrese un valor numerico"));
                        subTotalCompra += productoComprado.getPrecio() * productoComprado.getCantidadProducto();

                        productosComprados.add(productoComprado);
                    }
                    totalIVA = subTotalCompra * valorIVA;
                    totalcompra = subTotalCompra + totalIVA;
                    aumentoPrecio = sucursalCompra.getAumentoPrecio();
                    valorAumentado = totalcompra * aumentoPrecio;
                    totalAumentado = valorAumentado + totalcompra;
                    String productoMostardo = "CODIGO, NOMBRE, CANTIDAD, PRECIO, TOTAL " + "\n";
                    for (Producto prod : productosComprados) {
                        productoMostardo += prod.getCodigo() + ", ";
                        productoMostardo += prod.getNombre() + ", ";
                        productoMostardo += prod.getCantidadProducto() + ", ";
                        productoMostardo += prod.getPrecio() + ", ";
                        productoMostardo += prod.getCantidadProducto() * prod.getPrecio() + "\n";
                    }
                    vista.mostrarInformacionCompra(clienteCompra, productoMostardo, subTotalCompra, totalIVA, totalcompra, aumentoPrecio, valorAumentado, totalAumentado);
                    for (int i = 0; i < farmacias.size(); i++) {

                        Farmacia farma = farmacias.get(i);
                        farma.setCantidadClientesAtendidosNacional(farma.getCantidadClientesAtendidosNacional() + 1);
                        farma.setCantidadProductoVendidoNacional(farma.getCantidadProductoVendidoNacional() + numeroInteraciones);
                        farma.setTotalVentasNacional(farma.getTotalVentasNacional() + totalAumentado);
                        farmacias.set(i, farma);
                        cx.guardarFarmaciasCSV(farmacias);

                    }
                    for (int i = 0; i < sucursales.size(); i++) {
                        Sucursal suc = sucursales.get(i);
                        suc.setCantidadClientesAtendidosNacional(suc.getCantidadClientesAtendidosNacional() + 1);
                        suc.setCantidadProductoVendidoNacional(suc.getCantidadProductoVendidoNacional() + numeroInteraciones);
                        suc.setTotalVentasNacional(suc.getTotalVentasNacional() + totalAumentado);
                        sucursales.set(i, suc);
                        if (suc.getCiudad().equalsIgnoreCase(clienteCompra.getCiudad())) {
                            suc.setCantidadClientesAtendidosSucursal(suc.getCantidadClientesAtendidosSucursal() + 1);
                            suc.setCantidadProductoVendidoSucursal(suc.getCantidadProductoVendidoSucursal() + numeroInteraciones);
                            suc.setTotalVentasSucursal(suc.getTotalVentasSucursal() + totalAumentado);
                            sucursales.set(i, suc);
                        }
                    }
                    cx.guardarSucursalesCSV(sucursales);
                    break;
                case 5:
                    // Lógica para la salida del programa  
                    sucursales = cx.cargarSucursalesCSV();
                    farmacias = cx.cargarFarmaciasCSV();
                    String sucursalMostarda = "";
                    for (Sucursal suc : sucursales) {
                        sucursalMostarda += "La " + suc.getNombreSucursal() + " vendio " + suc.getCantidadProductoVendidoSucursal() + " Productos" + "\n";
                        sucursalMostarda += "La " + suc.getNombreSucursal() + " atendio  " + suc.getCantidadClientesAtendidosSucursal() + " Clientes" + "\n";
                        sucursalMostarda += "La " + suc.getNombreSucursal() + " tuvo ventas por  " + suc.getTotalVentasSucursal() + " Pesos" + "\n";
                    }
                    String farmaciaMostarda = "";
                    for (Farmacia farma : farmacias) {
                        farmaciaMostarda += "La " + farma.getNombreFarmacia() + " vendio " + farma.getCantidadProductoVendidoNacional() + " Productos" + "\n";
                        farmaciaMostarda += "La " + farma.getNombreFarmacia() + " atendio  " + farma.getCantidadClientesAtendidosNacional() + " Clientes" + "\n";
                        farmaciaMostarda += "La " + farma.getNombreFarmacia() + " tuvo ventas por  " + farma.getTotalVentasNacional() + " Pesos" + "\n";
                    }
                    vista.mostrarInformacionSalida(sucursalMostarda, farmaciaMostarda);
                    JOptionPane.showMessageDialog(null, " ¡¡ Gracias por utilizar el sistema !!");

                    break;
                default:
                    // valor por defecto para que no se permitan ingresos erronos 
                    JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, ingrese una opción válida.");
            }

        } // se mantiene en el ciclo siempre y cuando se cumpla la condicion de que la opcion no sea 5
        while (opcion != 5);
    }

}
