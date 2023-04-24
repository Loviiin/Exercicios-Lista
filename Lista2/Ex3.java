package Lista2;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        String sexo = scanner.next();

        double pesoIdeal;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Sexo inválido!");
            return;
        }

        System.out.printf("O peso ideal para uma pessoa do sexo %s e altura %.2fm é %.2fkg.\n",
                sexo, altura, pesoIdeal);
    }
}
