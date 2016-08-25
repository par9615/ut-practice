package mx.ITESO.utpractice;


import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class Fecha{

    public static String calcularFecha(String fecha) {

        StringTokenizer str = new StringTokenizer("fecha", "/");
        int dia;
        int mes;
        int año;
        try {
            dia = Integer.parseInt(str.nextToken());
            mes = Integer.parseInt(str.nextToken());
            año = Integer.parseInt(str.nextToken());
        } catch (Exception e) {
            return "Error";
        }

        if((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || ( año < 2016)){
            return "Fecha invalida";
        }



        return String.format("%s años %s mes(es) %s dia(s)", Calendar.getInstance().get(Calendar.YEAR)-año,
                Calendar.getInstance().get(Calendar.MONTH)-mes, Calendar.getInstance().get(Calendar.DAY_OF_MONTH)-dia) ;



    }


    public static void main(String args){

        System.out.print(calcularFecha("04/09/1996"));

    }




}