import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Qual o seu salário");
        int salario = x.nextInt();
        int novosalario = 0;
        if(salario<= 300 ){
        novosalario = salario+(salario/2);
        System.out.println(novosalario);
        }
        else{
        novosalario = salario+(salario*30)/100;
        System.out.println(novosalario);
        }  
    }    
}
/* The Scanner class is used to get user input, and it is found in the java.util package.

To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. In our example, we will use the nextLine() method, which is used to read Strings:

ExampleGet your own Java Server
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort()	Reads a short value from the user
*/
