/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciademayores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo Ugalde
 */

public class SecuenciaDeMayores {
   
    public static void main(String[] args) {
        // TODO code application logic here
        LeerPorRango intLeerPorRango = new LeerPorRango();
        intLeerPorRango.setintMinimo(3);
        intLeerPorRango.setintMaximo(10);
        intLeerPorRango.setstrPregunta("Por favor introduzca el tamaño de la matriz cuadrada [3 a 10]:");
        intLeerPorRango.setstrError("La entrada no coincide con las especificaciones. Trate de nuevo.");
        intLeerPorRango.intLeer();
        int intTamano = intLeerPorRango.intNumero;
        
        MatrizSecuencia mxPrincipal = new MatrizSecuencia();
        mxPrincipal.setintTamano(intTamano);
        mxPrincipal.setMatrizSecuencia();
        mxPrincipal.setintMinimo(1);
        mxPrincipal.setintMaximo(9);
        mxPrincipal.LlenaMatriz();
        mxPrincipal.ImprimeMatriz();

    }
}
