/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciademayores;

import java.util.Scanner;

/**
 *
 * @author Binarycrc
 */
public class LeerPorRango {
    private int intMinimo;
    private int intMaximo;
    public int intNumero;
    
    private String strPregunta;
    private String strError;
    
    public void setintMinimo(int min){ intMinimo = min; }
    public void setintMaximo(int max){ intMaximo = max; }

    public void setstrPregunta(String strPreg){ strPregunta = strPreg; }
    public void setstrError(String strErr){ strError = strErr; }

    public int getintMinimo(){return intMinimo; }
    public int getintMaximo(){return intMaximo; }

    public void intLeer() { 
        //tomado de: https://www.dokry.com/590
	Scanner scan = new Scanner(System.in); 
	int number = 0; //Ejecute una vez y realice un bucle hasta que la entrada esté dentro del rango especificado.
	do { 
            //Imprimir mensaje de usuario. 
            System.out.printf("\n%s > ", strPregunta); 
            //Evite que la entrada de cadena bloquee el programa. 
            while (!scan.hasNextInt()) { 
                    System.out.printf(strError); 
                    System.out.printf("\n%s > ", strPregunta); 
                    scan.next(); 
            } 
            number = scan.nextInt(); //Establece el número.
            //Si el número está fuera del rango, imprima un mensaje de error. 
            if (number < getintMinimo() || number > getintMaximo()) 
                System.out.printf(strError);
	} while (number < getintMinimo() || number > getintMaximo()); 
        intNumero = number; 
    }
}
