/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonel.borja
 */
public class Conexion {

    private static final String ARCHIVO_PRODUCTO_CSV = "productos.csv";
    private static final String ARCHIVO_PROVEEDOR_CSV = "prooveedor.csv";
    private static final String ARCHIVO_CLIENTE_CSV = "clientes.csv";
    private static final String ARCHIVO_SUCURSAL_CSV = "sucursal.csv";
    private static final String ARCHIVO_FARMACIA_CSV = "farmacias.csv";

    public void guardarProductosCSV(List<Producto> productos) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_PRODUCTO_CSV))) {
            // Escribir encabezados
            writer.println("Codigo,Nombre,Descripcion,ComponentesBase,Precio");

            // Escribir datos
            for (Producto producto : productos) {
                writer.println(
                        producto.getCodigo() + ","
                        + producto.getNombre() + ","
                        + producto.getDescripcion() + ","
                        + producto.getComponentesBase() + ","
                        + producto.getPrecio()
                );
            }

            System.out.println("Productos guardados correctamente en " + ARCHIVO_PRODUCTO_CSV);
        } catch (IOException e) {
            System.err.println("Error al guardar productos en CSV: " + e.getMessage());
        }
    }

    // Método para cargar una lista de objetos Producto desde un archivo CSV
    public List<Producto> cargarProductosCSV() {
        List<Producto> productos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_PRODUCTO_CSV))) {
            String linea;
            // Saltar la primera línea (encabezados)
            reader.readLine();

            while ((linea = reader.readLine()) != null) {
                String[] valores = linea.split(",");
                Producto producto = new Producto(
                        valores[0],
                        valores[1],
                        valores[2],
                        valores[3],
                        Double.parseDouble(valores[4])
                );
                productos.add(producto);
            }

            System.out.println("Productos cargados correctamente desde " + ARCHIVO_PRODUCTO_CSV);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al cargar productos desde CSV: " + e.getMessage());
        }

        return productos;
    }

    // Método para guardar una lista de objetos Proveedor en un archivo CSV
    public void guardarProveedoresCSV(List<Proveedor> proveedores) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_PROVEEDOR_CSV))) {
            // Escribir encabezados
            writer.println("NombreProveedor,NIT,PaginaWeb,Correo,Ciudad,Direccion,Telefono");

            // Escribir datos
            for (Proveedor proveedor : proveedores) {
                writer.println(
                        proveedor.getNombreProveedor() + ","
                        + proveedor.getNit() + ","
                        + proveedor.getPaginaWeb() + ","
                        + proveedor.getCorreo() + ","
                        + proveedor.getCiudad() + ","
                        + proveedor.getDireccion() + ","
                        + proveedor.getTelefono()
                );
            }

            System.out.println("Proveedores guardados correctamente en " + ARCHIVO_PROVEEDOR_CSV);
        } catch (IOException e) {
            System.err.println("Error al guardar proveedores en CSV: " + e.getMessage());
        }
    }

    // Método para cargar una lista de objetos Proveedor desde un archivo CSV
    public List<Proveedor> cargarProveedoresCSV() {
        List<Proveedor> proveedores = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_PROVEEDOR_CSV))) {
            String linea;
            // Saltar la primera línea (encabezados)
            reader.readLine();

            while ((linea = reader.readLine()) != null) {
                String[] valores = linea.split(",");
                Proveedor proveedor = new Proveedor(
                        valores[0],
                        valores[1],
                        valores[2],
                        valores[3],
                        valores[4],
                        valores[5],
                        valores[6]
                );
                proveedores.add(proveedor);
            }

            System.out.println("Proveedores cargados correctamente desde " + ARCHIVO_PROVEEDOR_CSV);
        } catch (IOException e) {
            System.err.println("Error al cargar proveedores desde CSV: " + e.getMessage());
        }

        return proveedores;
    }

    // Método para guardar datos en el archivo CSV
    public void guardarClientesCSV(List<Cliente> clientes) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_CLIENTE_CSV))) {
            // Escribir encabezados
            writer.println("Nombre,Identificacion,Correo,Ciudad,Direccion,Telefono");

            // Escribir datos
            for (Cliente cliente : clientes) {
                writer.println(
                        cliente.getNombre() + ","
                        + cliente.getIdentificacion() + ","
                        + cliente.getCorreo() + ","
                        + cliente.getCiudad() + ","
                        + cliente.getDireccion() + ","
                        + cliente.getTelefono()
                );
            }

            System.out.println("Clientes guardados correctamente en " + ARCHIVO_CLIENTE_CSV);
        } catch (IOException e) {
            System.err.println("Error al guardar clientes en CSV: " + e.getMessage());
        }
    }

    // Método para cargar datos desde el archivo CSV
    public List<Cliente> cargarClientesCSV() {
        List<Cliente> clientes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CLIENTE_CSV))) {
            String linea;
            // Saltar la primera línea (encabezados)
            reader.readLine();

            while ((linea = reader.readLine()) != null) {
                String[] valores = linea.split(",");
                Cliente cliente = new Cliente(
                        valores[0],
                        valores[1],
                        valores[2],
                        valores[3],
                        valores[4],
                        valores[5]
                );
                clientes.add(cliente);
            }

            System.out.println("Clientes cargados correctamente desde " + ARCHIVO_CLIENTE_CSV);
        } catch (IOException e) {
            System.err.println("Error al cargar clientes desde CSV: " + e.getMessage());
        }

        return clientes;
    }

    // Método para guardar datos en el archivo CSV
    public void guardarSucursalesCSV(List<Sucursal> sucursales) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_SUCURSAL_CSV))) {
            // Escribir encabezados
            writer.println("NombreFarmacia;NIT;PaginaWeb;Correo;CantidadProductoVendidoNacional;CantidadClientesAtendidosNacional;TotalVentasNacional;Ciudad;NombreSucursal;Direccion;Telefono;"
                    + "CantidadProductoVendidoSucursal;CantidadClientesAtendidosSucursal;TotalVentasSucursal;AumentoPrecio");

            // Escribir datos
            for (Sucursal sucursal : sucursales) {
                writer.println(
                        sucursal.getNombreFarmacia() + ";"
                        + sucursal.getNit() + ";"
                        + sucursal.getPaginaWeb() + ";"
                        + sucursal.getCorreo() + ";"
                        + sucursal.getCantidadProductoVendidoNacional() + ";"
                        + sucursal.getCantidadClientesAtendidosNacional() + ";"
                        + sucursal.getTotalVentasNacional() + ";"
                        + sucursal.getCiudad() + ";"
                        + sucursal.getNombreSucursal() + ";"
                        + sucursal.getDireccion() + ";"
                        + sucursal.getTelefono() + ";"
                        + sucursal.getCantidadProductoVendidoSucursal() + ";"
                        + sucursal.getCantidadClientesAtendidosSucursal() + ";"
                        + sucursal.getTotalVentasSucursal() + ";"
                        + sucursal.getAumentoPrecio()
                );
            }

            System.out.println("Sucursales guardadas correctamente en " + ARCHIVO_SUCURSAL_CSV);
        } catch (IOException e) {
            System.err.println("Error al guardar sucursales en CSV: " + e.getMessage());
        }
    }

    // Método para cargar datos desde el archivo CSV
    public List<Sucursal> cargarSucursalesCSV() {
        List<Sucursal> sucursales = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_SUCURSAL_CSV))) {
            String linea;
            // Saltar la primera línea (encabezados)
            reader.readLine();

            while ((linea = reader.readLine()) != null) {
                String[] valores = linea.split(";");
                Sucursal sucursal;
                sucursal = new Sucursal(
                        valores[0],
                        valores[1],
                        valores[2],
                        valores[3],
                        Integer.parseInt(valores[4]),
                        Integer.parseInt(valores[5]),
                        Double.parseDouble(valores[6]),
                        valores[7],
                        valores[8],
                        valores[9],
                        valores[10],
                        Integer.parseInt(valores[11]),
                        Integer.parseInt(valores[12]),
                        Double.parseDouble(valores[13]),
                        Double.parseDouble(valores[14])
                );
                sucursales.add(sucursal);
            }

            System.out.println("Sucursales cargadas correctamente desde " + ARCHIVO_SUCURSAL_CSV);
        } catch (IOException e) {
            System.err.println("Error al cargar sucursales desde CSV: " + e.getMessage());
        }

        return sucursales;
    }

    // Método para guardar datos de farmacias en el archivo CSV
    public void guardarFarmaciasCSV(List<Farmacia> farmacias) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_FARMACIA_CSV))) {
            // Escribir encabezados
            writer.println("NombreFarmacia;NIT;PaginaWeb;Correo;CantidadProductoVendidoNacional;CantidadClientesAtendidosNacional;TotalVentasNacional");

            // Escribir datos
            for (Farmacia farmacia : farmacias) {
                writer.println(
                        farmacia.getNombreFarmacia() + ";"
                        + farmacia.getNit() + ";"
                        + farmacia.getPaginaWeb() + ";"
                        + farmacia.getCorreo() + ";"
                        + farmacia.getCantidadProductoVendidoNacional() + ";"
                        + farmacia.getCantidadClientesAtendidosNacional() + ";"
                        + farmacia.getTotalVentasNacional()
                );
            }

            System.out.println("Farmacias guardadas correctamente en " + ARCHIVO_FARMACIA_CSV);
        } catch (IOException e) {
            System.err.println("Error al guardar farmacias en CSV: " + e.getMessage());
        }
    }

    // Método para cargar datos de farmacias desde el archivo CSV
    public List<Farmacia> cargarFarmaciasCSV() {
        List<Farmacia> farmacias = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_FARMACIA_CSV))) {
            String linea;
            // Saltar la primera línea (encabezados)
            reader.readLine();

            while ((linea = reader.readLine()) != null) {
                String[] valores = linea.split(";");
                Farmacia farmacia = new Farmacia(
                        valores[0],
                        valores[1],
                        valores[2],
                        valores[3],
                        Integer.parseInt(valores[4]),
                        Integer.parseInt(valores[5]),
                        Double.parseDouble(valores[6])
                );
                farmacias.add(farmacia);
            }

            System.out.println("Farmacias cargadas correctamente desde " + ARCHIVO_FARMACIA_CSV);
        } catch (IOException e) {
            System.err.println("Error al cargar farmacias desde CSV: " + e.getMessage());
        }

        return farmacias;
    }
}
