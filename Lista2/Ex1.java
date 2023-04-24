package Lista2;
import java.util.Scanner; 

public class Ex1 {
    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
        System.out.println("Escreva o valor em Metros");
        double metros = x.nextDouble();
        System.out.println("O valor em centímetros é " + metros*100);  
        System.out.println(metrodcm(metros));
        System.out.println(metros*1000);
    }
}


    public static double metrodcm(double metros){
        return metros*10;
    }
}
