package Lista1;
public class Ex2 {
    public static void main(String[] args) {
        String x="Guilherme";
        int y = 0;
        //nomedoLoop:
        //for(inicialização;condição;alteração da variavel){
        //comando    
        //}
        //EX:
        /*public class loopForMarcado {  
            public static void main(String[] args) {  
              xx:  
                   for(int i = 1; i <= 3; i++) {  
                      yy:  
                            for(int j = 1; j <= 3; j++) {  
        
                               if(i == 2 && j == 2) {  
                                  break xx;  
                               }  
                                System.out.println(i + " " + j);  
                             }  
                    }  
             }  
        }
        Aqui neste exemplo, temos um Loop For marcado, funcionando como um loop dentro de outro. Repare no nome que damos aos loops, “xx” e “yy”.
        A saída do código apresentado será a seguinte:

        1 1
        1 2
        1 3
        2 1*/
        for (y= 0;y < 1000 ; y++){
            System.out.println(x);
        }  
    }
}
