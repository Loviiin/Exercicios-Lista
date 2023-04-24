package Lista2;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int par = 0; int imp = 0; int pos = 0; int neg = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Informe 10 valores");
            int x = scanner.nextInt();

            if (x % 2 == 0){
                par++;
            }
            else{
                imp++;
            }
        if (x > 0){
            pos++;
        }
        else{
            neg++;
        }
    }
    System.out.println("Total de números pares: " + par);
    System.out.println("Total de números ímpares: " + imp);
    System.out.println("Total de números positivos: " + pos);
    System.out.println("Total de números negativos: " + neg);
}
}
/*
 Explicação:

O programa começa criando um objeto Scanner para ler dados do usuário.
Em seguida, o programa cria 4 variáveis inteiras (pares, impares, positivos e negativos) para armazenar o número de valores que são pares, ímpares, positivos e negativos, respectivamente. Todas essas variáveis são inicializadas com zero.
O programa usa um loop for para pedir ao usuário que digite 10 números inteiros. A cada iteração do loop, o programa lê um número do usuário e verifica se ele é par ou ímpar e se é positivo ou negativo, atualizando as variáveis correspondentes.
Por fim, o programa imprime na tela o resultado encontrado para cada contagem.
 */
    

