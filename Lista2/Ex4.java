package Lista2;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o lado");
        int lado = scanner.nextInt();
        System.out.println("Qual a altura");
        int altura = scanner.nextInt();

        int area = lado*altura;
        System.out.println(area);

        
    }
    
}
