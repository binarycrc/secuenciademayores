/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciademayores;

import java.util.Random;

/**
 *
 * @author Binarycrc
 */
public class MatrizSecuencia {

    private int intTamano = 1;
    public int[][] mxSecuencia;
    private int intMinimo;
    private int intMaximo;

    public void setintTamano(int tam) {
        intTamano = tam;
        mxSecuencia = new int[intTamano][intTamano];
    }
    public void setMatrizSecuencia() {
        mxSecuencia = new int[intTamano][intTamano];
    }

    public void setintMinimo(int min) {
        intMinimo = min;
    }

    public void setintMaximo(int max) {
        intMaximo = max;
    }

    public int getintTamano() {
        return intTamano;
    }

    public int getintMinimo() {
        return intMinimo;
    }

    public int getintMaximo() {
        return intMaximo;
    }

    public void LlenaMatriz() {
        if (intTamano > 0) {
            Random intRandom = new Random();
            int intAleatorio = 0;
            int i = 0; //filas
            int j = 0; //columnas
            for (i = 0; i < mxSecuencia.length; i++) {//filas
                for (j = 0; j < mxSecuencia.length; j++) {//columnas
                    //asignacion de numero aleatorio 
                    //java.util.Random.nextInt(int n) : 
                    //The nextInt(int n) is used to get a random number 
                    //between 0(inclusive) and 
                    //the number passed in this argument(n), exclusive.                    
                    do {
                        intAleatorio = intRandom.nextInt(intMaximo+1);
                    } while (intAleatorio < getintMinimo() || intAleatorio > getintMaximo());
                    mxSecuencia[i][j] = intAleatorio;
                }
            }

        }
    }

    public void ImprimeMatriz() {
        int i = 0; //filas
        int j = 0; //columnas
        String strLinea = "";
        for (i = 0; i < mxSecuencia.length; i++) {//filas
            for (j = 0; j < mxSecuencia.length; j++) {//columnas
                strLinea = strLinea + " " + mxSecuencia[i][j];
            }
            strLinea = strLinea + "\n";
        }
        System.out.println(strLinea);
    }
}
