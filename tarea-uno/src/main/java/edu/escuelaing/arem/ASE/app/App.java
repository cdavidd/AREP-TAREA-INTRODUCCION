package edu.escuelaing.arem.ASE.app;

import java.text.DecimalFormat;
import java.util.List;

import edu.escuelaing.arem.ASE.app.model.LinkedList;

/**
 * Hello world!
 *
 */
public class App {

    private static double promedio;

    public static double mean(List<Double> datos) {
        double cont = 0;
        for (double n : datos) {
            cont += n;
        }
        promedio = cont /= datos.size();
        return promedio;
    }

    public static double stdDev(List<Double> datos) {
        int size = datos.size();
        double cont = 0;

        for (double n : datos) {
            cont += Math.pow((n - promedio), 2);
        }
        cont /= (size - 1);
        return Math.sqrt(cont);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DecimalFormat df = new DecimalFormat("#.00");

        LinkedList<Double> datos = new LinkedList<Double>();
        datos.add(15.0);
        datos.add(69.9);
        datos.add(6.5);
        datos.add(22.4);
        datos.add(28.4);
        datos.add(65.9);
        datos.add(19.4);
        datos.add(198.7);
        datos.add(38.8);
        datos.add(138.2);
        String resmean = df.format(mean(datos));
        String resstdDev = df.format(stdDev(datos));
        System.out.println(resmean);
        System.out.println(resstdDev);
    }
}
