/*class Media{
    public static float media(Float x,Float y, Float z, Float h) {
        return (x+y+z+h)/4;     
    }
}


Criar classe para calcular a média mas não sei fazer operador aritmédico
*/
public class Ex8 {
    public static void main(String[] args) {
        float x = 10;
        float y = 2;
        float z = 3;
        float h = 6;
        //System.out.println(Media.media(x, y, z, h));
        float idademedia = (x+y+z+h) / 4;

        if(idademedia>7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}


/*
class Metodo3{

	String nome = "João Silva";

	public String retornaNome()
	{
		return nome;
	}
}

public class Metodo_Com_Retorno {

	public static void main(String[] args) {

		Metodo3 m3 = new Metodo3();
		System.out.println(m3.retornaNome());

	}

}
class ValoresInt
{
	public int calculadora()
	{
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;
	}
}

public class Metodo_Com_Retorno_Inteiro {

	public static void main(String[] args) {

		ValoresInt valores = new ValoresInt();

		System.out.print(valores.calculadora());
	}
}
Listagem 8. Exemplo de método que retorna um inteiro
Com isso finalizamos este artigo cujo objetivo foi apresentar, de forma básica, a utilização de métodos na linguagem Java. Foi explicado é feita a declaração dos vários tipos de métodos e como invocá-los posteriormente.
 */




