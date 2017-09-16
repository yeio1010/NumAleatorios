/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numaleatorioss;
import FuncionesAleatorio.Funciones;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yulian Imbachi Ome - Edisson Alonso Orduña
 */
public class NumAleatorioss {

    /**
     * @param args the command line arguments
     */
    void NumAlea() {
        // TODO code application logic here
        int n=0, aux=0;
        double [] s=new double[5],u= new double[5];
        
        System.out.println("Digite el valor semilla\n");
        Scanner leer= new Scanner(System.in);
        int d =leer.nextInt();
        
        s[0]=d;
        while(aux< 4){
            n++;
            s[n]=Funciones.FuncionCambio(s[n-1]);
            u[n-1]=Funciones.FuncionSalida(s[n]); 
            aux++;
    }
    System.out.println("\nLos numeros Aleatorios generados son:\n");
     System.out.println(Arrays.toString(s) + "\n"+ Arrays.toString(u)+"\n");
}
}