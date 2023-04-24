package Lista2;
import java.util.Scanner;

public class Ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor do trabalho");
        double trab = scanner.nextDouble();
        System.out.println("Qual o valor da prova");
        double prov = scanner.nextDouble();
        System.out.println(Nota.nota(prov, trab));
}
}

class Prova{
    public static double media(double prov){
        return (prov*70)/100;
    }
}
class Trabalho{
    public static double mediadois(double trab){
        return (trab*30)/100;
    }
}
class Nota{
    public static double nota(double prov , double trab){
        return (Prova.media(prov) + Trabalho.mediadois(trab));
    }
}
