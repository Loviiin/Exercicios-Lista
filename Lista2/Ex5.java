package Lista2;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor");
        int valor = scanner.nextInt();
        System.out.println("Qual outro valor");
        int valor2 = scanner.nextInt();
        System.out.println("Qual outro valor");
        int valor3 = scanner.nextInt();

        int maior = 0;

        if (valor > maior){
            maior = valor;
        }
        if (valor2>valor){
            maior = valor2;
        }
        if (valor3>maior){
            maior = valor3;
        }
        System.out.println(maior);
        

    }
    
}
