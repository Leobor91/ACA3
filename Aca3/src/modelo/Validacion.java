/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

public class Validacion {

    // Método de validación de número entero 
    //este recibe un texto dependiendo de donde se invoque de le mensaje acorde
    public int validarEntero(String texto) {

        int numero = 0;
        boolean entradaValida = false;
        String input = JOptionPane.showInputDialog(texto);

        do {

            try {
                // Intentamos convertir la cadena a un entero
                numero = Integer.parseInt(input);
                entradaValida = true; // Si la conversión es exitosa, marcamos la entrada como válida
            } catch (NumberFormatException e) {
                // En caso de excepción, la entrada no es un número entero
                input = JOptionPane.showInputDialog("Error: Ingreso un dato no valido. Ingrese un valor numerico ");

            }

        } while (!entradaValida); // Repetimos el bucle hasta que se ingrese un dato válido

        return numero;
    }

//    public double validarDouble() {
//        double numeroDouble = 0;
//        boolean entradaValida = false;
//
//        do {
//           
//
//            try {
//                // Intentamos convertir la cadena a un número double
//                numeroDouble = Double.parseDouble(input);
//                entradaValida = true; // Si la conversión es exitosa, marcamos la entrada como válida
//            } catch (NumberFormatException e) {
//                // En caso de excepción, la entrada no es un número double
//                System.out.println("Error: Ingrese un numero decimal valido.");
//            }
//
//        } while (!entradaValida); // Repetimos el bucle hasta que se ingrese un dato válido
//
//        return numeroDouble;
//    }
//
//    public int validar() {
//
//        int numero = 0;
//        boolean entradaValida = false;
//
//        do {
//
//            String input = entrada.next();
//
//            try {
//                // Intentamos convertir la cadena a un entero
//                numero = Integer.parseInt(input);
//                entradaValida = true; // Si la conversión es exitosa, marcamos la entrada como válida
//            } catch (NumberFormatException e) {
//                // En caso de excepción, la entrada no es un número entero
//                System.out.println("Error: Ingrese un Numero valido ");
//
//            }
//
//        } while (!entradaValida); // Repetimos el bucle hasta que se ingrese un dato válido
//
//        return numero;
//    }
}
