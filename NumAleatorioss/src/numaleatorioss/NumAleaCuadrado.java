/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numaleatorioss;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 *
 * @author Yulian Imbachi - Edisson Alonso
 */
public class NumAleaCuadrado {
    
    static void NumCuadr(){
        
        DecimalFormat dc = new DecimalFormat("#.####");
        
        int numr = 0;
        int cuadrnum = 0;
        int longitud = 0;
        int divi = 0;
        double NumAlea = 0;
        String aux = "";
        String cadena = "";
        String subCadena = "";
        
        aux = JOptionPane.showInputDialog("Ingrese el número Semilla: ");
        numr = Integer.parseInt(aux);
        
        cuadrnum = numr * numr;
        
        cadena = String.valueOf(cuadrnum);
        
        longitud = cadena.length();
        divi = longitud / 2;
        int n;
        boolean j = false;
        
        for (longitud = 0; j == false; longitud++) {
        
        if(longitud < 4){
            System.out.println("Con la semilla ingresada no es posible realizar la operación.");
        } else if (longitud == 4){
            subCadena = cadena.substring(0,3);
            NumAlea = Integer.parseInt(subCadena) / 10000;
            System.out.println(longitud+"Número aleatorio es:" + NumAlea);            
            //JOptionPane.showMessageDialog(null,"Número aleatorio es: "+NumAlea);
        } else if (longitud > 4){
            subCadena = cadena.substring(divi-2, divi+2);
            NumAlea = Double.parseDouble(subCadena) / 10000;
            System.out.println(longitud+"Número aleatorio es:" +dc.format(NumAlea));            
            //JOptionPane.showMessageDialog(null,"Número aleatorio es: "+dc.format(NumAlea));
        }
        
    }
        System.out.println("Periodo: " + (longitud + 1));
        }
    
}
