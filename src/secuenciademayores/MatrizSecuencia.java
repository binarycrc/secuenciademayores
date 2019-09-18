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
    private int[] arrCelda;
    private int intMinimo;
    private int intMaximo;

    public void setintTamano(int tam) { intTamano = tam; }
    public void setMatrizSecuencia() { mxSecuencia = new int[intTamano][intTamano]; }
    public void setintMinimo(int min) { intMinimo = min; }
    public void setintMaximo(int max) { intMaximo = max; }

    public int getintTamano() { return intTamano; }
    public int getintMinimo() { return intMinimo; }
    public int getintMaximo() { return intMaximo; }

    public void LlenaMatriz() {
        if (intTamano > 0) {
            Random intRandom = new Random();
            int intAleatorio = 0;
            int i = 0; //filas
            int j = 0; //columnas
            for (i = 0; i < mxSecuencia.length; i++) {//filas
                for (j = 0; j < mxSecuencia[i].length; j++) {//columnas
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
            for (j = 0; j < mxSecuencia[i].length; j++) {//columnas
                strLinea = strLinea + " " + mxSecuencia[i][j];
            }
            strLinea = strLinea + "\n";
        }
        System.out.println(strLinea);
        System.out.println("******************************");
    }
    
    public void Secuencia(int i, int j) {
        if ((i< mxSecuencia[j].length-1) && (j< mxSecuencia[i].length-1)){
            arrCelda = new int[4];
            int ii = i;
            int jj = j;
            arrCelda[0]=mxSecuencia[i][j]; //origen
            arrCelda[1]=mxSecuencia[i][j+1]; //derecha
            arrCelda[2]=mxSecuencia[i+1][j+1]; //diagonal
            arrCelda[3]=mxSecuencia[i+1][j]; //derecha
            if (arrCelda[1] > arrCelda[2]) {
                if (arrCelda[1] > arrCelda[3]) {
                    System.out.println("El mayor es: " + arrCelda[1]+" siguiente: "+ String.valueOf(i) +","+String.valueOf(j+1));
                    ii = i;
                    jj = j+1;
                } else {
                    System.out.println("el mayor es: " + arrCelda[3]+" siguiente: "+ String.valueOf(i+1) +","+String.valueOf(j));
                    ii = i+1;
                    jj = j;
                }
            } else if (arrCelda[2] > arrCelda[3]) {
                System.out.println("el mayor es: " + arrCelda[2]+" siguiente: "+ String.valueOf(i+1) +","+String.valueOf(j+1));
                ii = i+1;
                jj = j+1;
            } else {
                System.out.println("el mayor es: " + arrCelda[3]+" siguiente: "+ String.valueOf(i+1) +","+String.valueOf(j));
                ii = i+1;
                jj = j;
            }
            mxSecuencia[i][j] = 0;
            ImprimeMatriz();
            Secuencia(ii,jj);
        }else{
            mxSecuencia[i][j] = 0;
            ImprimeMatriz();
        }
        
    }
}
