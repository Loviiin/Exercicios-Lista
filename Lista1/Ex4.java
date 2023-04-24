package Lista1;
public class Ex4 {
    public static void main(String[] args) {
        int x = 15;
        if(x < 10){
            System.out.println(x + " É menor que 10");
        }
        else{
            System.out.println(x + " É maior que 10");
        }
    }
}

/*Complementar ao if/else temos o operador else if. Esse recurso possibilita adicionar uma nova condição à estrutura de decisão para atender a lógica sendo implementada.

Sintaxe do if/else com else if:

if (expressão booleana 1) {
    // bloco de código 1
} else if (expressão booleana 2) {
    // bloco de código 2
} else {
    // bloco de código 3
}
Dessa forma, se a expressão booleana 1 for verdadeira, o bloco de código 1 será executado. Caso seja falsa, o bloco de código 1 será ignorado e será testada a expressão booleana 2. Se ela for verdadeira, o bloco de código 2 será executado. Caso contrário, o programa vai ignorar esse bloco de código e executar o bloco 3, declarado dentro do else.

Podemos utilizar quantos else if forem necessários. Entretanto, o else deve ser adicionado apenas uma vez, como alternativa ao caso de todos os testes terem falhado.
 */
