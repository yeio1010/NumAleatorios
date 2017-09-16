/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numaleatorioss;

//import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yulian Imbachi - Edisson Alonso
 */
public class AleaLineal {


    protected void ObtenerAleaLineal(){

        int metod = 1;
        int semilla = 0;
        int multipli = 0;
        int aditi_const = 0;
        int mod = 0;
        String auxiliar = "";

        boolean ban = false;

        //Captura de los datos iniciales para comenzar con la simulación  
        while (ban == false) {

            auxiliar = JOptionPane.showInputDialog("Digite la semilla (Xo): ");

            try {
                semilla = Integer.parseInt(auxiliar);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite un valor de semilla valido!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            if (metod == 1) {
                if (semilla != 0) {
                    ban = true;
                } else {
                    JOptionPane.showMessageDialog(null, "La semilla debe ser mayor a cero!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } 
        }

        ban = false;
        while (ban == false) {

            auxiliar = JOptionPane.showInputDialog("Digite el multiplo (a): ");

            try {
                multipli = Integer.parseInt(auxiliar);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite un valor valido!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            if (multipli != 0) {
                ban = true;
            } else {
                JOptionPane.showMessageDialog(null, "El multipli debe ser mayor a cero!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (metod == 1) {
            ban = false;
            while (ban == false) {

                auxiliar = JOptionPane.showInputDialog("Digite la constante (b): ");
                try {
                    aditi_const = Integer.parseInt(auxiliar);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite un valor valido!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

                if (aditi_const != 0) {
                    ban = true;
                } else {
                    JOptionPane.showMessageDialog(null, "La constante aditiva debe ser mayor a cero!!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            aditi_const = 0;
        }

        ban = false;
        while (ban == false) {
            auxiliar = JOptionPane.showInputDialog("Digite el modulo (m): ");

            try {
                mod = Integer.parseInt(auxiliar);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite un valor valido!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            if (mod > semilla && mod > multipli && mod > aditi_const) {
                ban = true;
            } else {
                JOptionPane.showMessageDialog(null, "El modulo (m) debe ser mayor a: (Xo) y (a)!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

        System.out.print("\n");

        //Se generan los numeros aleatorios a partir de los datos ingresados por el usuario
        System.out.println("+-------------------------------------+");
        GenerarAleatorios(semilla, multipli, aditi_const, mod);
        System.out.print("\n");

       

    }// fin Obtener datos

    protected void GenerarAleatorios(int semilla, int multipli, int constante, int mod) {

        if (constante == 0) {
            System.out.println("n\t " + "x(n)\t " + "a*x(n)\t " + "[a*x(n)] mod m");
        }
        if (constante > 0) {
            System.out.println("n\t " + "x(n)\t " + "a*x(n)+c\t " + "[a*x(n)+c] mod m");
        }

        int a = multipli;
        int c = constante;
        int m = mod;
        int result_mod;
        int terc_col;
        int x = 0;
        boolean j = false;
        int n;

        for (n = 0; j == false; n++) {

            if (n == 0) {

                terc_col = ((semilla * a) + c);
                x = terc_col % m;
                System.out.println(n + "\t " + semilla + "\t " + terc_col + "\t\t " + x);

            } else if (n > 0) {
                terc_col = ((x * a) + c);
                result_mod = (terc_col % m);
                System.out.println(n + "\t " + x + "\t " + terc_col + "\t\t " + result_mod);
                x = result_mod;
            }

            if (x == semilla) {
                break;
            }

        }

        System.out.print("\n");
        
        JOptionPane.showMessageDialog(null, "A continuacion el resultado:");

        System.out.println("+------------------------------------+");
        System.out.println("Periodo: " + (n + 1));
        System.out.println("+------------------------------------+");

    }//fin GenerarAleatorios

}//fin clase Aleatorios
