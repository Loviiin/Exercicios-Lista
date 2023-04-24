package Lista2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
        System.out.println("digite a primeira nota");
        double nota1 = x.nextDouble();
        System.out.println("digite a segunda nota");
        double nota2 = x.nextDouble();
        System.out.println("digite a terceira nota");
        double nota3 = x.nextDouble();
        System.out.println("A media aritmédica é  "+ mediaartm(nota1, nota2, nota3));
        System.out.println("A media ponderada é  "+ mediapond(nota1, nota2, nota3));
        }
    }


    public static double mediaartm(double nota1, double nota2,double nota3){
        return(nota1+nota2+nota3)/3;
    }
    public static double mediapond(double nota1, double nota2,double nota3){
        return ((nota1*6) + (nota2*2) + (nota3*2))/10;
    }
}
