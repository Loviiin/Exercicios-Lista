package Lista1;
public class Ex6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int z = 3;
        int h = 4;

        int soma1 = (x + y);
        int mult2 = (z*h);
        if(soma1 > mult2){
            System.out.println(" A + B > C*D");
        }
        else if (mult2>soma1){
            System.out.println("C*D > A + B");
        }
        else{
            System.out.println("é igual");
        }
    }
    
}
