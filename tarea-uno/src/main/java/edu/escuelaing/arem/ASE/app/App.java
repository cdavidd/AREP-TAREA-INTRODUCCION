package edu.escuelaing.arem.ASE.app;

import edu.escuelaing.arem.ASE.app.calculos.Estadistica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.text.DecimalFormat;
//import java.util.List;

import edu.escuelaing.arem.ASE.app.model.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        DecimalFormat df = new DecimalFormat("#.00");
        
        LinkedList<Double> numeros = new LinkedList<Double>();
        File datos = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            datos = new File(args[0]);
            fr = new FileReader (datos);
            br = new BufferedReader(fr);

            String linea;
            double n;
            while((linea=br.readLine())!=null){
                //System.out.println(linea);
                n = Double.parseDouble(linea);
                numeros.add(n);
            }
            
            String resmean = df.format(Estadistica.mean(numeros));
            String resstdDev = df.format(Estadistica.stdDev(numeros));
            System.out.println("Mean "+resmean);
            System.out.println("Std.Dev "+resstdDev);

        }catch(Exception e){
            System.out.println("Error");
        }


    }
}
