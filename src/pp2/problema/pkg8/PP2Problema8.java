/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema.pkg8;
import java.util.*;

/**
 *
 * @author Enano
 */
public class PP2Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double [] cat;
        //Resolucion
        cat = getInf(); //Se reciben los 2 catetos en un arreglo.
        print(calc(cat));
    }
        public static double[] getInf () //Se recibe la información
    {
        double[] cat = new double [2];
        Scanner in = new Scanner (System.in);
        System.out.println("**** Bienvenid@ al programa ****");
        System.out.println("Ingrese el valor del primer cateto:");
        cat[0]=in.nextDouble();
        System.out.println("Ingrese el valor del segundo cateto:");
        cat[1]=in.nextDouble();
        return cat;
    }
    public static double calc (double[] cat)
    {
        double hip;                                           //Se elevan los catetos al cuadrado
        hip=Math.sqrt(Math.pow(cat[0],2)+Math.pow(cat[1],2)); //Y se saca la raíz de la suma de ambos
        return hip;                                           //Según la formula.
    }
    public static void print (double hip)//Se imprime
    {
        System.out.println("La hipotenusa del triángulo es: "+hip);
    }
}
