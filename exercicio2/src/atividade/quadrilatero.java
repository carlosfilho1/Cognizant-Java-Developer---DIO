package atividade;

//Cria uma aplicação que calcula a area dos 3 quadriláteros notáveis: Quadrado, Retangulo e Trapezio.
// Obs: Use sobrecarga.

public class quadrilatero {

    public static void area(double lado){
        System.out.println("A area do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("A area do retangulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("A area do trapezio: " + ((baseMaior + baseMenor) * altura) / 2);
    }



}
